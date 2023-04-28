package anasin;
import static anasin.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z]+
N=[0,1]+
S=[ ,\t,\r,\n]+
%{
    public String lexema;
%}
%%
{S} {/*Ignore*/}
"=" {lexema=yytext(); return IGUAL;}
"|" {lexema=yytext(); return OR;}
"&" {lexema=yytext(); return AND;}
"!" {lexema=yytext(); return NOT;}
";" {lexema=yytext(); return SEPARADOR;}
{L}({L}|{N})* {lexema=yytext(); return IDENTIFICADOR;}
("(-"{N}+")")|{N}+ {lexema=yytext(); return NUMERO;}
 . {return NO_DEFINIDO;}
