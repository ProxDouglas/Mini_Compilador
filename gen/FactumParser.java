// Generated from D:/PUC_Projetos/COMP\Factum.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FactumParser extends Parser {
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
	public static final int
		RULE_gramatica_de_factum = 0, RULE_declaracao_de_variavel = 1, RULE_declaracao_de_variavel_sem_atribuicao = 2, 
		RULE_declaracao_de_variavel_abstrato_com_atribuicao = 3, RULE_declaracao_de_variavel_inteiro_com_atribuicao = 4, 
		RULE_declaracao_de_variavel_booleano_com_atribuicao = 5, RULE_declaracao_de_variavel_real_com_atribuicao = 6, 
		RULE_declaracao_de_variavel_simbolo_com_atribuicao = 7, RULE_declaracao_de_variavel_texto_com_atribuicao = 8, 
		RULE_tipos_de_valores = 9, RULE_expressao_aritmetica = 10, RULE_concatenacao_de_cadeias = 11, 
		RULE_tipos_de_cadeias_elemento = 12, RULE_expressao_aritmetica_numericas = 13, 
		RULE_tipo_de_valores_numericos = 14, RULE_operador = 15, RULE_atribuicao_de_variavel = 16, 
		RULE_atribuicao_de_valores = 17, RULE_instrucao_de_controle = 18, RULE_instrucao_de_restricao_de_dominio = 19, 
		RULE_logica_proposicional_entre_comparacoes = 20, RULE_instrucao_de_repeticao_condicional_inicial = 21, 
		RULE_instrucao_de_repeticao_condicional_final = 22, RULE_instrucao_de_repeticao_com_contador = 23, 
		RULE_instrucoes_de_troca_de_valor = 24, RULE_declaracao_de_funcao_metodo = 25, 
		RULE_criacao_de_tipo_abstrato = 26, RULE_formato_de_tipo_abstrato = 27, 
		RULE_metodo_abstrato = 28, RULE_chamada_de_funcao_tipo_abstrato = 29, 
		RULE_funcao_principal = 30, RULE_chamada_de_funcao = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"gramatica_de_factum", "declaracao_de_variavel", "declaracao_de_variavel_sem_atribuicao", 
			"declaracao_de_variavel_abstrato_com_atribuicao", "declaracao_de_variavel_inteiro_com_atribuicao", 
			"declaracao_de_variavel_booleano_com_atribuicao", "declaracao_de_variavel_real_com_atribuicao", 
			"declaracao_de_variavel_simbolo_com_atribuicao", "declaracao_de_variavel_texto_com_atribuicao", 
			"tipos_de_valores", "expressao_aritmetica", "concatenacao_de_cadeias", 
			"tipos_de_cadeias_elemento", "expressao_aritmetica_numericas", "tipo_de_valores_numericos", 
			"operador", "atribuicao_de_variavel", "atribuicao_de_valores", "instrucao_de_controle", 
			"instrucao_de_restricao_de_dominio", "logica_proposicional_entre_comparacoes", 
			"instrucao_de_repeticao_condicional_inicial", "instrucao_de_repeticao_condicional_final", 
			"instrucao_de_repeticao_com_contador", "instrucoes_de_troca_de_valor", 
			"declaracao_de_funcao_metodo", "criacao_de_tipo_abstrato", "formato_de_tipo_abstrato", 
			"metodo_abstrato", "chamada_de_funcao_tipo_abstrato", "funcao_principal", 
			"chamada_de_funcao"
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

	@Override
	public String getGrammarFileName() { return "Factum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FactumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Gramatica_de_factumContext extends ParserRuleContext {
		public Funcao_principalContext funcao_principal() {
			return getRuleContext(Funcao_principalContext.class,0);
		}
		public List<Declaracao_de_variavel_sem_atribuicaoContext> declaracao_de_variavel_sem_atribuicao() {
			return getRuleContexts(Declaracao_de_variavel_sem_atribuicaoContext.class);
		}
		public Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao(int i) {
			return getRuleContext(Declaracao_de_variavel_sem_atribuicaoContext.class,i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(FactumParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(FactumParser.TERMINAL, i);
		}
		public List<Declaracao_de_funcao_metodoContext> declaracao_de_funcao_metodo() {
			return getRuleContexts(Declaracao_de_funcao_metodoContext.class);
		}
		public Declaracao_de_funcao_metodoContext declaracao_de_funcao_metodo(int i) {
			return getRuleContext(Declaracao_de_funcao_metodoContext.class,i);
		}
		public List<Criacao_de_tipo_abstratoContext> criacao_de_tipo_abstrato() {
			return getRuleContexts(Criacao_de_tipo_abstratoContext.class);
		}
		public Criacao_de_tipo_abstratoContext criacao_de_tipo_abstrato(int i) {
			return getRuleContext(Criacao_de_tipo_abstratoContext.class,i);
		}
		public Gramatica_de_factumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramatica_de_factum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterGramatica_de_factum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitGramatica_de_factum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitGramatica_de_factum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gramatica_de_factumContext gramatica_de_factum() throws RecognitionException {
		Gramatica_de_factumContext _localctx = new Gramatica_de_factumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gramatica_de_factum);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) {
				{
				{
				setState(64);
				declaracao_de_variavel_sem_atribuicao();
				setState(65);
				match(TERMINAL);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			funcao_principal();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					declaracao_de_funcao_metodo();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(79);
				criacao_de_tipo_abstrato();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavelContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_sem_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_abstrato_com_atribuicaoContext declaracao_de_variavel_abstrato_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_abstrato_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_booleano_com_atribuicaoContext declaracao_de_variavel_booleano_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_booleano_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_inteiro_com_atribuicaoContext declaracao_de_variavel_inteiro_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_inteiro_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_real_com_atribuicaoContext declaracao_de_variavel_real_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_real_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_simbolo_com_atribuicaoContext declaracao_de_variavel_simbolo_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_simbolo_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavel_texto_com_atribuicaoContext declaracao_de_variavel_texto_com_atribuicao() {
			return getRuleContext(Declaracao_de_variavel_texto_com_atribuicaoContext.class,0);
		}
		public Declaracao_de_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavelContext declaracao_de_variavel() throws RecognitionException {
		Declaracao_de_variavelContext _localctx = new Declaracao_de_variavelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_de_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
				declaracao_de_variavel_sem_atribuicao();
				}
				break;
			case 2:
				{
				setState(86);
				declaracao_de_variavel_abstrato_com_atribuicao();
				}
				break;
			case 3:
				{
				setState(87);
				declaracao_de_variavel_booleano_com_atribuicao();
				}
				break;
			case 4:
				{
				setState(88);
				declaracao_de_variavel_inteiro_com_atribuicao();
				}
				break;
			case 5:
				{
				setState(89);
				declaracao_de_variavel_real_com_atribuicao();
				}
				break;
			case 6:
				{
				setState(90);
				declaracao_de_variavel_simbolo_com_atribuicao();
				}
				break;
			case 7:
				{
				setState(91);
				declaracao_de_variavel_texto_com_atribuicao();
				}
				break;
			}
			setState(94);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_sem_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode REAL() { return getToken(FactumParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(FactumParser.INTEIRO, 0); }
		public TerminalNode SIMBOLO() { return getToken(FactumParser.SIMBOLO, 0); }
		public TerminalNode CADEIA() { return getToken(FactumParser.CADEIA, 0); }
		public TerminalNode BOOLEANO() { return getToken(FactumParser.BOOLEANO, 0); }
		public TerminalNode ABISTRATO() { return getToken(FactumParser.ABISTRATO, 0); }
		public Declaracao_de_variavel_sem_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_sem_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_sem_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_sem_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_sem_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_sem_atribuicaoContext _localctx = new Declaracao_de_variavel_sem_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_de_variavel_sem_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_abstrato_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ABISTRATO() { return getToken(FactumParser.ABISTRATO, 0); }
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public Declaracao_de_variavel_abstrato_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_abstrato_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_abstrato_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_abstrato_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_abstrato_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_abstrato_com_atribuicaoContext declaracao_de_variavel_abstrato_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_abstrato_com_atribuicaoContext _localctx = new Declaracao_de_variavel_abstrato_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_de_variavel_abstrato_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ABISTRATO);
			setState(100);
			match(ID);
			setState(101);
			match(T__0);
			setState(102);
			match(ID);
			setState(103);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_inteiro_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(FactumParser.INTEIRO, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public TerminalNode VALORES_TIPO_INTEIRO() { return getToken(FactumParser.VALORES_TIPO_INTEIRO, 0); }
		public Declaracao_de_variavel_inteiro_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_inteiro_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_inteiro_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_inteiro_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_inteiro_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_inteiro_com_atribuicaoContext declaracao_de_variavel_inteiro_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_inteiro_com_atribuicaoContext _localctx = new Declaracao_de_variavel_inteiro_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_de_variavel_inteiro_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(INTEIRO);
			setState(106);
			match(ID);
			setState(107);
			match(ATRIBUICAO);
			setState(108);
			match(VALORES_TIPO_INTEIRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_booleano_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(FactumParser.BOOLEANO, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public TerminalNode VALORES_TIPO_BOOLEANO() { return getToken(FactumParser.VALORES_TIPO_BOOLEANO, 0); }
		public Declaracao_de_variavel_booleano_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_booleano_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_booleano_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_booleano_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_booleano_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_booleano_com_atribuicaoContext declaracao_de_variavel_booleano_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_booleano_com_atribuicaoContext _localctx = new Declaracao_de_variavel_booleano_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_de_variavel_booleano_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(BOOLEANO);
			setState(111);
			match(ID);
			setState(112);
			match(ATRIBUICAO);
			setState(113);
			match(VALORES_TIPO_BOOLEANO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_real_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(FactumParser.REAL, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public TerminalNode VALORES_TIPO_REAL() { return getToken(FactumParser.VALORES_TIPO_REAL, 0); }
		public Declaracao_de_variavel_real_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_real_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_real_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_real_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_real_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_real_com_atribuicaoContext declaracao_de_variavel_real_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_real_com_atribuicaoContext _localctx = new Declaracao_de_variavel_real_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_de_variavel_real_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(REAL);
			setState(116);
			match(ID);
			setState(117);
			match(ATRIBUICAO);
			setState(118);
			match(VALORES_TIPO_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_simbolo_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode SIMBOLO() { return getToken(FactumParser.SIMBOLO, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public TerminalNode VALORES_TIPO_SIMBOLO() { return getToken(FactumParser.VALORES_TIPO_SIMBOLO, 0); }
		public Declaracao_de_variavel_simbolo_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_simbolo_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_simbolo_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_simbolo_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_simbolo_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_simbolo_com_atribuicaoContext declaracao_de_variavel_simbolo_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_simbolo_com_atribuicaoContext _localctx = new Declaracao_de_variavel_simbolo_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracao_de_variavel_simbolo_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SIMBOLO);
			setState(121);
			match(ID);
			setState(122);
			match(ATRIBUICAO);
			setState(123);
			match(VALORES_TIPO_SIMBOLO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_variavel_texto_com_atribuicaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(FactumParser.CADEIA, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public TerminalNode VALOR_TIPO_CADEIA() { return getToken(FactumParser.VALOR_TIPO_CADEIA, 0); }
		public Declaracao_de_variavel_texto_com_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_variavel_texto_com_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_variavel_texto_com_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_variavel_texto_com_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_variavel_texto_com_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_variavel_texto_com_atribuicaoContext declaracao_de_variavel_texto_com_atribuicao() throws RecognitionException {
		Declaracao_de_variavel_texto_com_atribuicaoContext _localctx = new Declaracao_de_variavel_texto_com_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao_de_variavel_texto_com_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CADEIA);
			setState(126);
			match(ID);
			setState(127);
			match(ATRIBUICAO);
			setState(128);
			match(VALOR_TIPO_CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_de_valoresContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(FactumParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(FactumParser.REAL, 0); }
		public TerminalNode SIMBOLO() { return getToken(FactumParser.SIMBOLO, 0); }
		public TerminalNode CADEIA() { return getToken(FactumParser.CADEIA, 0); }
		public TerminalNode BOOLEANO() { return getToken(FactumParser.BOOLEANO, 0); }
		public TerminalNode ABISTRATO() { return getToken(FactumParser.ABISTRATO, 0); }
		public Tipos_de_valoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_de_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterTipos_de_valores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitTipos_de_valores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitTipos_de_valores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_de_valoresContext tipos_de_valores() throws RecognitionException {
		Tipos_de_valoresContext _localctx = new Tipos_de_valoresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipos_de_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public Concatenacao_de_cadeiasContext concatenacao_de_cadeias() {
			return getRuleContext(Concatenacao_de_cadeiasContext.class,0);
		}
		public Expressao_aritmetica_numericasContext expressao_aritmetica_numericas() {
			return getRuleContext(Expressao_aritmetica_numericasContext.class,0);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao_aritmetica);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				concatenacao_de_cadeias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				expressao_aritmetica_numericas();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concatenacao_de_cadeiasContext extends ParserRuleContext {
		public List<Tipos_de_cadeias_elementoContext> tipos_de_cadeias_elemento() {
			return getRuleContexts(Tipos_de_cadeias_elementoContext.class);
		}
		public Tipos_de_cadeias_elementoContext tipos_de_cadeias_elemento(int i) {
			return getRuleContext(Tipos_de_cadeias_elementoContext.class,i);
		}
		public List<TerminalNode> SOMA() { return getTokens(FactumParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(FactumParser.SOMA, i);
		}
		public Concatenacao_de_cadeiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenacao_de_cadeias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterConcatenacao_de_cadeias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitConcatenacao_de_cadeias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitConcatenacao_de_cadeias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concatenacao_de_cadeiasContext concatenacao_de_cadeias() throws RecognitionException {
		Concatenacao_de_cadeiasContext _localctx = new Concatenacao_de_cadeiasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_concatenacao_de_cadeias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			tipos_de_cadeias_elemento();
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(SOMA);
				setState(138);
				tipos_de_cadeias_elemento();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SOMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_de_cadeias_elementoContext extends ParserRuleContext {
		public TerminalNode VALORES_TIPO_SIMBOLO() { return getToken(FactumParser.VALORES_TIPO_SIMBOLO, 0); }
		public TerminalNode VALOR_TIPO_CADEIA() { return getToken(FactumParser.VALOR_TIPO_CADEIA, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public Tipos_de_cadeias_elementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_de_cadeias_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterTipos_de_cadeias_elemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitTipos_de_cadeias_elemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitTipos_de_cadeias_elemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_de_cadeias_elementoContext tipos_de_cadeias_elemento() throws RecognitionException {
		Tipos_de_cadeias_elementoContext _localctx = new Tipos_de_cadeias_elementoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipos_de_cadeias_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_aritmetica_numericasContext extends ParserRuleContext {
		public List<Tipo_de_valores_numericosContext> tipo_de_valores_numericos() {
			return getRuleContexts(Tipo_de_valores_numericosContext.class);
		}
		public Tipo_de_valores_numericosContext tipo_de_valores_numericos(int i) {
			return getRuleContext(Tipo_de_valores_numericosContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public Expressao_aritmetica_numericasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica_numericas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterExpressao_aritmetica_numericas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitExpressao_aritmetica_numericas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitExpressao_aritmetica_numericas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmetica_numericasContext expressao_aritmetica_numericas() throws RecognitionException {
		Expressao_aritmetica_numericasContext _localctx = new Expressao_aritmetica_numericasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_aritmetica_numericas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			tipo_de_valores_numericos();
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				operador();
				setState(147);
				tipo_de_valores_numericos();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUBTRAIR) | (1L << MULTIPLICAR) | (1L << DIVIDIR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_de_valores_numericosContext extends ParserRuleContext {
		public TerminalNode VALORES_TIPO_INTEIRO() { return getToken(FactumParser.VALORES_TIPO_INTEIRO, 0); }
		public TerminalNode VALORES_TIPO_REAL() { return getToken(FactumParser.VALORES_TIPO_REAL, 0); }
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public Tipo_de_valores_numericosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_valores_numericos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterTipo_de_valores_numericos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitTipo_de_valores_numericos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitTipo_de_valores_numericos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_valores_numericosContext tipo_de_valores_numericos() throws RecognitionException {
		Tipo_de_valores_numericosContext _localctx = new Tipo_de_valores_numericosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_de_valores_numericos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(FactumParser.SOMA, 0); }
		public TerminalNode SUBTRAIR() { return getToken(FactumParser.SUBTRAIR, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(FactumParser.MULTIPLICAR, 0); }
		public TerminalNode DIVIDIR() { return getToken(FactumParser.DIVIDIR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUBTRAIR) | (1L << MULTIPLICAR) | (1L << DIVIDIR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_de_variavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FactumParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public Atribuicao_de_valoresContext atribuicao_de_valores() {
			return getRuleContext(Atribuicao_de_valoresContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public Atribuicao_de_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_de_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterAtribuicao_de_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitAtribuicao_de_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitAtribuicao_de_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atribuicao_de_variavelContext atribuicao_de_variavel() throws RecognitionException {
		Atribuicao_de_variavelContext _localctx = new Atribuicao_de_variavelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao_de_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			match(ATRIBUICAO);
			setState(159);
			atribuicao_de_valores();
			setState(160);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_de_valoresContext extends ParserRuleContext {
		public TerminalNode VALORES_TIPO_INTEIRO() { return getToken(FactumParser.VALORES_TIPO_INTEIRO, 0); }
		public TerminalNode VALORES_TIPO_REAL() { return getToken(FactumParser.VALORES_TIPO_REAL, 0); }
		public TerminalNode VALORES_TIPO_BOOLEANO() { return getToken(FactumParser.VALORES_TIPO_BOOLEANO, 0); }
		public TerminalNode VALORES_TIPO_SIMBOLO() { return getToken(FactumParser.VALORES_TIPO_SIMBOLO, 0); }
		public TerminalNode VALOR_TIPO_CADEIA() { return getToken(FactumParser.VALOR_TIPO_CADEIA, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_de_valoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_de_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterAtribuicao_de_valores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitAtribuicao_de_valores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitAtribuicao_de_valores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atribuicao_de_valoresContext atribuicao_de_valores() throws RecognitionException {
		Atribuicao_de_valoresContext _localctx = new Atribuicao_de_valoresContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicao_de_valores);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(VALORES_TIPO_INTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(VALORES_TIPO_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(VALORES_TIPO_BOOLEANO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(VALORES_TIPO_SIMBOLO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(VALOR_TIPO_CADEIA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				expressao_aritmetica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_de_controleContext extends ParserRuleContext {
		public Instrucao_de_repeticao_com_contadorContext instrucao_de_repeticao_com_contador() {
			return getRuleContext(Instrucao_de_repeticao_com_contadorContext.class,0);
		}
		public Instrucao_de_repeticao_condicional_finalContext instrucao_de_repeticao_condicional_final() {
			return getRuleContext(Instrucao_de_repeticao_condicional_finalContext.class,0);
		}
		public Instrucao_de_repeticao_condicional_inicialContext instrucao_de_repeticao_condicional_inicial() {
			return getRuleContext(Instrucao_de_repeticao_condicional_inicialContext.class,0);
		}
		public Instrucao_de_restricao_de_dominioContext instrucao_de_restricao_de_dominio() {
			return getRuleContext(Instrucao_de_restricao_de_dominioContext.class,0);
		}
		public Instrucao_de_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_de_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucao_de_controle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucao_de_controle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucao_de_controle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_de_controleContext instrucao_de_controle() throws RecognitionException {
		Instrucao_de_controleContext _localctx = new Instrucao_de_controleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instrucao_de_controle);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				instrucao_de_repeticao_com_contador();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				instrucao_de_repeticao_condicional_final();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				instrucao_de_repeticao_condicional_inicial();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				instrucao_de_restricao_de_dominio();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_de_restricao_de_dominioContext extends ParserRuleContext {
		public Logica_proposicional_entre_comparacoesContext logica_proposicional_entre_comparacoes() {
			return getRuleContext(Logica_proposicional_entre_comparacoesContext.class,0);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public Instrucao_de_restricao_de_dominioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_de_restricao_de_dominio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucao_de_restricao_de_dominio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucao_de_restricao_de_dominio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucao_de_restricao_de_dominio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_de_restricao_de_dominioContext instrucao_de_restricao_de_dominio() throws RecognitionException {
		Instrucao_de_restricao_de_dominioContext _localctx = new Instrucao_de_restricao_de_dominioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instrucao_de_restricao_de_dominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__2);
			setState(177);
			match(T__0);
			setState(178);
			logica_proposicional_entre_comparacoes();
			setState(179);
			match(T__1);
			setState(180);
			match(T__3);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
				case INTEIRO:
				case SIMBOLO:
				case BOOLEANO:
				case CADEIA:
				case ABISTRATO:
				case VALORES_TIPO_INTEIRO:
				case VALORES_TIPO_REAL:
				case VALORES_TIPO_SIMBOLO:
				case VALOR_TIPO_CADEIA:
				case ID:
					{
					setState(181);
					instrucoes_de_troca_de_valor();
					}
					break;
				case T__2:
				case T__6:
				case T__7:
				case T__9:
					{
					setState(182);
					instrucao_de_controle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(187);
			match(T__4);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(188);
				match(T__5);
				setState(189);
				match(T__3);
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(192);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REAL:
					case INTEIRO:
					case SIMBOLO:
					case BOOLEANO:
					case CADEIA:
					case ABISTRATO:
					case VALORES_TIPO_INTEIRO:
					case VALORES_TIPO_REAL:
					case VALORES_TIPO_SIMBOLO:
					case VALOR_TIPO_CADEIA:
					case ID:
						{
						setState(190);
						instrucoes_de_troca_de_valor();
						}
						break;
					case T__2:
					case T__6:
					case T__7:
					case T__9:
						{
						setState(191);
						instrucao_de_controle();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
				setState(196);
				match(T__4);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logica_proposicional_entre_comparacoesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public List<TerminalNode> SIMBOLOS_DE_COMPARACAO() { return getTokens(FactumParser.SIMBOLOS_DE_COMPARACAO); }
		public TerminalNode SIMBOLOS_DE_COMPARACAO(int i) {
			return getToken(FactumParser.SIMBOLOS_DE_COMPARACAO, i);
		}
		public TerminalNode SIMBOLO_LOGICO() { return getToken(FactumParser.SIMBOLO_LOGICO, 0); }
		public Logica_proposicional_entre_comparacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica_proposicional_entre_comparacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterLogica_proposicional_entre_comparacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitLogica_proposicional_entre_comparacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitLogica_proposicional_entre_comparacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logica_proposicional_entre_comparacoesContext logica_proposicional_entre_comparacoes() throws RecognitionException {
		Logica_proposicional_entre_comparacoesContext _localctx = new Logica_proposicional_entre_comparacoesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logica_proposicional_entre_comparacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(204);
			match(SIMBOLOS_DE_COMPARACAO);
			setState(205);
			match(ID);
			{
			setState(206);
			match(SIMBOLO_LOGICO);
			setState(207);
			match(ID);
			setState(208);
			match(SIMBOLOS_DE_COMPARACAO);
			setState(209);
			match(ID);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_de_repeticao_condicional_inicialContext extends ParserRuleContext {
		public Logica_proposicional_entre_comparacoesContext logica_proposicional_entre_comparacoes() {
			return getRuleContext(Logica_proposicional_entre_comparacoesContext.class,0);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public Instrucao_de_repeticao_condicional_inicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_de_repeticao_condicional_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucao_de_repeticao_condicional_inicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucao_de_repeticao_condicional_inicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucao_de_repeticao_condicional_inicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_de_repeticao_condicional_inicialContext instrucao_de_repeticao_condicional_inicial() throws RecognitionException {
		Instrucao_de_repeticao_condicional_inicialContext _localctx = new Instrucao_de_repeticao_condicional_inicialContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instrucao_de_repeticao_condicional_inicial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__6);
			setState(212);
			match(T__0);
			setState(213);
			logica_proposicional_entre_comparacoes();
			setState(214);
			match(T__1);
			setState(215);
			match(T__3);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
				case INTEIRO:
				case SIMBOLO:
				case BOOLEANO:
				case CADEIA:
				case ABISTRATO:
				case VALORES_TIPO_INTEIRO:
				case VALORES_TIPO_REAL:
				case VALORES_TIPO_SIMBOLO:
				case VALOR_TIPO_CADEIA:
				case ID:
					{
					setState(216);
					instrucoes_de_troca_de_valor();
					}
					break;
				case T__2:
				case T__6:
				case T__7:
				case T__9:
					{
					setState(217);
					instrucao_de_controle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(222);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_de_repeticao_condicional_finalContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public TerminalNode SIMBOLOS_DE_COMPARACAO() { return getToken(FactumParser.SIMBOLOS_DE_COMPARACAO, 0); }
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public Instrucao_de_repeticao_condicional_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_de_repeticao_condicional_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucao_de_repeticao_condicional_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucao_de_repeticao_condicional_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucao_de_repeticao_condicional_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_de_repeticao_condicional_finalContext instrucao_de_repeticao_condicional_final() throws RecognitionException {
		Instrucao_de_repeticao_condicional_finalContext _localctx = new Instrucao_de_repeticao_condicional_finalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instrucao_de_repeticao_condicional_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__7);
			setState(225);
			match(T__3);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
				case INTEIRO:
				case SIMBOLO:
				case BOOLEANO:
				case CADEIA:
				case ABISTRATO:
				case VALORES_TIPO_INTEIRO:
				case VALORES_TIPO_REAL:
				case VALORES_TIPO_SIMBOLO:
				case VALOR_TIPO_CADEIA:
				case ID:
					{
					setState(226);
					instrucoes_de_troca_de_valor();
					}
					break;
				case T__2:
				case T__6:
				case T__7:
				case T__9:
					{
					setState(227);
					instrucao_de_controle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(232);
			match(T__4);
			setState(233);
			match(T__8);
			setState(234);
			match(T__0);
			setState(235);
			match(ID);
			setState(236);
			match(SIMBOLOS_DE_COMPARACAO);
			setState(237);
			match(ID);
			setState(238);
			match(T__1);
			setState(239);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_de_repeticao_com_contadorContext extends ParserRuleContext {
		public Atribuicao_de_variavelContext atribuicao_de_variavel() {
			return getRuleContext(Atribuicao_de_variavelContext.class,0);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(FactumParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(FactumParser.TERMINAL, i);
		}
		public Logica_proposicional_entre_comparacoesContext logica_proposicional_entre_comparacoes() {
			return getRuleContext(Logica_proposicional_entre_comparacoesContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public Instrucao_de_repeticao_com_contadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_de_repeticao_com_contador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucao_de_repeticao_com_contador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucao_de_repeticao_com_contador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucao_de_repeticao_com_contador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_de_repeticao_com_contadorContext instrucao_de_repeticao_com_contador() throws RecognitionException {
		Instrucao_de_repeticao_com_contadorContext _localctx = new Instrucao_de_repeticao_com_contadorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instrucao_de_repeticao_com_contador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__9);
			setState(242);
			match(T__0);
			setState(243);
			atribuicao_de_variavel();
			setState(244);
			match(TERMINAL);
			setState(245);
			logica_proposicional_entre_comparacoes();
			setState(246);
			match(TERMINAL);
			setState(247);
			expressao_aritmetica();
			setState(248);
			match(T__1);
			setState(249);
			match(T__3);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
				case INTEIRO:
				case SIMBOLO:
				case BOOLEANO:
				case CADEIA:
				case ABISTRATO:
				case VALORES_TIPO_INTEIRO:
				case VALORES_TIPO_REAL:
				case VALORES_TIPO_SIMBOLO:
				case VALOR_TIPO_CADEIA:
				case ID:
					{
					setState(250);
					instrucoes_de_troca_de_valor();
					}
					break;
				case T__2:
				case T__6:
				case T__7:
				case T__9:
					{
					setState(251);
					instrucao_de_controle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(256);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucoes_de_troca_de_valorContext extends ParserRuleContext {
		public Declaracao_de_variavelContext declaracao_de_variavel() {
			return getRuleContext(Declaracao_de_variavelContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_de_variavelContext atribuicao_de_variavel() {
			return getRuleContext(Atribuicao_de_variavelContext.class,0);
		}
		public Instrucoes_de_troca_de_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_de_troca_de_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterInstrucoes_de_troca_de_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitInstrucoes_de_troca_de_valor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitInstrucoes_de_troca_de_valor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor() throws RecognitionException {
		Instrucoes_de_troca_de_valorContext _localctx = new Instrucoes_de_troca_de_valorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instrucoes_de_troca_de_valor);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				declaracao_de_variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				expressao_aritmetica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				atribuicao_de_variavel();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_de_funcao_metodoContext extends ParserRuleContext {
		public Tipos_de_valoresContext tipos_de_valores() {
			return getRuleContext(Tipos_de_valoresContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(FactumParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(FactumParser.TERMINAL, i);
		}
		public List<Declaracao_de_variavel_sem_atribuicaoContext> declaracao_de_variavel_sem_atribuicao() {
			return getRuleContexts(Declaracao_de_variavel_sem_atribuicaoContext.class);
		}
		public Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao(int i) {
			return getRuleContext(Declaracao_de_variavel_sem_atribuicaoContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Chamada_de_funcaoContext> chamada_de_funcao() {
			return getRuleContexts(Chamada_de_funcaoContext.class);
		}
		public Chamada_de_funcaoContext chamada_de_funcao(int i) {
			return getRuleContext(Chamada_de_funcaoContext.class,i);
		}
		public Declaracao_de_funcao_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_de_funcao_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterDeclaracao_de_funcao_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitDeclaracao_de_funcao_metodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitDeclaracao_de_funcao_metodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_de_funcao_metodoContext declaracao_de_funcao_metodo() throws RecognitionException {
		Declaracao_de_funcao_metodoContext _localctx = new Declaracao_de_funcao_metodoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracao_de_funcao_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__10);
			setState(264);
			tipos_de_valores();
			setState(265);
			match(ID);
			setState(266);
			match(T__0);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) {
				{
				setState(267);
				declaracao_de_variavel_sem_atribuicao();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(268);
					match(T__11);
					setState(269);
					declaracao_de_variavel_sem_atribuicao();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(277);
			match(T__1);
			setState(278);
			match(T__3);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(279);
					instrucao_de_controle();
					}
					break;
				case 2:
					{
					setState(280);
					instrucoes_de_troca_de_valor();
					}
					break;
				case 3:
					{
					setState(281);
					chamada_de_funcao();
					}
					break;
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(286);
			match(T__12);
			setState(287);
			match(ID);
			setState(288);
			match(TERMINAL);
			setState(289);
			match(T__4);
			setState(290);
			match(T__13);
			setState(291);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Criacao_de_tipo_abstratoContext extends ParserRuleContext {
		public TerminalNode ABISTRATO() { return getToken(FactumParser.ABISTRATO, 0); }
		public Formato_de_tipo_abstratoContext formato_de_tipo_abstrato() {
			return getRuleContext(Formato_de_tipo_abstratoContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public List<Declaracao_de_variavelContext> declaracao_de_variavel() {
			return getRuleContexts(Declaracao_de_variavelContext.class);
		}
		public Declaracao_de_variavelContext declaracao_de_variavel(int i) {
			return getRuleContext(Declaracao_de_variavelContext.class,i);
		}
		public List<Metodo_abstratoContext> metodo_abstrato() {
			return getRuleContexts(Metodo_abstratoContext.class);
		}
		public Metodo_abstratoContext metodo_abstrato(int i) {
			return getRuleContext(Metodo_abstratoContext.class,i);
		}
		public Criacao_de_tipo_abstratoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criacao_de_tipo_abstrato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterCriacao_de_tipo_abstrato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitCriacao_de_tipo_abstrato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitCriacao_de_tipo_abstrato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Criacao_de_tipo_abstratoContext criacao_de_tipo_abstrato() throws RecognitionException {
		Criacao_de_tipo_abstratoContext _localctx = new Criacao_de_tipo_abstratoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_criacao_de_tipo_abstrato);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__10);
			setState(294);
			match(T__14);
			setState(295);
			match(ABISTRATO);
			setState(296);
			match(T__3);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					declaracao_de_variavel();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(303);
			formato_de_tipo_abstrato();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) {
				{
				{
				setState(304);
				metodo_abstrato();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T__4);
			setState(311);
			match(T__13);
			setState(312);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formato_de_tipo_abstratoContext extends ParserRuleContext {
		public TerminalNode ABISTRATO() { return getToken(FactumParser.ABISTRATO, 0); }
		public List<Declaracao_de_variavel_sem_atribuicaoContext> declaracao_de_variavel_sem_atribuicao() {
			return getRuleContexts(Declaracao_de_variavel_sem_atribuicaoContext.class);
		}
		public Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao(int i) {
			return getRuleContext(Declaracao_de_variavel_sem_atribuicaoContext.class,i);
		}
		public List<Instrucao_de_restricao_de_dominioContext> instrucao_de_restricao_de_dominio() {
			return getRuleContexts(Instrucao_de_restricao_de_dominioContext.class);
		}
		public Instrucao_de_restricao_de_dominioContext instrucao_de_restricao_de_dominio(int i) {
			return getRuleContext(Instrucao_de_restricao_de_dominioContext.class,i);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public Formato_de_tipo_abstratoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formato_de_tipo_abstrato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterFormato_de_tipo_abstrato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitFormato_de_tipo_abstrato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitFormato_de_tipo_abstrato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formato_de_tipo_abstratoContext formato_de_tipo_abstrato() throws RecognitionException {
		Formato_de_tipo_abstratoContext _localctx = new Formato_de_tipo_abstratoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formato_de_tipo_abstrato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ABISTRATO);
			setState(315);
			match(T__0);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) {
				{
				setState(316);
				declaracao_de_variavel_sem_atribuicao();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(317);
					match(T__11);
					setState(318);
					declaracao_de_variavel_sem_atribuicao();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(T__1);
			setState(327);
			match(T__3);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(328);
					instrucao_de_restricao_de_dominio();
					}
					break;
				case REAL:
				case INTEIRO:
				case SIMBOLO:
				case BOOLEANO:
				case CADEIA:
				case ABISTRATO:
				case VALORES_TIPO_INTEIRO:
				case VALORES_TIPO_REAL:
				case VALORES_TIPO_SIMBOLO:
				case VALOR_TIPO_CADEIA:
				case ID:
					{
					setState(329);
					instrucoes_de_troca_de_valor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(334);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metodo_abstratoContext extends ParserRuleContext {
		public Tipos_de_valoresContext tipos_de_valores() {
			return getRuleContext(Tipos_de_valoresContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public List<Declaracao_de_variavel_sem_atribuicaoContext> declaracao_de_variavel_sem_atribuicao() {
			return getRuleContexts(Declaracao_de_variavel_sem_atribuicaoContext.class);
		}
		public Declaracao_de_variavel_sem_atribuicaoContext declaracao_de_variavel_sem_atribuicao(int i) {
			return getRuleContext(Declaracao_de_variavel_sem_atribuicaoContext.class,i);
		}
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Chamada_de_funcaoContext> chamada_de_funcao() {
			return getRuleContexts(Chamada_de_funcaoContext.class);
		}
		public Chamada_de_funcaoContext chamada_de_funcao(int i) {
			return getRuleContext(Chamada_de_funcaoContext.class,i);
		}
		public Metodo_abstratoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo_abstrato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterMetodo_abstrato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitMetodo_abstrato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitMetodo_abstrato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metodo_abstratoContext metodo_abstrato() throws RecognitionException {
		Metodo_abstratoContext _localctx = new Metodo_abstratoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_metodo_abstrato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			tipos_de_valores();
			setState(337);
			match(ID);
			setState(338);
			match(T__0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO))) != 0)) {
				{
				setState(339);
				declaracao_de_variavel_sem_atribuicao();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(340);
					match(T__11);
					setState(341);
					declaracao_de_variavel_sem_atribuicao();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(349);
			match(T__1);
			setState(350);
			match(T__3);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(351);
					instrucao_de_controle();
					}
					break;
				case 2:
					{
					setState(352);
					instrucoes_de_troca_de_valor();
					}
					break;
				case 3:
					{
					setState(353);
					chamada_de_funcao();
					}
					break;
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(T__12);
			setState(360);
			match(ID);
			setState(361);
			match(TERMINAL);
			setState(362);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_de_funcao_tipo_abstratoContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public TerminalNode ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO() { return getToken(FactumParser.ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO, 0); }
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public Chamada_de_funcao_tipo_abstratoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_de_funcao_tipo_abstrato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterChamada_de_funcao_tipo_abstrato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitChamada_de_funcao_tipo_abstrato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitChamada_de_funcao_tipo_abstrato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_de_funcao_tipo_abstratoContext chamada_de_funcao_tipo_abstrato() throws RecognitionException {
		Chamada_de_funcao_tipo_abstratoContext _localctx = new Chamada_de_funcao_tipo_abstratoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_de_funcao_tipo_abstrato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO:
				{
				setState(364);
				match(ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO);
				setState(365);
				match(T__0);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(366);
					match(ID);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(367);
						match(T__11);
						setState(368);
						match(ID);
						}
						}
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(376);
				match(T__1);
				}
				break;
			case ID:
				{
				setState(377);
				match(ID);
				setState(378);
				match(ATRIBUICAO);
				setState(379);
				match(ASSOCIACAO_DE_IDENTIFICADORES_DE_TIPO_ABSTRATO);
				setState(380);
				match(T__0);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(381);
					match(ID);
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(382);
						match(T__11);
						setState(383);
						match(ID);
						}
						}
						setState(388);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(391);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(394);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcao_principalContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public List<Instrucao_de_controleContext> instrucao_de_controle() {
			return getRuleContexts(Instrucao_de_controleContext.class);
		}
		public Instrucao_de_controleContext instrucao_de_controle(int i) {
			return getRuleContext(Instrucao_de_controleContext.class,i);
		}
		public List<Instrucoes_de_troca_de_valorContext> instrucoes_de_troca_de_valor() {
			return getRuleContexts(Instrucoes_de_troca_de_valorContext.class);
		}
		public Instrucoes_de_troca_de_valorContext instrucoes_de_troca_de_valor(int i) {
			return getRuleContext(Instrucoes_de_troca_de_valorContext.class,i);
		}
		public List<Chamada_de_funcaoContext> chamada_de_funcao() {
			return getRuleContexts(Chamada_de_funcaoContext.class);
		}
		public Chamada_de_funcaoContext chamada_de_funcao(int i) {
			return getRuleContext(Chamada_de_funcaoContext.class,i);
		}
		public Funcao_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterFuncao_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitFuncao_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitFuncao_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcao_principalContext funcao_principal() throws RecognitionException {
		Funcao_principalContext _localctx = new Funcao_principalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcao_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__10);
			setState(397);
			match(T__15);
			setState(398);
			match(T__0);
			setState(399);
			match(T__1);
			setState(400);
			match(T__3);
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(401);
					instrucao_de_controle();
					}
					break;
				case 2:
					{
					setState(402);
					instrucoes_de_troca_de_valor();
					}
					break;
				case 3:
					{
					setState(403);
					chamada_de_funcao();
					}
					break;
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << REAL) | (1L << INTEIRO) | (1L << SIMBOLO) | (1L << BOOLEANO) | (1L << CADEIA) | (1L << ABISTRATO) | (1L << VALORES_TIPO_INTEIRO) | (1L << VALORES_TIPO_REAL) | (1L << VALORES_TIPO_SIMBOLO) | (1L << VALOR_TIPO_CADEIA) | (1L << ID))) != 0) );
			setState(408);
			match(T__4);
			setState(409);
			match(T__13);
			setState(410);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_de_funcaoContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(FactumParser.TERMINAL, 0); }
		public List<TerminalNode> ID() { return getTokens(FactumParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FactumParser.ID, i);
		}
		public TerminalNode ATRIBUICAO() { return getToken(FactumParser.ATRIBUICAO, 0); }
		public Chamada_de_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_de_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).enterChamada_de_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactumListener ) ((FactumListener)listener).exitChamada_de_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactumVisitor ) return ((FactumVisitor<? extends T>)visitor).visitChamada_de_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_de_funcaoContext chamada_de_funcao() throws RecognitionException {
		Chamada_de_funcaoContext _localctx = new Chamada_de_funcaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chamada_de_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(412);
				match(ID);
				setState(413);
				match(T__0);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(414);
					match(ID);
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(415);
						match(T__11);
						setState(416);
						match(ID);
						}
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(424);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(425);
				match(ID);
				setState(426);
				match(ATRIBUICAO);
				setState(427);
				match(ID);
				setState(428);
				match(T__0);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(429);
					match(ID);
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(430);
						match(T__11);
						setState(431);
						match(ID);
						}
						}
						setState(436);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(439);
				match(T__1);
				}
				break;
			}
			setState(442);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\6\r\u008e\n\r\r\r\16\r"+
		"\u008f\3\16\3\16\3\17\3\17\3\17\3\17\6\17\u0098\n\17\r\17\16\17\u0099"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00ab\n\23\3\24\3\24\3\24\3\24\5\24\u00b1\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\6\25\u00ba\n\25\r\25\16\25\u00bb\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u00c3\n\25\r\25\16\25\u00c4\3\25\3\25\7\25\u00c9\n\25"+
		"\f\25\16\25\u00cc\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\6\27\u00dd\n\27\r\27\16\27\u00de\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\6\30\u00e7\n\30\r\30\16\30\u00e8\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\6\31\u00ff\n\31\r\31\16\31\u0100\3\31\3\31\3\32\3\32\3\32"+
		"\5\32\u0108\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0111\n\33\f"+
		"\33\16\33\u0114\13\33\5\33\u0116\n\33\3\33\3\33\3\33\3\33\3\33\6\33\u011d"+
		"\n\33\r\33\16\33\u011e\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u012d\n\34\f\34\16\34\u0130\13\34\3\34\3\34\7\34\u0134"+
		"\n\34\f\34\16\34\u0137\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35\5\35\u0147\n\35\3\35\3\35\3"+
		"\35\3\35\6\35\u014d\n\35\r\35\16\35\u014e\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u0159\n\36\f\36\16\36\u015c\13\36\5\36\u015e\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0165\n\36\f\36\16\36\u0168\13\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u0174\n\37\f\37\16\37\u0177"+
		"\13\37\5\37\u0179\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0183"+
		"\n\37\f\37\16\37\u0186\13\37\5\37\u0188\n\37\3\37\5\37\u018b\n\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \6 \u0197\n \r \16 \u0198\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\7!\u01a4\n!\f!\16!\u01a7\13!\5!\u01a9\n!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\7!\u01b3\n!\f!\16!\u01b6\13!\5!\u01b8\n!\3!\5!\u01bb\n!\3!\3!"+
		"\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\6\3\2\23\30\4\2\34\35\60\60\4\2\32\33\60\60\3\2\36!\2\u01dc\2"+
		"G\3\2\2\2\4^\3\2\2\2\6b\3\2\2\2\be\3\2\2\2\nk\3\2\2\2\fp\3\2\2\2\16u\3"+
		"\2\2\2\20z\3\2\2\2\22\177\3\2\2\2\24\u0084\3\2\2\2\26\u0088\3\2\2\2\30"+
		"\u008a\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u009b\3\2\2\2 \u009d"+
		"\3\2\2\2\"\u009f\3\2\2\2$\u00aa\3\2\2\2&\u00b0\3\2\2\2(\u00b2\3\2\2\2"+
		"*\u00cd\3\2\2\2,\u00d5\3\2\2\2.\u00e2\3\2\2\2\60\u00f3\3\2\2\2\62\u0107"+
		"\3\2\2\2\64\u0109\3\2\2\2\66\u0127\3\2\2\28\u013c\3\2\2\2:\u0152\3\2\2"+
		"\2<\u018a\3\2\2\2>\u018e\3\2\2\2@\u01ba\3\2\2\2BC\5\6\4\2CD\7/\2\2DF\3"+
		"\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\5"+
		"> \2KM\5\64\33\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3"+
		"\2\2\2QS\5\66\34\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\3\3\2\2\2"+
		"VT\3\2\2\2W_\5\6\4\2X_\5\b\5\2Y_\5\f\7\2Z_\5\n\6\2[_\5\16\b\2\\_\5\20"+
		"\t\2]_\5\22\n\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3"+
		"\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7/\2\2a\5\3\2\2\2bc\t\2\2\2cd\7\60\2\2d\7"+
		"\3\2\2\2ef\7\30\2\2fg\7\60\2\2gh\7\3\2\2hi\7\60\2\2ij\7\4\2\2j\t\3\2\2"+
		"\2kl\7\24\2\2lm\7\60\2\2mn\7.\2\2no\7\32\2\2o\13\3\2\2\2pq\7\26\2\2qr"+
		"\7\60\2\2rs\7.\2\2st\7\31\2\2t\r\3\2\2\2uv\7\23\2\2vw\7\60\2\2wx\7.\2"+
		"\2xy\7\33\2\2y\17\3\2\2\2z{\7\25\2\2{|\7\60\2\2|}\7.\2\2}~\7\34\2\2~\21"+
		"\3\2\2\2\177\u0080\7\27\2\2\u0080\u0081\7\60\2\2\u0081\u0082\7.\2\2\u0082"+
		"\u0083\7\35\2\2\u0083\23\3\2\2\2\u0084\u0085\t\2\2\2\u0085\25\3\2\2\2"+
		"\u0086\u0089\5\30\r\2\u0087\u0089\5\34\17\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\27\3\2\2\2\u008a\u008d\5\32\16\2\u008b\u008c\7\36"+
		"\2\2\u008c\u008e\5\32\16\2\u008d\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092\t\3\2"+
		"\2\u0092\33\3\2\2\2\u0093\u0097\5\36\20\2\u0094\u0095\5 \21\2\u0095\u0096"+
		"\5\36\20\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b\u009c"+
		"\t\4\2\2\u009c\37\3\2\2\2\u009d\u009e\t\5\2\2\u009e!\3\2\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7/\2\2\u00a3"+
		"#\3\2\2\2\u00a4\u00ab\7\32\2\2\u00a5\u00ab\7\33\2\2\u00a6\u00ab\7\31\2"+
		"\2\u00a7\u00ab\7\34\2\2\u00a8\u00ab\7\35\2\2\u00a9\u00ab\5\26\f\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00b1"+
		"\5\60\31\2\u00ad\u00b1\5.\30\2\u00ae\u00b1\5,\27\2\u00af\u00b1\5(\25\2"+
		"\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\7\3\2\2\u00b4"+
		"\u00b5\5*\26\2\u00b5\u00b6\7\4\2\2\u00b6\u00b9\7\6\2\2\u00b7\u00ba\5\62"+
		"\32\2\u00b8\u00ba\5&\24\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00ca\7\7\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c2\7\6\2\2\u00c0"+
		"\u00c3\5\62\32\2\u00c1\u00c3\5&\24\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00be\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		")\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7\"\2\2"+
		"\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3"+
		"\7\"\2\2\u00d3\u00d4\7\60\2\2\u00d4+\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6"+
		"\u00d7\7\3\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7\4\2\2\u00d9\u00dc\7\6"+
		"\2\2\u00da\u00dd\5\62\32\2\u00db\u00dd\5&\24\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1-\3\2\2\2\u00e2\u00e3"+
		"\7\n\2\2\u00e3\u00e6\7\6\2\2\u00e4\u00e7\5\62\32\2\u00e5\u00e7\5&\24\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ec\7\13\2\2\u00ec\u00ed\7\3\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\7"+
		"\"\2\2\u00ef\u00f0\7\60\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\7/\2\2\u00f2"+
		"/\3\2\2\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\5\"\22\2"+
		"\u00f6\u00f7\7/\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7/\2\2\u00f9\u00fa"+
		"\5\26\f\2\u00fa\u00fb\7\4\2\2\u00fb\u00fe\7\6\2\2\u00fc\u00ff\5\62\32"+
		"\2\u00fd\u00ff\5&\24\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7\7\2\2\u0103\61\3\2\2\2\u0104\u0108\5\4\3\2\u0105\u0108\5\26\f"+
		"\2\u0106\u0108\5\"\22\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\63\3\2\2\2\u0109\u010a\7\r\2\2\u010a\u010b\5\24\13"+
		"\2\u010b\u010c\7\60\2\2\u010c\u0115\7\3\2\2\u010d\u0112\5\6\4\2\u010e"+
		"\u010f\7\16\2\2\u010f\u0111\5\6\4\2\u0110\u010e\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\7\4\2\2\u0118\u011c\7\6\2\2\u0119\u011d\5&\24\2\u011a"+
		"\u011d\5\62\32\2\u011b\u011d\5@!\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u0122\7"+
		"\60\2\2\u0122\u0123\7/\2\2\u0123\u0124\7\7\2\2\u0124\u0125\7\20\2\2\u0125"+
		"\u0126\7/\2\2\u0126\65\3\2\2\2\u0127\u0128\7\r\2\2\u0128\u0129\7\21\2"+
		"\2\u0129\u012a\7\30\2\2\u012a\u012e\7\6\2\2\u012b\u012d\5\4\3\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\58\35\2\u0132"+
		"\u0134\5:\36\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\7\7\2\2\u0139\u013a\7\20\2\2\u013a\u013b\7/\2\2\u013b\67\3\2\2"+
		"\2\u013c\u013d\7\30\2\2\u013d\u0146\7\3\2\2\u013e\u0143\5\6\4\2\u013f"+
		"\u0140\7\16\2\2\u0140\u0142\5\6\4\2\u0141\u013f\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\7\4\2\2\u0149\u014c\7\6\2\2\u014a\u014d\5(\25\2\u014b"+
		"\u014d\5\62\32\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7\7\2\2\u01519\3\2\2\2\u0152\u0153\5\24\13\2\u0153\u0154\7\60\2"+
		"\2\u0154\u015d\7\3\2\2\u0155\u015a\5\6\4\2\u0156\u0157\7\16\2\2\u0157"+
		"\u0159\5\6\4\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0155\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\4"+
		"\2\2\u0160\u0166\7\6\2\2\u0161\u0165\5&\24\2\u0162\u0165\5\62\32\2\u0163"+
		"\u0165\5@!\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2"+
		"\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\17\2\2\u016a\u016b\7\60\2\2"+
		"\u016b\u016c\7/\2\2\u016c\u016d\7\7\2\2\u016d;\3\2\2\2\u016e\u016f\7,"+
		"\2\2\u016f\u0178\7\3\2\2\u0170\u0175\7\60\2\2\u0171\u0172\7\16\2\2\u0172"+
		"\u0174\7\60\2\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3"+
		"\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0170\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u018b\7\4"+
		"\2\2\u017b\u017c\7\60\2\2\u017c\u017d\7.\2\2\u017d\u017e\7,\2\2\u017e"+
		"\u0187\7\3\2\2\u017f\u0184\7\60\2\2\u0180\u0181\7\16\2\2\u0181\u0183\7"+
		"\60\2\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u017f\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7\4\2\2\u018a"+
		"\u016e\3\2\2\2\u018a\u017b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7/"+
		"\2\2\u018d=\3\2\2\2\u018e\u018f\7\r\2\2\u018f\u0190\7\22\2\2\u0190\u0191"+
		"\7\3\2\2\u0191\u0192\7\4\2\2\u0192\u0196\7\6\2\2\u0193\u0197\5&\24\2\u0194"+
		"\u0197\5\62\32\2\u0195\u0197\5@!\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\7\2\2\u019b\u019c\7\20"+
		"\2\2\u019c\u019d\7/\2\2\u019d?\3\2\2\2\u019e\u019f\7\60\2\2\u019f\u01a8"+
		"\7\3\2\2\u01a0\u01a5\7\60\2\2\u01a1\u01a2\7\16\2\2\u01a2\u01a4\7\60\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01bb\7\4\2\2\u01ab\u01ac\7\60"+
		"\2\2\u01ac\u01ad\7.\2\2\u01ad\u01ae\7\60\2\2\u01ae\u01b7\7\3\2\2\u01af"+
		"\u01b4\7\60\2\2\u01b0\u01b1\7\16\2\2\u01b1\u01b3\7\60\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\4\2\2\u01ba\u019e\3\2\2\2\u01ba"+
		"\u01ab\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7/\2\2\u01bdA\3\2\2\2\61"+
		"GNT^\u0088\u008f\u0099\u00aa\u00b0\u00b9\u00bb\u00c2\u00c4\u00ca\u00dc"+
		"\u00de\u00e6\u00e8\u00fe\u0100\u0107\u0112\u0115\u011c\u011e\u012e\u0135"+
		"\u0143\u0146\u014c\u014e\u015a\u015d\u0164\u0166\u0175\u0178\u0184\u0187"+
		"\u018a\u0196\u0198\u01a5\u01a8\u01b4\u01b7\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}