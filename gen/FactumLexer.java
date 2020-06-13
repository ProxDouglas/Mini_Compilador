// Generated from D:/PUC_Projetos/COMP\Factum.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FactumLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, REAL=17, 
		INTEIRO=18, SIMBOLO=19, BOOLEANO=20, CADEIA=21, ABISTRATO=22, VALORES_TIPO_BOOLEANO=23, 
		VALORES_TIPO_INTEIRO=24, VALORES_TIPO_REAL=25, VALORES_TIPO_SIMBOLO=26, 
		VALOR_TIPO_CADEIA=27, SOMA=28, SUBTRAIR=29, MULTIPLICAR=30, DIVIDIR=31, 
		SIMBOLOS_DE_COMPARACAO=32, IGUAL=33, MENOR_IGUAL=34, MENOR=35, MAIOR_IGUAL=36, 
		MAIOR=37, DIFERENTE=38, SIMBOLO_LOGICO=39, CONJUCAO=40, DIJUNCAO=41, ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO=42, 
		DIG=43, ATRIBUICAO=44, TERMINAL=45, ID=46, SEP=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "REAL", 
			"INTEIRO", "SIMBOLO", "BOOLEANO", "CADEIA", "ABISTRATO", "VALORES_TIPO_BOOLEANO", 
			"VALORES_TIPO_INTEIRO", "VALORES_TIPO_REAL", "VALORES_TIPO_SIMBOLO", 
			"VALOR_TIPO_CADEIA", "SOMA", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR", "SIMBOLOS_DE_COMPARACAO", 
			"IGUAL", "MENOR_IGUAL", "MENOR", "MAIOR_IGUAL", "MAIOR", "DIFERENTE", 
			"SIMBOLO_LOGICO", "CONJUCAO", "DIJUNCAO", "ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO", 
			"DIG", "ATRIBUICAO", "TERMINAL", "ID", "SEP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'se'", "'{'", "'}'", "'senao'", "'enquanto'", "'repita'", 
			"'ate'", "'para'", "'INICIO'", "','", "'retorna'", "'FIM'", "'TIPO'", 
			"'main'", "'real'", "'inteiro'", "'simbolo'", "'booleano'", "'cadeia'", 
			null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", null, 
			"'=='", "'<='", "'<'", "'>='", "'>'", "'!='", null, "'&&'", "'||'", null, 
			null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "REAL", "INTEIRO", "SIMBOLO", "BOOLEANO", 
			"CADEIA", "ABISTRATO", "VALORES_TIPO_BOOLEANO", "VALORES_TIPO_INTEIRO", 
			"VALORES_TIPO_REAL", "VALORES_TIPO_SIMBOLO", "VALOR_TIPO_CADEIA", "SOMA", 
			"SUBTRAIR", "MULTIPLICAR", "DIVIDIR", "SIMBOLOS_DE_COMPARACAO", "IGUAL", 
			"MENOR_IGUAL", "MENOR", "MAIOR_IGUAL", "MAIOR", "DIFERENTE", "SIMBOLO_LOGICO", 
			"CONJUCAO", "DIJUNCAO", "ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO", 
			"DIG", "ATRIBUICAO", "TERMINAL", "ID", "SEP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FactumLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Factum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u016b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00d2"+
		"\n\27\f\27\16\27\u00d5\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00e0\n\30\3\31\6\31\u00e3\n\31\r\31\16\31\u00e4\3\31\3\31\5"+
		"\31\u00e9\n\31\3\31\6\31\u00ec\n\31\r\31\16\31\u00ed\3\31\5\31\u00f1\n"+
		"\31\3\32\6\32\u00f4\n\32\r\32\16\32\u00f5\3\32\3\32\6\32\u00fa\n\32\r"+
		"\32\16\32\u00fb\3\32\3\32\5\32\u0100\n\32\3\32\6\32\u0103\n\32\r\32\16"+
		"\32\u0104\3\32\3\32\6\32\u0109\n\32\r\32\16\32\u010a\3\32\5\32\u010e\n"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\6\34\u0116\n\34\r\34\16\34\u0117\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\5!\u012a\n"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\5(\u013e"+
		"\n(\3)\3)\3)\3*\3*\3*\3+\3+\7+\u0148\n+\f+\16+\u014b\13+\3+\3+\3+\7+\u0150"+
		"\n+\f+\16+\u0153\13+\3,\6,\u0156\n,\r,\16,\u0157\3-\3-\3.\3.\3/\3/\7/"+
		"\u0160\n/\f/\16/\u0163\13/\3\60\6\60\u0166\n\60\r\60\16\60\u0167\3\60"+
		"\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\3\2C\\"+
		"\5\2\62;C\\c|\3\2\62;\3\2))\3\2\2\u0081\4\2C\\c|\5\2\13\f\17\17\"\"\2"+
		"\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3\2\2\2"+
		"\17r\3\2\2\2\21{\3\2\2\2\23\u0082\3\2\2\2\25\u0086\3\2\2\2\27\u008b\3"+
		"\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u00a0\3\2"+
		"\2\2!\u00a5\3\2\2\2#\u00aa\3\2\2\2%\u00af\3\2\2\2\'\u00b7\3\2\2\2)\u00bf"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00cf\3\2\2\2/\u00df\3\2\2\2\61\u00f0\3\2\2\2"+
		"\63\u010d\3\2\2\2\65\u010f\3\2\2\2\67\u0113\3\2\2\29\u011b\3\2\2\2;\u011d"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0121\3\2\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E"+
		"\u012e\3\2\2\2G\u0131\3\2\2\2I\u0133\3\2\2\2K\u0136\3\2\2\2M\u0138\3\2"+
		"\2\2O\u013d\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0145\3\2\2\2W\u0155"+
		"\3\2\2\2Y\u0159\3\2\2\2[\u015b\3\2\2\2]\u015d\3\2\2\2_\u0165\3\2\2\2a"+
		"b\7*\2\2b\4\3\2\2\2cd\7+\2\2d\6\3\2\2\2ef\7u\2\2fg\7g\2\2g\b\3\2\2\2h"+
		"i\7}\2\2i\n\3\2\2\2jk\7\177\2\2k\f\3\2\2\2lm\7u\2\2mn\7g\2\2no\7p\2\2"+
		"op\7c\2\2pq\7q\2\2q\16\3\2\2\2rs\7g\2\2st\7p\2\2tu\7s\2\2uv\7w\2\2vw\7"+
		"c\2\2wx\7p\2\2xy\7v\2\2yz\7q\2\2z\20\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7r\2"+
		"\2~\177\7k\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\22\3\2\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085\24\3\2\2\2\u0086"+
		"\u0087\7r\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2"+
		"\u008a\26\3\2\2\2\u008b\u008c\7K\2\2\u008c\u008d\7P\2\2\u008d\u008e\7"+
		"K\2\2\u008e\u008f\7E\2\2\u008f\u0090\7K\2\2\u0090\u0091\7Q\2\2\u0091\30"+
		"\3\2\2\2\u0092\u0093\7.\2\2\u0093\32\3\2\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7p\2\2\u009a\u009b\7c\2\2\u009b\34\3\2\2\2\u009c\u009d\7"+
		"H\2\2\u009d\u009e\7K\2\2\u009e\u009f\7O\2\2\u009f\36\3\2\2\2\u00a0\u00a1"+
		"\7V\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7R\2\2\u00a3\u00a4\7Q\2\2\u00a4"+
		" \3\2\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae$\3\2\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7k\2\2"+
		"\u00b4\u00b5\7t\2\2\u00b5\u00b6\7q\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7u\2"+
		"\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7q\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7d\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7q\2\2"+
		"\u00c7*\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7f\2"+
		"\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7c\2\2\u00ce,\3\2"+
		"\2\2\u00cf\u00d3\t\2\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4.\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7w\2\2\u00d9\u00e0\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7u\2\2\u00de\u00e0\7g\2\2\u00df\u00d6\3\2\2"+
		"\2\u00df\u00da\3\2\2\2\u00e0\60\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00f1\3\2\2\2\u00e6\u00e8\7*\2\2\u00e7\u00e9\7/\2\2\u00e8\u00e7\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\7+\2\2\u00f0\u00e2\3\2\2\2\u00f0\u00e6\3\2"+
		"\2\2\u00f1\62\3\2\2\2\u00f2\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\7\60\2\2\u00f8\u00fa\t\4\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u010e\3\2\2\2\u00fd"+
		"\u00ff\7*\2\2\u00fe\u0100\7/\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2"+
		"\2\u0100\u0102\3\2\2\2\u0101\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\7\60\2\2\u0107\u0109\t\4\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\7+\2\2\u010d\u00f3\3\2\2\2\u010d\u00fd\3\2\2\2\u010e\64\3\2\2\2"+
		"\u010f\u0110\t\5\2\2\u0110\u0111\t\3\2\2\u0111\u0112\t\5\2\2\u0112\66"+
		"\3\2\2\2\u0113\u0115\7$\2\2\u0114\u0116\t\6\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\7$\2\2\u011a8\3\2\2\2\u011b\u011c\7-\2\2\u011c:\3\2\2"+
		"\2\u011d\u011e\7/\2\2\u011e<\3\2\2\2\u011f\u0120\7,\2\2\u0120>\3\2\2\2"+
		"\u0121\u0122\7\61\2\2\u0122@\3\2\2\2\u0123\u012a\5G$\2\u0124\u012a\5E"+
		"#\2\u0125\u012a\5K&\2\u0126\u012a\5I%\2\u0127\u012a\5C\"\2\u0128\u012a"+
		"\5M\'\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012aB\3\2\2\2"+
		"\u012b\u012c\7?\2\2\u012c\u012d\7?\2\2\u012dD\3\2\2\2\u012e\u012f\7>\2"+
		"\2\u012f\u0130\7?\2\2\u0130F\3\2\2\2\u0131\u0132\7>\2\2\u0132H\3\2\2\2"+
		"\u0133\u0134\7@\2\2\u0134\u0135\7?\2\2\u0135J\3\2\2\2\u0136\u0137\7@\2"+
		"\2\u0137L\3\2\2\2\u0138\u0139\7#\2\2\u0139\u013a\7?\2\2\u013aN\3\2\2\2"+
		"\u013b\u013e\5Q)\2\u013c\u013e\5S*\2\u013d\u013b\3\2\2\2\u013d\u013c\3"+
		"\2\2\2\u013eP\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0141\7(\2\2\u0141R\3\2"+
		"\2\2\u0142\u0143\7~\2\2\u0143\u0144\7~\2\2\u0144T\3\2\2\2\u0145\u0149"+
		"\t\7\2\2\u0146\u0148\t\3\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014d\7\60\2\2\u014d\u0151\t\7\2\2\u014e\u0150\t\3\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152V\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\t\4\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"X\3\2\2\2\u0159\u015a\7?\2\2\u015aZ\3\2\2\2\u015b\u015c\7=\2\2\u015c\\"+
		"\3\2\2\2\u015d\u0161\t\7\2\2\u015e\u0160\t\3\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162^\3\2\2\2"+
		"\u0163\u0161\3\2\2\2\u0164\u0166\t\b\2\2\u0165\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\b\60\2\2\u016a`\3\2\2\2\27\2\u00d3\u00df\u00e4\u00e8\u00ed\u00f0"+
		"\u00f5\u00fb\u00ff\u0104\u010a\u010d\u0117\u0129\u013d\u0149\u0151\u0157"+
		"\u0161\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}