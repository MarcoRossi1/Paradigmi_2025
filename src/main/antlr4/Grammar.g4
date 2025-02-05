grammar Grammar;

start:
    token*;

token:
    atom quantificatore?;

atom:
    LETTERA
    | CIFRA
    | METACHAR
    | SHORTCUT
    | QOPEN NOT? ((LETTERA | CIFRA)+ | ((LETTERA | CIFRA) TRATTINO (LETTERA | CIFRA))+ ) QCLOSE
    | TOPEN token+ (OR token)* TCLOSE;

quantificatore:
    QUANTIFICATORE
    | GOPEN CIFRA+ (VIRGOLA CIFRA*)? GCLOSE;

QUANTIFICATORE: '?' | '+' | '*';
LETTERA: [a-zA-Z];
CIFRA: [0-9];
METACHAR: '\\' ( '?' | '+' | '*' | '{' | '}' | '(' | ')' | '[' | ']' | '.' | '|' | '^' | '-' | '\\' );
SHORTCUT: '\\' [dDwWsS];
OR: '|';
TOPEN: '(';
TCLOSE: ')';
QOPEN: '[';
QCLOSE: ']';
GOPEN: '{';
GCLOSE: '}';
TRATTINO: '-';
NOT: '^';
AOPEN: '<';
ACLOSE: '>';
EQUAL: '::=';
VIRGOLA: ',';
WS: [ \t\r\n]+ -> skip;
