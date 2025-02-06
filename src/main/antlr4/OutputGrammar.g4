grammar OutputGrammar;


factor : variable | literal;
variable : A;
literal : B;
A : 'a'{4,6};
B : 'b';
