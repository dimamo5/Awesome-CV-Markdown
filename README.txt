PROJECT TITLE: MCV: Markdown-like language for CVs

GROUP:
	NAME: Diogo Moura, 
	NR: up201304068,  	
	GRADE: 15.90, 
	CONTRIBUTION: 25 %,

	NAME: Inês Carneiro, 
	NR: up201303501,  	
	GRADE: 18.85, 
	CONTRIBUTION: 25 %,

	NAME: João Silva, 
	NR: up201305892,  	
	GRADE: 17.10, 
	CONTRIBUTION: 25 %,

	NAME: Sérgio Domingues, 
	NR: up201304367,  	
	GRADE: 14.50, 
	CONTRIBUTION: 25 %,


SUMMARY: O nosso projeto consiste numa aplicação que auxilia na criação de CVs mais apelativas e originais. 
	 A partir de um interpretador de um markdown definido e criado por nós a aplicação, recebendo um ficheiro .md que contem
	 uma CV detalhada, devolve ao utilizador um ficheiro LaTex que é utilizado para gerar um ficheiro PDF e ainda uma pagina HTML. 
	 É permitido ainda ao utilizador personalizar a sua CV, por exemplo gerar uma versão curta ou longa, escolher uma cor ao seu gosto 
	 e ainda escolher que ícones de fontawsome utilizar.


DEALING WITH SYNTACTIC ERRORS: Aquando do aparecimento de um erro de sintaxe o programa continua a ler o ficheiro até ao final.
			       Indicando no final todos os erros encontrados, com uma mensagem com a seguinte formatação:
				
				<linha com erro> <caracter> <o input esperado>

SEMANTIC ANALYSIS: No caso do nosso trabalho, não há grande oportunidade de explorar erros semânticos, 
		   uma vez que só há probabilidade de ocorrerem aquando da inserção de ícones de estrelas.
		   Um ícone de estrela é formado por: {stars <numero de estrelas>/<total do numero de estrelas>} 
		   em que por lapso o utilizador pode inserir um numero de estrelas superior ao numero total.


INTERMEDIATE REPRESENTATIONS (IRs): Como representação intermédia, definiu-se que uma CV se encontra dividida em cabeçalho e blocos de informação. 
				    Sendo que o cabeçalho vai conter a informação do utilizador, por exemplo os seus contactos de trabalho,
				    as suas qualificações e ainda a sua morada. Os blocos de informação conterão por exemplo os estabelecimentos de ensino 
				    que frequentou quais as suas notas, que linguagem conhece e por ai em diante. Todos os blocos poderão conter um ou mais sub-blocos
				    que por sua vez podem conter Listas, Tabelas ou simplesmente Texto corrido.
				    Tanto a representação intermédia de alto como baixo nível são iguais, temos a CV que está dividida em blocos com sub-blocos 
				    com header, listas, tabelas ou texto.


CODE GENERATION: Após o processamento do ficheiro de Markdown, são criadas todas as estruturas que ficaram a ele associadas.
		 Para geração de LaTex, optou-se por se criar todos os ficheiros associados a cada bloco individualmente 
		 e juntar o ficheiro apenas no final da criação dos blocos. 
		 Todos estes blocos de código encontram-se dentro de uma pasta, com o nome do ficheiro .md fornecido, dentro da pasta resources/generated.
		 Para a geração do código HTML optou-se por se ir criando o ficheiro de forma continua sem se dividir nada.


OVERVIEW: A nossa aplicação começa por processar o ficheiro fornecido pelo utilizador. Caso apareçam erros o programa não para de correr, 
	  no entanto o código em LaTex e HTML não será gerado e será mostrada uma mensagem de erro. 
	  Caso contrario será gerado o código pretendido sem erros e serão mostrados os ficheiros.
	  Como bibliotecas externas o grupo optou por fazer recurso de ANTLR4.


TESTSUITE AND TEST INFRASTRUCTURE: Nós temos 5 testes diferentes. Um para mostrar as mensagens de erro relativas a erros de semantica e outro para erros de sintaxe.
				   

(Describe the content of your testsuite regarding the number of examples,
					the approach to automate the test, etc.)


TASK DISTRIBUTION: Todas as tarefas foram dividas igualmente por todos os elementos do grupo. 
		   Algumas foram feitas em conjunto e outras, que por algum impedimento não o poderiam ser feitas, 
		   cada elemento do grupo trabalhava em tarefas em especifico. Sendo que no final seriam todas unidas, 
	           optamos por usar o GitHub para o desenvolvimento do projeto, optando por um modelo de desenvolvimento baseado em Feature Flow.


PROS: Uma das grandes vantagens do nosso projeto é a facilidade com que o utilizador com um único ficheiro pode criar multiplas CVs diferentes,
      personalizadas de acordo com o que utilizador procura.



CONS: Um dos aspetos negativos é o facto de ter de utilizar e especificar toda a sua CV previamente num ficheiro Markdown, linguagem que foi pensada e criada pelo grupo.
      Apesar de intuitiva e muito próxima ao markdown utilizado pelo GitHub, ferramenta que muitos já se encontram familiarizados, 
      poderia estar mais desenvolvida e permitir ao utilizador ainda criar mais estruturas que, por conseguinte, permitiria mais personalização da CV final.


ANEXO: A titulo de curiosidade a linguagem de Markdown que definimos consiste em:

Headers:
# For something very important 
## For something Important 

Os blocos podem conter Listas, Tabelas ou Texto corrido.

Lists:
* List header
> List item


Tables:
Table header:

FisrtHeader ^ SecondHeader ^ ThirdHeader

Table item:

FisrtItem | SecondItem | ThirdItem

Todas as listas e tabelas podem conter itens, como data, local ou classificação em estrelas. O programa suporta todos os icons fornecidos pelo Fontawsome.

Icon:
{iconName}

Classification in stars:
{stars numbofStars/totalNumber}

Examples of special icons suported:
{mobile}
{linkedin}
{email}
{github}

Todos os blocos encontram-se divididos por se

Block spliter:
===