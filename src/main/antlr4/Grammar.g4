grammar Grammar;

start:
    l_section s_section EOF;

s_section:
    S_START s_rule+ S_END;

s_rule:
    S_TOKEN EQUAL s_expr ';';

s_expr:
    s_term+ ('|' s_term+)*;

s_term:
    S_TOKEN | L_TOKEN | CHAR | s_group;

s_group:
    '(' s_expr ')' | '[' s_expr ']' | '{' s_expr '}';

l_section:
    L_START l_assegn+ L_END;

l_assegn:
    L_TOKEN EQUAL l_reg_exp ';';

l_reg_exp:
   (l_atom l_quant?)+;

l_quant:
    QUANTIFICATORE
    | '{' CIFRA+ (',' CIFRA*)? '}';

l_atom:
    LETTERA | CIFRA | METACHAR | SHORTCUT | '_'
    | '[' '^'? (l_interval | (LETTERA | CIFRA | METACHAR | '_'))+ ']'
    | '(' (l_atom l_quant?)+ ('|' l_atom l_quant?)* ')';

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
