package anasin;
import java_cup.runtime.Symbol;
%%
%class LexCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z]+
N=[0,1]+
S=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
{S} {/*Ignore*/}
"=" {return new Symbol(sym.IGUAL, yychar, yyline, yytext());}
"|" {return new Symbol(sym.OR, yychar, yyline, yytext());}
"&" {return new Symbol(sym.AND, yychar, yyline, yytext());}
"!" {return new Symbol(sym.NOT, yychar, yyline, yytext());}
";" {return new Symbol(sym.SEPARADOR, yychar, yyline, yytext());}
{L}({L}|{N})* {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}
("(-"{N}+")")|{N}+ {return new Symbol(sym.NUMERO, yychar, yyline, yytext());}
. {return new Symbol(sym.NO_DEFINIDO, yychar, yyline, yytext());}

