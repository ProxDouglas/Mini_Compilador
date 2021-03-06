

grammar Factum;


gramatica_de_factum: ((comentar)* declaracao_de_variavel_sem_atribuicao TERMINAL)* (comentar)*funcao_principal (comentar)*declaracao_de_funcao_metodo* ;



//-------------declaração de variavel e tipos de dados--------

//regra que possui todas regras de declaracao
declaracao_de_variavel    : (declaracao_de_variavel_sem_atribuicao  |
declaracao_de_variavel_booleano_com_atribuicao | declaracao_de_variavel_inteiro_com_atribuicao | declaracao_de_variavel_real_com_atribuicao
 | declaracao_de_variavel_simbolo_com_atribuicao | declaracao_de_variavel_texto_com_atribuicao) TERMINAL;


declaracao_de_variavel_sem_atribuicao : (REAL | INTEIRO | SIMBOLO | CADEIA | BOOLEANO ) ID ;

//tipos primitivos pertencentes a Factum
    REAL: 'real';
    INTEIRO: 'inteiro';
    SIMBOLO: 'simbolo';
    BOOLEANO: 'booleano';
    //tipo de factum "String"
    CADEIA: 'cadeia';
    VAZIO: 'vazio';
    //ABISTRATO: [A-Z][a-zA-Z0-9]*;

declaracao_de_variavel_inteiro_com_atribuicao : INTEIRO ID ATRIBUICAO VALORES_TIPO_INTEIRO ;
declaracao_de_variavel_booleano_com_atribuicao: BOOLEANO ID ATRIBUICAO VALORES_TIPO_BOOLEANO ;
declaracao_de_variavel_real_com_atribuicao    : REAL ID ATRIBUICAO VALORES_TIPO_REAL ;
declaracao_de_variavel_simbolo_com_atribuicao : SIMBOLO ID ATRIBUICAO VALORES_TIPO_SIMBOLO ;
declaracao_de_variavel_texto_com_atribuicao   : CADEIA ID ATRIBUICAO VALOR_TIPO_CADEIA ;

tipos_de_valores: INTEIRO | REAL | SIMBOLO | CADEIA | BOOLEANO  ;

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

concatenacao_de_cadeias : tipos_de_cadeias_elemento (SOMA tipos_de_cadeias_elemento)+;

tipos_de_cadeias_elemento : VALORES_TIPO_SIMBOLO | VALOR_TIPO_CADEIA | ID;

//aceita valores do tipo inteiro ou real
expressao_aritmetica_numericas: tipo_de_valores_numericos  (operador tipo_de_valores_numericos)+ ;

tipo_de_valores_numericos : VALORES_TIPO_INTEIRO | VALORES_TIPO_REAL | ID;
operador : SOMA | SUBTRAIR | MULTIPLICAR | DIVIDIR | RESTO_DA_DIVISAO ;

    //terminais
    SOMA: '+';
    SUBTRAIR: '-';
    MULTIPLICAR: '*';
    DIVIDIR: '/';
    RESTO_DA_DIVISAO: '%';
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
instrucao_de_controle: instrucao_de_repeticao_com_contador | instrucao_de_repeticao_condicional_final | instrucao_de_repeticao_condicional_inicial | instrucao_de_restricao_de_dominio;

instrucao_de_restricao_de_dominio: 'se' '(' logica_proposicional_entre_comparacoes ')' '{'  (instrucoes_de_troca_de_valor | instrucao_de_controle)+  '}'
 ('senao' '{' (instrucoes_de_troca_de_valor | instrucao_de_controle)+ '}')*;

//simbolos de logica proposicional
SIMBOLO_LOGICO: CONJUCAO | DIJUNCAO;

CONJUCAO: '&&';
DIJUNCAO: '||';

logica_proposicional_entre_comparacoes: ID SIMBOLOS_DE_COMPARACAO ID ( SIMBOLO_LOGICO  ID SIMBOLOS_DE_COMPARACAO ID);


instrucao_de_repeticao_condicional_inicial: 'enquanto' '(' logica_proposicional_entre_comparacoes ')' '{' (instrucoes_de_troca_de_valor | instrucao_de_controle)+ '}' ;

instrucao_de_repeticao_condicional_final: 'repita' '{' (instrucoes_de_troca_de_valor | instrucao_de_controle)+ '}' 'ate' '(' ID SIMBOLOS_DE_COMPARACAO ID ')' TERMINAL;

instrucao_de_repeticao_com_contador: 'para'  '(' atribuicao_de_variavel ';' logica_proposicional_entre_comparacoes ';' expressao_aritmetica ')' '{' (instrucoes_de_troca_de_valor | instrucao_de_controle)+  '}' ;


//regra de producao que engloba as instrucoes de troca de valor
instrucoes_de_troca_de_valor :  expressao_aritmetica | atribuicao_de_variavel;

//declaracao de funcao___________________________________________________________________________________________________________

declaracao_de_funcao_metodo: 'INICIO' (tipos_de_valores | VAZIO) ID '(' (declaracao_de_variavel_sem_atribuicao (',' declaracao_de_variavel_sem_atribuicao)*)? ')' '{'
    declaracao_de_variavel* (instrucao_de_controle | instrucoes_de_troca_de_valor | chamada_de_funcao)+ 'retorna' ID TERMINAL '}''FIM' TERMINAL;


funcao_principal: 'INICIO' 'main' '(' ')' '{' declaracao_de_variavel+ (instrucao_de_controle | instrucoes_de_troca_de_valor | chamada_de_funcao)+ '}''FIM' TERMINAL;


chamada_de_funcao : (ID '(' (ID (',' ID)*)? ')' | ID ATRIBUICAO ID '(' (ID (',' ID)*)? ')' ) TERMINAL;


comentar: COMENTAR_LINHA | COMENTAR_BLOCO;

COMENTAR_LINHA: [//] ;
COMENTAR_BLOCO: [/*]  [\u0000-\u007F]+ [*/];


//terminais importantes
    DIG: [0-9]+;
    ATRIBUICAO: '=';           //sibolo para troca de valor de variavel
    TERMINAL: ';';             //marcador de termino da expressao
    ID:  [a-zA-Z][a-zA-Z0-9]*;  // utilizado para geracao de nomes para variaveis ou funcao


    SEP  : [ \t\r\n]+ -> skip;



