


package anasin;

import java_cup.runtime.Symbol;


public class Sintax extends java_cup.runtime.lr_parser {

  public Sintax() {super();}

  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\010\000\002\002" +
    "\010\000\002\002\007\000\002\002\011\000\002\002\011" +
    "\000\002\002\010" });

  public short[][] production_table() {return _production_table;}

  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\004\004\004\001\002\000\004\011\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\010\010\001\002\000\010\005\013\006\011\007" +
    "\012\001\002\000\004\010\021\001\002\000\004\012\017" +
    "\001\002\000\004\010\014\001\002\000\004\012\015\001" +
    "\002\000\006\002\000\004\004\001\002\000\004\002\ufffd" +
    "\001\002\000\006\002\ufffe\004\004\001\002\000\004\002" +
    "\ufffb\001\002\000\004\012\022\001\002\000\006\002\uffff" +
    "\004\004\001\002\000\004\002\ufffc\001\002" });

  public short[][] action_table() {return _action_table;}

  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\002\015\001\001\000\002" +
    "\001\001\000\004\002\017\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\002\022\001\001\000\002\001\001" +
    "" });

  public short[][] reduce_table() {return _reduce_table;}

  protected CUP$Sintax$actions action_obj;

  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  public int start_state() {return 0;}
  public int start_production() {return 0;}

  public int EOF_sym() {return 0;}

  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

class CUP$Sintax$actions {
  private final Sintax parser;

  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      java_cup.runtime.Symbol CUP$Sintax$result;

      switch (CUP$Sintax$act_num)
        {
          case 6: // INICIO ::= IDENTIFICADOR IGUAL NUMERO NOT SEPARADOR INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 5: // INICIO ::= IDENTIFICADOR IGUAL NUMERO AND NUMERO SEPARADOR INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 4: // INICIO ::= IDENTIFICADOR IGUAL NUMERO OR NUMERO SEPARADOR INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 3: // INICIO ::= IDENTIFICADOR IGUAL NUMERO NOT SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 2: // INICIO ::= IDENTIFICADOR IGUAL NUMERO AND NUMERO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 1: // INICIO ::= IDENTIFICADOR IGUAL NUMERO OR NUMERO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

