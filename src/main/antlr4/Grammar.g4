grammar Grammar;

@header {
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Collections;
}

@members {
    static FileWriter writer;
    public static void startFile() {
        try {
            writer = new FileWriter("OutputGrammar.g4");
            writer.write("grammar OutputGrammar;\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String text) {
        try {
            if (writer != null) {
                writer.write(text + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

start:
    { startFile(); }
    s_section l_section EOF
    { closeFile(); };

s_section:
    S_START s_rule+ S_END;

s_rule:
    S_TOKEN EQUAL s_expr ';'
    {
        String ruleName = $S_TOKEN.text.replaceAll("[<>]", "");
        writeToFile(ruleName.toLowerCase() + " : " + $s_expr.value + ";");
    };

s_expr returns [String value]:
    e1=s_seq (e2=s_expr_aux)? {
        $value = $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    };

s_seq returns [String value]:
    e1=s_term (e2=s_seq)? {
        $value = $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    }
    | { $value = ""; };

s_expr_aux returns [String value]:
    '|' e1=s_seq (e2=s_expr_aux)? {
        $value = "| " + $e1.value;
        if ($e2.value != null && !$e2.value.isEmpty()) {
            $value += " " + $e2.value.trim();
        }
    }
    | { $value = ""; };

s_term returns [String value]:
    S_TOKEN { $value = $S_TOKEN.text.replaceAll("[<>]", ""); }
    | L_TOKEN { $value = $L_TOKEN.text.replaceAll("[<>]", ""); }
    | CHAR { $value = $CHAR.text; }
    | s_group { $value = $s_group.value; };

s_group returns [String value]:
    '(' e=s_expr ')' { $value = "(" + $e.value + ")"; }
    | '[' e=s_expr ']' { $value = "(" + $e.value + ")?"; }
    | '{' e=s_expr '}' { $value = "(" + $e.value + ")+"; };

l_section:
    L_START l_rule+ L_END;

l_rule:
    L_TOKEN EQUAL l_reg_exp ';'
    {
        String tokenName = $L_TOKEN.text.replaceAll("[<>]", "");
        writeToFile(tokenName.toUpperCase() + " : " + $l_reg_exp.value + ";");
    };

l_reg_exp returns [String value]:
   (l_atom l_quant?)+ {
       if ($l_quant.text != null) {
           String q = $l_quant.text;
           if (q.matches("\\{\\d+,\\d+\\}")) {  // Caso {m,n}
               String[] bounds = q.replaceAll("[{}]", "").split(",");
               int min = Integer.parseInt(bounds[0]);
               int max = Integer.parseInt(bounds[1]);
               if (max > min) {
                   $value = String.join(" ", Collections.nCopies(min, $l_atom.value)) +
                            String.join(" ", Collections.nCopies(max - min, "(" + $l_atom.value + ")?"));
               } else {
                   $value = String.join(" ", Collections.nCopies(min, $l_atom.value));
               }
           } else if (q.matches("\\{\\d+,\\}")) {  // Caso {m,}
               int min = Integer.parseInt(q.replaceAll("[{}]", "").split(",")[0]);
               $value = String.join(" ", Collections.nCopies(min, $l_atom.value)) + " " + $l_atom.value + "*";
           } else if (q.matches("\\{\\d+\\}")) {  // Caso {m}
               int count = Integer.parseInt(q.replaceAll("[{}]", ""));
               $value = String.join(" ", Collections.nCopies(count, $l_atom.value));
           } else {
               $value = $l_atom.value + q; // ?, +, *
           }
       } else {
           $value = $l_atom.value;
       }
   };

l_quant returns [String value]:
    QUANTIFICATORE
        | '{' CIFRA+ (',' CIFRA*)? '}';



l_atom returns [String value]:
    LETTERA { $value = "'" + $LETTERA.text + "'"; }
    | CIFRA { $value = "'" + $CIFRA.text + "'"; }
    | METACHAR { $value = "'" + $METACHAR.text + "'"; }
    | SHORTCUT { $value = "'" + $SHORTCUT.text + "'"; }
    | '_' { $value = "'_'"; }
    | '[' '^'? (l_interval | (LETTERA | CIFRA | METACHAR | '_'))+ ']' { $value = $text; }
    | '(' (l_atom l_quant?)+ ('|' l_atom l_quant?)* ')' { $value = $text; };

l_interval:
    (LETTERA '-' LETTERA) | (CIFRA '-' CIFRA);

L_START: 'LEXER_START';
L_END: 'LEXER_END';
L_TOKEN: '<' [A-Z_]+ '>';
S_START: 'PARSER_START';
S_END: 'PARSER_END';
S_TOKEN: '<' [a-z_]+ '>';
CHAR: '\'' ~['\r\n] '\'';
QUANTIFICATORE: '?' | '+' | '*';
LETTERA: [a-zA-Z];
CIFRA: [0-9];
METACHAR: '\\' ~[a-zA-Z0-9_];
SHORTCUT: '\\' [dDwWsS];
EQUAL: '::=';
WS: [ \t\r\n]+ -> skip;
