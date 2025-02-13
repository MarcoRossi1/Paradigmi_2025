grammar Grammar;

start:
    s_section l_section EOF;

s_section:
    S_START s_rule+ S_END;

s_rule:
    NON_TERM EQUAL s_expr ';';

s_expr:
    e1=s_seq (e2=s_expr_aux)?;

s_seq:
    e1=s_term (e2=s_seq)?;

s_expr_aux:
    '|' e1=s_seq (e2=s_expr_aux)?;

s_term:
    e=s_atom | s_brackets_atom;

s_atom:
    NON_TERM | TERM | S_CHAR | '(' e=s_expr ')';

s_brackets_atom:
    '[' e=s_atom ']'
    | '{' e=s_atom '}'
    | '{' '[' e=s_atom ']' '}'
    | '[' '{' e=s_atom '}' ']';

l_section:
    L_START l_rule+ L_END;

l_rule:
    TERM EQUAL l_reg_exp ';';

l_reg_exp:
    (part1=l_reg_exp_part)+ ('|' (part2=l_reg_exp_part)+ )*;

l_reg_exp_part:
    l_atom l_quant?;

l_quant:
    '{' cifra1=CIFRA+ (',' cifra2=CIFRA+)? '}'
    {
        int min = Integer.parseInt($cifra1.text);
        int max = Integer.parseInt($cifra2.text);
        if (min > max) {
            System.err.println("Errore: Quantificatore non valido {" + min + "," + max + "}: il primo numero non può essere maggiore del secondo.");
        }
    }
    | QUANTIFICATORE;

l_atom:
    l_simple_atom | l_atom_group ;

l_simple_atom:
    CHAR | CIFRA | ESCAPE | METACHAR | SHORTCUT
    | '[' '^'? (l_interval | CHAR | CIFRA | ESCAPE | METACHAR)+ ']';

l_atom_group:
    '(' s1=l_reg_exp ')';

l_interval:
    (char1=(CHAR|CIFRA) '-' char2=(CHAR|CIFRA))
    {
        char startChar = $char1.text.charAt(0);
        char endChar = $char2.text.charAt(0);
        if (startChar > endChar) {
            System.err.println("Errore: Intervallo non valido '" + startChar + "-" + endChar + "': il primo carattere deve avere un valore ASCII minore o uguale al secondo.");
        }
    };

L_START: 'LEXER_START';
L_END: 'LEXER_END';
TERM: '<' [A-Z][A-Z_]* '>';
S_START: 'PARSER_START';
S_END: 'PARSER_END';
NON_TERM: '<' [a-z][a-z_]* '>';
S_CHAR: '\'' ~['\r\n] '\'';
QUANTIFICATORE: '?' | '+' | '*';
CIFRA: [0-9];
CHAR: [a-zA-Z_];
METACHAR: '\\' ~[a-zA-Z0-9_];
SHORTCUT: '\\' [dDwWsS];
ESCAPE: '\\' [trn];
EQUAL: '::=';
WS: [ \t\r\n]+ -> skip;
