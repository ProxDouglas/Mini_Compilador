// Generated from D:/PUC_Projetos/COMP\Factum.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FactumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FactumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FactumParser#gramatica_de_factum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGramatica_de_factum(FactumParser.Gramatica_de_factumContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel(FactumParser.Declaracao_de_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_sem_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_sem_atribuicao(FactumParser.Declaracao_de_variavel_sem_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_abstrato_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_abstrato_com_atribuicao(FactumParser.Declaracao_de_variavel_abstrato_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_inteiro_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_inteiro_com_atribuicao(FactumParser.Declaracao_de_variavel_inteiro_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_booleano_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_booleano_com_atribuicao(FactumParser.Declaracao_de_variavel_booleano_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_real_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_real_com_atribuicao(FactumParser.Declaracao_de_variavel_real_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_simbolo_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_simbolo_com_atribuicao(FactumParser.Declaracao_de_variavel_simbolo_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_variavel_texto_com_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_variavel_texto_com_atribuicao(FactumParser.Declaracao_de_variavel_texto_com_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#tipos_de_valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_de_valores(FactumParser.Tipos_de_valoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica(FactumParser.Expressao_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#concatenacao_de_cadeias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenacao_de_cadeias(FactumParser.Concatenacao_de_cadeiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#tipos_de_cadeias_elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_de_cadeias_elemento(FactumParser.Tipos_de_cadeias_elementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#expressao_aritmetica_numericas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica_numericas(FactumParser.Expressao_aritmetica_numericasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#tipo_de_valores_numericos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_valores_numericos(FactumParser.Tipo_de_valores_numericosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(FactumParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#atribuicao_de_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao_de_variavel(FactumParser.Atribuicao_de_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#atribuicao_de_valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao_de_valores(FactumParser.Atribuicao_de_valoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucao_de_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_de_controle(FactumParser.Instrucao_de_controleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucao_de_restricao_de_dominio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_de_restricao_de_dominio(FactumParser.Instrucao_de_restricao_de_dominioContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#logica_proposicional_entre_comparacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogica_proposicional_entre_comparacoes(FactumParser.Logica_proposicional_entre_comparacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucao_de_repeticao_condicional_inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_de_repeticao_condicional_inicial(FactumParser.Instrucao_de_repeticao_condicional_inicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucao_de_repeticao_condicional_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_de_repeticao_condicional_final(FactumParser.Instrucao_de_repeticao_condicional_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucao_de_repeticao_com_contador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_de_repeticao_com_contador(FactumParser.Instrucao_de_repeticao_com_contadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#instrucoes_de_troca_de_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_de_troca_de_valor(FactumParser.Instrucoes_de_troca_de_valorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#declaracao_de_funcao_metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_de_funcao_metodo(FactumParser.Declaracao_de_funcao_metodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#criacao_de_tipo_abstrato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriacao_de_tipo_abstrato(FactumParser.Criacao_de_tipo_abstratoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#formato_de_tipo_abstrato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormato_de_tipo_abstrato(FactumParser.Formato_de_tipo_abstratoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#metodo_abstrato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo_abstrato(FactumParser.Metodo_abstratoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#chamada_de_funcao_tipo_abstrato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_de_funcao_tipo_abstrato(FactumParser.Chamada_de_funcao_tipo_abstratoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#funcao_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao_principal(FactumParser.Funcao_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactumParser#chamada_de_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_de_funcao(FactumParser.Chamada_de_funcaoContext ctx);
}