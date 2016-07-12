PROJECT TITLE: MCV: Markdown-like language for CVs


GROUP:
	NAME: Diogo Moura, 
	NR: up201304068,  	
	GRADE: 20, 
	CONTRIBUTION: 25 %,

	NAME: In�s Carneiro, 
	NR: up201303501,  	
	GRADE: 20, 
	CONTRIBUTION: 25 %,

	NAME: Jo�o Silva, 
	NR: up201305892,  	
	GRADE: 20, 
	CONTRIBUTION: 25 %,

	NAME: S�rgio Domingues, 
	NR: up201304367,  	
	GRADE: 20
, 
	CONTRIBUTION: 25 %,


SUMMARY: O nosso projeto consiste numa aplica��o que auxilia na cria��o de CVs mais apelativas e originais. 
	 A partir de um interpretador de um markdown definido e criado por n�s a aplica��o, recebendo um ficheiro .md que contem
	 uma CV detalhada, devolve ao utilizador um ficheiro LaTex que � utilizado para gerar um ficheiro PDF e ainda uma pagina HTML. 
	 � permitido ainda ao utilizador personalizar a sua CV, por exemplo gerar uma vers�o curta ou longa, escolher uma cor ao seu gosto 
	 e ainda escolher que �cones de fontawsome utilizar.


DEALING WITH SYNTACTIC ERRORS: Aquando do aparecimento de um erro de sintaxe o programa continua a ler o ficheiro at� ao final.
			       Indicando no final todos os erros encontrados, com uma mensagem com a seguinte formata��o:
				
				<linha com erro> <caracter> <o input esperado>

SEMANTIC ANALYSIS: No caso do nosso trabalho, n�o h� grande oportunidade de explorar erros sem�nticos, 
		   uma vez que s� h� probabilidade de ocorrerem aquando da inser��o de �cones de estrelas, de variáveis e ainda alterações de texto a bold e itálico.
		   Um �cone de estrela � formado por: {stars <numero de estrelas>/<total do numero de estrelas>} 
		   em que por lapso o utilizador pode inserir um numero de estrelas superior ao numero total.
		   Uma variável pode ser definido por: /variablesName = definition
		   em que por lapso o utilizador pode inserir uma definição não valida como por exemplo o nome de outra variavel não definida.
		   No que toca a erros associados ao texto a bold ou itálico o programa apenas crasha quando o utilizador se esquece de terminar a utilização a itálico, esta é definida com *word*.
		   Por sua vez no que toca á utilização de bold o programa não tem problemas umas vez que caso por lapso o utilizador se esqueça de terminar a sua utilização o programa define a palavra na mesma como Bold, esta é definida com **word**.
		   Poderá tambem acontecer o utilizador utilizar uma variavel não definida.
		   Para analise sem�ntica para verifica��o de erros, o grupo depois de analisar o projecto optou por, 
		   em vez de usar tabela de simbolos fazer uso de estruturas para representar os dados. 
		   Uma vez que n�o temos variaveis e por conseguinte n�o faria sentido a tabela de simbolos.  


INTERMEDIATE REPRESENTATIONS (IRs): Como representa��o interm�dia, definiu-se que um CV se encontra dividida em cabe�alho e blocos de informa��o. 
				    Sendo que o cabe�alho vai conter a informa��o do utilizador, por exemplo os seus contactos de trabalho,
				    as suas qualifica��es e ainda a sua morada. Os blocos de informa��o conter�o por exemplo os estabelecimentos de ensino 
				    que frequentou quais as suas notas, que linguagem conhece e por ai em diante. Todos os blocos poder�o conter um ou mais sub-blocos
				    que por sua vez podem conter Listas, Tabelas ou simplesmente Texto corrido. Em todos os blocos é permitido usar variaveis definidas antes do header e ainda alterar o texto para italico e bold.
				    Permitimos ainda alteração de texto optando entre bold e itálico.
				    Tanto a representa��o interm�dia de alto como baixo n�vel s�o iguais, temos a CV que est� dividida em blocos com sub-blocos 
				    com header, listas, tabelas ou texto.


CODE GENERATION: Ap�s o processamento do ficheiro de Markdown, s�o criadas todas as estruturas que ficar�o a ele associadas.
		 Para gera��o de LaTex, optou-se por se criar todos os ficheiros associados a cada bloco individualmente 
		 e juntar os ficheiros apenas no final da cria��o dos blocos. 
		 Todos estes blocos de c�digo encontram-se dentro de uma pasta, com o nome do ficheiro .md fornecido, dentro da pasta resources/generated.
		 Para a gera��o do c�digo HTML optou-se por se ir criando o ficheiro de forma continua sem se dividir nada.


OVERVIEW: A nossa aplica��o come�a por processar o ficheiro fornecido pelo utilizador. Caso apare�am erros o programa n�o para de correr, 
	  no entanto o c�digo em LaTex e HTML n�o ser� gerado e ser� mostrada uma mensagem de erro. 
	  Caso contrario ser� gerado o c�digo pretendido sem erros e ser�o mostrados os ficheiros.
	  Como bibliotecas externas o grupo optou por fazer recurso de ANTLR4.


TESTSUITE AND TEST INFRASTRUCTURE: N�s temos 5 testes diferentes. Um para mostrar as mensagens de erro relativas a erros de semantica e outro para erros de sintaxe.

				

TASK DISTRIBUTION: Todas as tarefas foram dividas igualmente por todos os elementos do grupo. 
		   Algumas foram feitas em conjunto e outras, que por algum impedimento n�o o poderiam ser feitas, 
		   cada elemento do grupo trabalhava em tarefas em especifico. Sendo que no final seriam todas unidas, 
	       optamos por usar o GitHub para o desenvolvimento do projeto, optando por um modelo de desenvolvimento baseado em Feature Flow.


PROS: Uma das grandes vantagens do nosso projeto � a facilidade com que o utilizador com um �nico ficheiro pode criar multiplas CVs diferentes,
      personalizadas de acordo com o que utilizador procura.



CONS: Um dos aspetos negativos � o facto de ter de utilizar e especificar toda a sua CV previamente num ficheiro Markdown, linguagem que foi pensada e criada pelo grupo.
      Apesar de intuitiva e muito pr�xima ao markdown utilizado pelo GitHub, ferramenta que muitos j� se encontram familiarizados, 
      poderia estar mais desenvolvida e permitir ao utilizador ainda criar mais estruturas que, por conseguinte, permitiria mais personaliza��o da CV final.


ANEXO: A titulo de curiosidade a linguagem de Markdown que definimos consiste em:

Headers:
# For something very important 
## For something Important 

Os blocos podem conter Listas, Tabelas ou Texto corrido. Poderá usar a qualquer momento as variavéis definidas antes do header ao longo dos blocos.

Lists:
* List header
> List item

Define a variable:
/variablesName = definition


Bold text:
**Word**

Italic text:
*Word*

Tables:
Table header:

FisrtHeader ^ SecondHeader ^ ThirdHeader

Table item:

FisrtItem | SecondItem | ThirdItem

Todas as listas e tabelas podem conter itens, como data, local ou classifica��o em estrelas. O programa suporta todos os icons fornecidos pelo Fontawsome.

Icon:
{iconName}

Classification in stars:
{stars numbofStars/totalNumber}

Examples of special icons suported:
{mobile}
{linkedin}
{email}
{github}

Todos os blocos encontram-se divididos por se: 

Block spliter:
===


NOTA: Todos os ficheiros t�m de terminar com ===