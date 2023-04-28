

package anasin;
import static anasin.Tokens.*;

@SuppressWarnings("FallThrough")
class Lexer {

  public static final int YYEOF = -1;

  private static final int ZZ_BUFFERSIZE = 16384;

  public static final int YYINITIAL = 0;

  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

 
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index  string  */
    int j = offset;  /*  array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }



  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\2\2\1\1\22\0\1\1\1\3\4\0"+
    "\1\4\1\0\1\5\1\6\2\0\1\7\1\10\2\0"+
    "\2\11\11\0\1\12\1\0\1\13\3\0\32\14\6\0"+
    "\32\14\1\0\1\15\10\0\1\2\u01a2\0\2\2\326\0"+
    "\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index  string  */
    int j = offset;  /*  array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\2\1\5"+
    "\1\6\1\7\1\10\1\11\2\0\1\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[15];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index string  */
    int j = offset;  /* array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }



  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\16\0\34\0\16\0\16\0\52\0\70\0\106"+
    "\0\16\0\16\0\124\0\16\0\142\0\160\0\16";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[15];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index string  */
    int j = offset;  /* array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }


  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\0\1\4\1\5\1\6\1\2\1\7"+
    "\1\2\1\10\1\11\1\12\1\13\1\14\17\0\1\3"+
    "\5\0\1\3\16\0\1\15\6\0\1\3\5\0\1\7"+
    "\1\0\1\10\13\0\1\10\1\0\1\10\13\0\1\13"+
    "\1\0\1\13\2\0\1\13\10\0\1\16\1\0\1\16"+
    "\12\0\1\17\1\16\1\0\1\16\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index string  */
    int j = offset;  /* array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;


  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };


  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\3\1\2\11\1\1\1\11"+
    "\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[15];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index string  */
    int j = offset;  /* array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private java.io.Reader zzReader;

  private int zzState;

  private int zzLexicalState = YYINITIAL;


  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  private int zzMarkedPos;

  private int zzCurrentPos;

  private int zzStartRead;

  private int zzEndRead;

 
  private boolean zzAtEOF;


  private int zzFinalHighSurrogate = 0;

  @SuppressWarnings("unused")
  private int yyline;

  @SuppressWarnings("unused")
  private int yycolumn;

  @SuppressWarnings("unused")
  private long yychar;

  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  @SuppressWarnings("unused")
  private boolean zzEOFDone;

    public String lexema;


 
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

 
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }


  private boolean zzRefill() throws java.io.IOException {

    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { 
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    
          int c = zzReader.read();  
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      return false;
    }

    return true;
  }



  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; 
    zzEndRead = zzStartRead; 

    if (zzReader != null) {
      zzReader.close();
    }
  }


  
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }


  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }



  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  public final int yystate() {
    return zzLexicalState;
  }



  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }



  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }



  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }



  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }



  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }



  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return NO_DEFINIDO;
            }
            // fall through
          case 10: break;
          case 2:
            { /*Ignore*/
            }
            // fall through
          case 11: break;
          case 3:
            { lexema=yytext(); return NOT;
            }
            // fall through
          case 12: break;
          case 4:
            { lexema=yytext(); return AND;
            }
            // fall through
          case 13: break;
          case 5:
            { lexema=yytext(); return NUMERO;
            }
            // fall through
          case 14: break;
          case 6:
            { lexema=yytext(); return SEPARADOR;
            }
            // fall through
          case 15: break;
          case 7:
            { lexema=yytext(); return IGUAL;
            }
            // fall through
          case 16: break;
          case 8:
            { lexema=yytext(); return IDENTIFICADOR;
            }
            // fall through
          case 17: break;
          case 9:
            { lexema=yytext(); return OR;
            }
            // fall through
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
