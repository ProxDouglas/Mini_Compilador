
grammar Factum;


//-------------declaração de variavel e tipos de dados--------

//regra que possui todas regras de declaracao
declaracao_de_variavel    : declaracao_de_variavel_sem_atribuicao | declaracao_de_variavel_abstrato_com_atribuicao |
declaracao_de_variavel_booleano_com_atribuicao | declaracao_de_variavel_inteiro_com_atribuicao | declaracao_de_variavel_real_com_atribuicao
 | declaracao_de_variavel_simbolo_com_atribuicao | declaracao_de_variavel_texto_com_atribuicao;

//declaracao de variavel sem atribuicao
declaracao_de_variavel_sem_atribuicao : (REAL | INTEIRO | SIMBOLO | CADEIA | ABISTRATO) ID TERMINAL;

//tipos primitivos pertencentes a Factum
    REAL: 'real';
    INTEIRO: 'inteiro';
    SIMBOLO: 'simbolo';
    BOOLEANO: 'booleano';
    //tipo de factum "String"
    CADEIA: 'cadeia';
    ABISTRATO: [A-Z][a-zA-Z0-9]*;

//declaracao de variaveis com atribuicao para inicializacao de variavel
declaracao_de_variavel_abstrato_com_atribuicao: ABISTRATO ID '(' ID ')' TERMINAL ;
declaracao_de_variavel_inteiro_com_atribuicao : INTEIRO ID ATRIBUICAO VALORES_TIPO_INTEIRO TERMINAL;
declaracao_de_variavel_booleano_com_atribuicao: BOOLEANO ID ATRIBUICAO VALORES_TIPO_BOOLEANO TERMINAL;
declaracao_de_variavel_real_com_atribuicao    : REAL ID ATRIBUICAO VALORES_TIPO_REAL TERMINAL;
declaracao_de_variavel_simbolo_com_atribuicao : SIMBOLO ID ATRIBUICAO VALORES_TIPO_SIMBOLO TERMINAL;
declaracao_de_variavel_texto_com_atribuicao   : CADEIA ID ATRIBUICAO VALOR_TIPO_CADEIA TERMINAL;



    //valores de atribuicao de tipos pertencentes a factum
    VALORES_TIPO_BOOLEANO: 'true' | 'false';
    VALORES_TIPO_INTEIRO: [0-9]+ | '(''-'?[0-9]+')';
    VALORES_TIPO_REAL: [0-9]+ '.' [0-9]+ | '(''-'?[0-9]+ '.' [0-9]+')';
    VALORES_TIPO_SIMBOLO: ['][a-zA-Z0-9]['];
    VALOR_TIPO_CADEIA: '"' [\u0000-\u007F]+ '"';


//------------------------------------------------------------------
//Expressoes aritmeticas__________________________________________________________________________
//concatenacao de cadeias
expressao_aritmetica : concatenacao_de_cadeias | expressao_aritmetica_numericas;

concatenacao_de_cadeias : TIPOS_DE_CADEIAS_ELEMENTOS (SOMA TIPOS_DE_CADEIAS_ELEMENTOS)+;

TIPOS_DE_CADEIAS_ELEMENTOS : VALORES_TIPO_SIMBOLO | VALOR_TIPO_CADEIA;

//aceita valores do tipo inteiro ou real
expressao_aritmetica_numericas: tipo_de_valores_numericos (operador tipo_de_valores_numericos)+ ;

tipo_de_valores_numericos : VALORES_TIPO_INTEIRO | VALORES_TIPO_REAL;
operador : SOMA | SUBTRAIR | MULTIPLICAR | DIVIDIR ;

    //terminais
    SOMA: '+';
    SUBTRAIR: '-';
    MULTIPLICAR: '*';
    DIVIDIR: '/';
//------------------------------------------------------------------------------------------------
//Atribuicao de variaveis_________________________________________________________________________
atribuicao_de_variavel: ID ATRIBUICAO atribuicao_de_valores TERMINAL;

atribuicao_de_valores   : VALORES_TIPO_INTEIRO | VALORES_TIPO_REAL | VALORES_TIPO_BOOLEANO | VALORES_TIPO_SIMBOLO | VALOR_TIPO_CADEIA | expressao_aritmetica;


//funcoes----------------------------------------------------------------------------------------

//comparacoes
SIMBOLOS_DE_COMPARACAO: MENOR | MENOR_IGUAL | MAIOR | MAIOR_IGUAL | IGUAL | DIFERENTE;

IGUAL      : '==';
MENOR_IGUAL: '<=';
MENOR      : '<' ;   //o nome menor se refere da esquerda para direita não tendo muita relevancia o nome na comparacao
MAIOR_IGUAL: '>=';
MAIOR      : '>' ;
DIFERENTE  : '!=';


//condicional "if" "else"__________________________________________________________________________
funcao_de_restricao_de_dominio: 'se' '(' ID SIMBOLOS_DE_COMPARACAO ID ')' '{'  instrucoes_de_troca_de_valor+  '}' ('senao' '{' instrucoes_de_troca_de_valor+ '}')*;

repeticao_condicional_inicial: 'enquanto' '(' ID SIMBOLOS_DE_COMPARACAO ID ')' '{' instrucoes_de_troca_de_valor+ '}' ;

repeticao_condicional_final: 'repita' '{' instrucoes_de_troca_de_valor+ '}' 'ate' '(' ID SIMBOLOS_DE_COMPARACAO ID ')';

repeticao_com_contador: 'para'  '(' ID ATRIBUICAO ID ';' ID SIMBOLOS_DE_COMPARACAO ID ';' expressao_aritmetica ')' '{' instrucoes_de_troca_de_valor+  '}' ;


//regra de producao que engloba as instrucoes de troca de valor
instrucoes_de_troca_de_valor : declaracao_de_variavel | expressao_aritmetica | atribuicao_de_variavel;

//___________________________________________________________________________________________________________

//terminais importantes
    DIG: [0-9]+;
    ATRIBUICAO: '=';           //sibolo para troca de valor de variavel
    TERMINAL: ';';             //marcador de termino da expressao
    ID:  [a-zA-Z][a-zA-Z0-9]*;  // utilizado para geracao de nomes para variaveis ou funcao


    SEP  : [ \t\r\n]+ -> skip;


