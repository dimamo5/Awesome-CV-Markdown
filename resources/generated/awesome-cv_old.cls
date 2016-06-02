%% Start of file `awesome-cv.cls'.
%% Copyright 2015 Claud D. Park <posquit0.bj@gmail.com>
%


% -------------------------------------------------------------------------------
% Identification
% -------------------------------------------------------------------------------
\ProvidesClass{awesome-cv}[2015/11/19 v1.1.0 Awesome Curriculum Vitae Class]
\NeedsTeXFormat{LaTeX2e}


% -------------------------------------------------------------------------------
% Class options
%
% (need to be done before the external package loading, for example because
% we need \paperwidth, \paperheight and \@ptsize to be defined before loading
% geometry and fancyhdr)
% -------------------------------------------------------------------------------
% Options for draft or final
\DeclareOption{draft}{\setlength\overfullrule{5pt}}
\DeclareOption{final}{\setlength\overfullrule{0pt}}
% Inherit options of article
\DeclareOption*{
  \PassOptionsToClass{\CurrentOption}{article}
}
\ProcessOptions\relax
\LoadClass{article}


% -------------------------------------------------------------------------------
% 3rd party packages
% -------------------------------------------------------------------------------
% Needed to make long tables
\RequirePackage{tabu}
\RequirePackage{longtable}
\RequirePackage{multirow}

% Needed to make math operations
\RequirePackage{fp}
\RequirePackage{calc}
% Needed to make for loops
\RequirePackage{pgffor}
% Needed to make fixed length table
\RequirePackage{array}
% Needed to handle list environment
\RequirePackage{enumitem}
% Needed to handle text alignment
\RequirePackage{ragged2e}
% Needed to configure page layout
\RequirePackage{geometry}
% Needed to make header & footer effeciently
\RequirePackage{fancyhdr}
% Needed to manage colors
\RequirePackage[table,svgnames]{xcolor}
% Needed to use \ifxetex-\else-\fi statement
\RequirePackage{ifxetex}
% Needed to use \if-\then-\else statement
\RequirePackage{xifthen}
% Needed to use a toolbox of programming tools
\RequirePackage{etextools}
% Needed to manage fonts
\ifxetex
\RequirePackage[quiet]{fontspec}
% To support LaTeX quoting style
\defaultfontfeatures{Ligatures=TeX}
\else
\RequirePackage[T1]{fontenc}
% Replace by the encoding you are using
\RequirePackage[utf8]{inputenc}
\fi
% Needed to manage math fonts
\RequirePackage[math-style=TeX,vargreek-shape=unicode]{unicode-math}
% Needed to use icons from font-awesome
% (https://github.com/furl/latex-fontawesome)
\RequirePackage{fontawesome}
% Needed to deal a paragraphs
\RequirePackage{parskip}
% Needed to deal hyperlink
\RequirePackage{hyperref}
\hypersetup{
  pdftitle={},
  pdfauthor={},
  pdfsubject={},
  pdfkeywords={},
  colorlinks=false,
  hidelinks, % do not highlight hyperlinks -- looks ugly
}


% -------------------------------------------------------------------------------
% Configuration for directory locations
% -------------------------------------------------------------------------------
% Configure a directory location for fonts(default: 'fonts/')
\newcommand*{\fontdir}[1][fonts/]{\def\@fontdir{#1}}
\fontdir


% -------------------------------------------------------------------------------
% Configuration for layout
% -------------------------------------------------------------------------------
%% Page Layout
% Configure page margins with geometry
\geometry{left=2.0cm, top=1.5cm, right=2.0cm, bottom=2.0cm, footskip=.5cm}

%% Header & Footer
% Set offset to each header and offset
\fancyhfoffset{0em}
% Remove head rule
\renewcommand{\headrulewidth}{0pt}
% Clear all header & footer fields
\fancyhf{}
% Enable if you want to make header or footer using fancyhdr
\pagestyle{fancy}


% -------------------------------------------------------------------------------
% Configuration for colors
% -------------------------------------------------------------------------------
% Gray-scale colors
\definecolor{white}{HTML}{FFFFFF}
\definecolor{black}{HTML}{000000}
\definecolor{darkgray}{HTML}{333333}
\definecolor{gray}{HTML}{5D5D5D}
\definecolor{light-gray}{gray}{0.95}
% Basic colors
\definecolor{green}{HTML}{C2E15F}
\definecolor{orange}{HTML}{FDA333}
\definecolor{purple}{HTML}{D3A4F9}
\definecolor{red}{HTML}{FB4485}
\definecolor{blue}{HTML}{6CE0F1}
% Text colors
\definecolor{darktext}{HTML}{414141}
\colorlet{text}{darkgray}
\colorlet{graytext}{gray}
\colorlet{lighttext}{lightgray}
% Awesome colors
\definecolor{awesome-emerald}{HTML}{00A388}
\definecolor{awesome-skyblue}{HTML}{0395DE}
\definecolor{awesome-red}{HTML}{DC3522}
\definecolor{awesome-pink}{HTML}{EF4089}
\definecolor{awesome-orange}{HTML}{FF6138}
\definecolor{awesome-nephritis}{HTML}{27AE60}
\definecolor{awesome-concrete}{HTML}{95A5A6}
\definecolor{awesome-darknight}{HTML}{131A28}
\colorlet{awesome}{awesome-red}


\newcolumntype{s}{>{\hsize=.5\hsize}X}



% Awesome section color
\newcounter{colorCounter}
\def\@sectioncolor#1#2#3{%
  {%
    \color{%
      \ifcase\value{colorCounter}%
      awesome\or%
      awesome\or%
      awesome\or%
      awesome\or%
      awesome\else%
      awesome\fi%
    } #1#2#3%
  }%
  \stepcounter{colorCounter}%
}

\newcommand{\subsectioncolor}[1]{%
  \colorlet{awesome-subsection}{awesome!70!black}
  \@mboxed { } #1 { } \@empty%
}

\def\@mboxed#1 #2{%
  #1 \space  %
  \ifx #2\@empty\else %
  \expandafter\@mboxed %
  \fi %
  {{\color{awesome-subsection}#2}}%
}
% -------------------------------------------------------------------------------
% Configuration for fonts
% -------------------------------------------------------------------------------
% Set font for header (default is Roboto)
\newfontfamily\headerfont[
Path=\@fontdir,
UprightFont=*-Regular,
ItalicFont=*-Italic,
BoldFont=*-Bold,
BoldItalicFont=*-BoldItalic,
]{Roboto}

\newfontfamily\headerfontlight[
Path=\@fontdir,
UprightFont=*-Thin,
ItalicFont=*-ThinItalic,
BoldFont=*-Medium,
BoldItalicFont=*-MediumItalic,
]{Roboto}

% Set font for footer (default is Source Sans Pro)
\newfontfamily\footerfont[
Path=\@fontdir,
UprightFont=*-Regular,
ItalicFont=*-It,
BoldFont=*-Bold
]{SourceSansPro}

% Set font for body (default is Source Sans Pro)
\newfontfamily\bodyfont[
Path=\@fontdir,
UprightFont=*-Regular,
ItalicFont=*-It,
BoldFont=*-Bold,
BoldItalicFont=*-BoldIt
]{SourceSansPro}

\newfontfamily\bodyfontlight[
Path=\@fontdir,
UprightFont=*-Light,
ItalicFont=*-LightIt,
BoldFont=*-Semibold,
BoldItalicFont=*-SemiboldIt
]{SourceSansPro}


% -------------------------------------------------------------------------------
% Configuration for styles
% -------------------------------------------------------------------------------
% Configure styles for each CV elements
% For fundamental structures
\newcommand*{\headerfirstnamestyle}[1]{{\fontsize{32pt}{1em}\headerfontlight\color{graytext} #1}}
\newcommand*{\headerlastnamestyle}[1]{{\fontsize{32pt}{1em}\headerfont\bfseries\color{text} #1}}
\newcommand*{\headerpositionstyle}[1]{{\fontsize{7.6pt}{1em}\bodyfont\scshape\color{awesome} #1}}
\newcommand*{\headeraddressstyle}[1]{{\fontsize{8pt}{1em}\headerfont\itshape\color{lighttext} #1}}
\newcommand*{\headersocialstyle}[1]{{\fontsize{6.8pt}{1em}\headerfont\color{text} #1}}
\newcommand*{\headerquotestyle}[1]{{\fontsize{11pt}{1em}\headerfont\color{awesome} #1}}
\newcommand*{\footerstyle}[1]{{\fontsize{8pt}{1em}\footerfont\scshape\color{lighttext} #1}}
\newcommand*{\sectionstyle}[1]{{\fontsize{16pt}{1em}\bodyfont\bfseries\color{text}\@sectioncolor #1}}
\newcommand*{\subsectionstyle}[1]{{\fontsize{13pt}{1em}\bodyfont\scshape\textcolor{text}\expandafter\subsectioncolor{#1}}}

% For elements of entry
\newcommand*{\entrytitlestyle}[1]{{\fontsize{10pt}{1em}\bodyfont\bfseries\color{darktext} #1}}
\newcommand*{\entrypositionstyle}[1]{{\fontsize{8pt}{1em}\bodyfont\scshape\color{graytext} #1}}
\newcommand*{\entrydatestyle}[1]{{\fontsize{8pt}{1em}\bodyfontlight\slshape\color{graytext} #1}}
\newcommand*{\entrylocationstyle}[1]{{\fontsize{9pt}{1em}\bodyfontlight\slshape\color{awesome} #1}}
\newcommand*{\descriptionstyle}[1]{{\fontsize{9pt}{1em}\bodyfontlight\upshape\color{text} #1}}

% For elements of subentry
\newcommand*{\subentrytitlestyle}[1]{{\fontsize{8pt}{1em}\bodyfont\mdseries\color{graytext} #1}}
\newcommand*{\subentrypositionstyle}[1]{{\fontsize{7pt}{1em}\bodyfont\scshape\color{graytext} #1}}
\newcommand*{\subentrydatestyle}[1]{{\fontsize{7pt}{1em}\bodyfontlight\slshape\color{graytext} #1}}
\newcommand*{\subentrylocationstyle}[1]{{\fontsize{7pt}{1em}\bodyfontlight\slshape\color{awesome} #1}}
\newcommand*{\subdescriptionstyle}[1]{{\fontsize{8pt}{1em}\bodyfontlight\upshape\color{text} #1}}

% For elements of honor
\newcommand*{\honortitlestyle}[1]{{\fontsize{10pt}{1em}\bodyfont\color{graytext} #1}}
\newcommand*{\honorsummarystyle}[1]{{\fontsize{9pt}{1em}\bodyfont\color{graytext} #1}}
\newcommand*{\honorpositionstyle}[1]{{\fontsize{10pt}{1em}\bodyfont\bfseries\color{darktext} #1}}
\newcommand*{\honordatestyle}[1]{{\fontsize{10pt}{1em}\bodyfont\color{graytext} #1}}
\newcommand*{\honorlocationstyle}[1]{{\fontsize{10pt}{1em}\bodyfontlight\slshape\color{awesome} #1}}

% For elements of keyval
\newcommand*{\keyvalstylekey}[1]{{\textbf{\fontsize{10pt}{1em}\bodyfont\color{graytext} #1}}}
\newcommand*{\keyvalstylevalue}[1]{{\fontsize{10pt}{1em}\bodyfont\color{text} #1}}



% For elements of skill
\newcommand*{\skilltypestyle}[1]{{\fontsize{10pt}{1em}\bodyfont\bfseries\color{darktext} #1}}
\newcommand*{\skillsetstyle}[1]{{\fontsize{9pt}{1em}\bodyfontlight\color{text} #1}}


% -------------------------------------------------------------------------------
% Commands for personal information
% -------------------------------------------------------------------------------
% Define writer's name
% Usage: \name{<firstname>}{<lastname>}
% Usage: \firstname{<firstname>}
% Usage: \lastname{<lastname>}
% Usage: \familyname{<familyname>}
\newcommand*{\name}[2]{\def\@firstname{#1}\def\@lastname{#2}}
\newcommand*{\firstname}[1]{\def\@firstname{#1}}
\newcommand*{\lastname}[1]{\def\@lastname{#1}}
\newcommand*{\familyname}[1]{\def\@lastname{#1}}
\def\@familyname{\@lastname}

% Define writer's address
% Usage: \address{<address>}
\newcommand*{\address}[1]{\def\@address{#1}}

% Define writer's position
% Usage: \name{<position>}
\newcommand*{\position}[1]{\def\@position{#1}}

% Defines writer's mobile (optional)
% Usage: \mobile{<mobile number>}
\newcommand*{\mobile}[1]{\def\@mobile{#1}}

% Defines writer's email (optional)
% Usage: \email{<email adress>}
\newcommand*{\email}[1]{\def\@email{#1}}

% Defines writer's homepage (optional)
% Usage: \homepage{<url>}
\newcommand*{\homepage}[1]{\def\@homepage{#1}}

% Defines writer's github (optional)
% Usage: \github{<github-nick>}
\newcommand*{\github}[1]{\def\@github{#1}}

% Defines writer's linked-in (optional)
% Usage: \linkedin{<linked-in-nick>}
\newcommand*{\linkedin}[1]{\def\@linkedin{#1}}

% Defines writer's skype (optional)
% Usage: \skype{<skype account>}
\newcommand*{\skype}[1]{\def\@skype{#1}}

% Defines writer's twitter (optional)
% Usage: \twitter{<twitter handle>}
\newcommand*{\twitter}[1]{\def\@twitter{#1}}

% Defines writer's quote (optional)
% Usage: \quote{<quote>}
\renewcommand*{\quote}[1]{\def\@quote{#1}}


% -------------------------------------------------------------------------------
% Commands for extra
% -------------------------------------------------------------------------------
% Define separator for social informations in header
% Usage: \headersocialsep{<separator>}
% Default: \quad\textbar\quad
\newcommand*{\headersocialsep}[1][\quad\textbar\quad]{\def\@headersocialsep{#1}}
\headersocialsep


% -------------------------------------------------------------------------------
% Commands for utilities
% -------------------------------------------------------------------------------
% Use to align an element of tabular table
\newcolumntype{L}[1]{>{\raggedright\let\newline\\\arraybackslash\hspace{0pt}}p{#1}}
\newcolumntype{C}[1]{>{\centering\let\newline\\\arraybackslash\hspace{0pt}}p{#1}}
\newcolumntype{R}[1]{>{\raggedleft\let\newline\\\arraybackslash\hspace{0pt}}p{#1}}

% Use to draw horizontal line with specific tickness
\def\vhrulefill#1{\leavevmode\leaders\hrule\@height#1\hfill \kern\z@}

% Use to execute conditional statements by checking empty string
% \newcommand*{\ifempty}[3]{\ifthenelse{\isempty{#1}}{#2}{#3}}


% -------------------------------------------------------------------------------
% Commands for elements of CV structure
% -------------------------------------------------------------------------------
% Define a header for CV
% Usage: \makecvheader
\newcommand*{\makecvheader}{
  % \descriptionstyle\faQuoteLeft
  % \descriptionstyle\faQuoteRight
  % \descriptionstyle\faFax
  % \\
  \begin{center}
    \headerfirstnamestyle{
      \@firstname
    }\headerlastnamestyle{
      \@lastname
    }
    \\
    \vspace{0.4mm}
    \ifthenelse{\isundefined{\@position}}{}{\headerpositionstyle{\@position\\}}
    \vspace{0.4mm}
    \ifthenelse{\isundefined{\@address}}{}{\headeraddressstyle{\@address\\}}
    \vspace{-0.5mm}
    \headersocialstyle{
      \newbool{isstart}
      \setbool{isstart}{true}
      \ifthenelse{\isundefined{\@mobile}}
      {}
      {
        \faMobile\ \@mobile
        \setbool{isstart}{false}
      }
      \ifthenelse{\isundefined{\@email}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \href{mailto:\@email}{\faEnvelope\ \@email}
      }
      \ifthenelse{\isundefined{\@homepage}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \href{http://\@homepage}{\faHome\ \@homepage}
      }
      \ifthenelse{\isundefined{\@github}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \href{http://github.com/\@github}{\faGithubSquare\ \@github}
      }
      \ifthenelse{\isundefined{\@linkedin}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \href{http://www.linkedin.com/in/\@linkedin}{\faLinkedinSquare\ \@linkedin}
      }
      \ifthenelse{\isundefined{\@twitter}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \href{https://twitter.com/\@twitter}{\faTwitter\ \@twitter}
      }
      \ifthenelse{\isundefined{\@skype}}
      {}
      {
        \ifbool{isstart}
        {
          \setbool{isstart}{false}
        }
        {\@headersocialsep}
        \faSkype\ \@skype
      }
    } \\
  \end{center}
}

% Define a footer for CV
% Usage: \makecvfooter
\newcommand*{\makecvfooter}{
  \fancyfoot{}
  \fancyfoot[L]{}
  \fancyfoot[C]{
    \footerstyle{\@firstname \@lastname~~~·~~~Curriculum Vitae}
  }
  \fancyfoot[R]{
    \footerstyle{\thepage}
  }
}

% Define a section for CV
% Usage: \cvsection{<section-title>}
\newcommand{\cvsection}[1]{
  \penalty-500
  \par\addvspace{1.5ex}
  \phantomsection{}
  %\color{gray}\rule{0.5cm}{0.9pt}
  \sectionstyle{#1}
  \color{gray}\vhrulefill{0.9pt}
  \par\nobreak\addvspace{1ex}
  \penalty2000
}



\let\widthof=\pgfmath@calc@widthof

% Define a subsection for CV
% Usage: \cvsubsection{<subsection-title>}
\newcommand{\cvsubsection}[1]{
  \penalty-500
  \phantomsection{}
  % \pgfmathtruncatemacro\rulew{(7cm - \widthof{#1}) }
  \color{gray}%\rule{1cm}{0.2pt}%
  \hspace{-0.5em}
  \subsectionstyle{#1}
  \hspace{-1em}
  \color{gray}%\vhrulefill{0.2pt}%
  \penalty2000
}

% Define an environment for cventry
\newenvironment{cventries}{
  \begin{center}
  }{
  \end{center}
}
% Define an entry of cv information
% Usage: \cventry{<position>}{<title>}{<location>}{<date>}{<description>}
\newcommand*{\cventry}[5]{
  \setlength\tabcolsep{0pt}
  \setlength{\extrarowheight}{0pt}
  \begin{tabular*}{\textwidth}{@{\extracolsep{\fill}} L{12.5cm} R{4.5cm}}
    \ifempty{#2#3}
    {\entrypositionstyle{#1} & \entrydatestyle{#4}}
                               {\entrytitlestyle{#2} & \entrylocationstyle{#3} \\
    \entrypositionstyle{#1} & \entrydatestyle{#4}}
                              \ifempty{#5}{}{\\\multicolumn{2}{L{17cm}}{\descriptionstyle{#5}} }\\
    \\
  \end{tabular*}
}

% Define an environment for cvsubentry
\newenvironment{cvsubentries}{
  \begin{center}
  }{
  \end{center}
}
% Define a subentry of cv information
% Usage: \cvsubentry{<position>}{<title>}{<date>}{<description>}
\newcommand*{\cvsubentry}[4]{
  \setlength\tabcolsep{0pt}
  \setlength{\extrarowheight}{0pt}
  \begin{tabular*}{\textwidth}{@{\extracolsep{\fill}} L{12.5cm} R{4.5cm}}
    \setlength\leftskip{0.2cm}
    \subentrytitlestyle{#2} & \ifthenelse{\equal{#1}{}}
                              {\subentrydatestyle{#3}}{}
                              \ifthenelse{\equal{#1}{}}
                              {}
                              {\subentrypositionstyle{#1} & \subentrydatestyle{#3} \\}
    \ifthenelse{\equal{#4}{}}
    {}
    {\multicolumn{2}{L{17.0cm}}{\subdescriptionstyle{#4}} \\}
  \end{tabular*}
}

% Define an environment for cvhonor
\newenvironment{cvhonors}{
  \setlength\tabcolsep{0.2cm}
  % \renewcommand{\arraystretch}{1.2}

  \begin{center}
    \begin{longtabu}[t]{@{\extracolsep{\fill}} C{2.5cm} L{11.0cm} R{2.5cm}}
      % \begin{tabular}[t]{@{\extracolsep{\fill}} C{2.5cm} L{11.0cm} R{2.5cm}}
    }{
      % \end{tabular}
    \end{longtabu}
    \vspace{-2em}
  \end{center}
}
% Define a line of cv information(honor, award or something else)
% Usage: \cvhonor{<position>}{<title>}{<location>}{<date>}
\newcommand*{\cvhonor}[4]{
  \honordatestyle{\specialcell[C{2.5cm}]{#1}} & \specialcell[L{11cm}]{\honortitlestyle{#2} \\[0.2em] \honorsummarystyle{#4}} & \honorlocationstyle{#3}\\[0.7em]
}

% Define an environment for cvkeyval
\newenvironment{cvkeyval}[1][4cm]{
  \begin{cvitems}[#1]
  }{
  \end{cvitems}
}
\newcommand{\cvkeyvalitem}[2]{
  \cvitem[#1]{#2}
}



% Define an environment for cvskill
\newenvironment{cvskills}{
  \begin{center}
    \setlength\tabcolsep{1ex}
    \setlength{\extrarowheight}{0pt}
    \begin{longtabu} to \linewidth {@{\extracolsep{\fill}} r L{15.2cm}}
    }{
    \end{longtabu}
  \end{center}
}
% Define a line of cv information(skill)
% Usage: \cvskill{<type>}{<skillset>}
\newcommand*{\cvskill}[2]{
  \skilltypestyle{#1} & \skillsetstyle{#2}
  \\
}

% Define an environment for cvitems(for cventry)
\newenvironment{cvitems}[1][2.5cm]{
  \begin{justify}
    \begin{itemize}[leftmargin=#1, nosep, noitemsep]
      \setlength{\parskip}{0pt}
      \renewcommand{\labelitemi}{\bullet}
    }{
    \end{itemize}
  \end{justify}
}

\newcommand*{\cvitem}[2][]{
  \ifempty{#1}
  {\item \keyvalstylevalue{#2}}
  {\item[\keyvalstylekey{#1}] \keyvalstylevalue{#2}}
}



% Define an environment for cvdegrees
\newenvironment{cvdegreecategory}[1]{
  \cvsubsection{#1}
  \begin{center}
    \setlength\tabcolsep{1ex}
    \setlength{\extrarowheight}{0pt}
    \setlength{\extrarowsep}{0pt}

    \begin{longtabu}[t]{@{\extracolsep{\fill}} L{6cm} L{3cm} L{3.5cm} R{2.5cm}}
      }{
    \end{longtabu}
    \vspace{-3em}
  \end{center}
}

\newcommand*{\degreeschoolstyle}[1]{\entrypositionstyle{#1}}
\newcommand*{\degreegradestyle}[1]{\entrydatestyle{#1}}
\newcommand*{\degreedatestyle}[1]{\entrydatestyle{#1}}
\newcommand*{\degreelocationstyle}[1]{\entrylocationstyle{#1}}


\newcommand*{\cvdegree}[4]{
  \degreeschoolstyle{\specialcell[L{6cm}]{#1}} &
  \degreegradestyle{#2} &
  \degreedatestyle{#3} &
  \degreelocationstyle{#4} \\
}



\newcommand{\myyear}[1]{#1}
\newcommand{\myyearmonth}[2]{#1--#2}
\newcommand{\myyearmonthday}[3]{#1--#2--#3}
\newcommand{\timeinterval}[2]{#1 $\Rightarrow$ #2}
\newcommand*{\rom}[1]{\expandafter\@slowromancap\romannumeral #1@}

\newcommand{\specialcell}[2][l]{%
  \begin{tabular}[t]{@{}#1@{}}#2\end{tabular}}


\newcommand{\starcolor}[2] {
  \pgfmathtruncatemacro\starcolorperc{(#1)/(#2)*100}%
  %
  \ifthenelse{\starcolorperc > 50}{%
    \pgfmathtruncatemacro\starcolorperc{(\starcolorperc-50)*2}%
    \colorlet{star color}[rgb]{green!\starcolorperc!yellow}%
  }{%
    \pgfmathtruncatemacro\starcolorperc{\starcolorperc*2}%
    \colorlet{star color}[rgb]{yellow!\starcolorperc!red}%
  }%
  %
  \color{star color!90!black}%
}

% Stars
\newcommand{\stars}[2][5]{
  {%
    \pgfmathtruncatemacro\nfullstars{#2}%
    \pgfmathtruncatemacro\nhalfstars{(#2 - \nfullstars) * 2}%
    \pgfmathtruncatemacro\nemptystars{#1 - (\nfullstars + \nhalfstars)}%
    %
    {%
      \starcolor{#2}{#1}%
      \ifthenelse{\nfullstars > 0}{%
        \foreach \n in {1,...,\nfullstars} {%
          \faStar%
        }%
      }{}%
      %
      \ifthenelse{\nhalfstars > 0}{%
        \foreach \n in {1,...,\nhalfstars} {%
          \faStarHalfFull%
        }%
      }{}%
    }%
    %
    \ifthenelse{\nemptystars > 0}{%
      \foreach \n in {1,...,\nemptystars} {%
        {\faStarO}%
      }%
    }{}%
  }%
}%

\newcommand\grade[3][5]{%
  \FPdiv\result{#2}{#3}%
  \FPmul\result{\result}{#1}%
  \FPmul\result{\result}{2}%
  \FPadd\result{\result}{0.5}%
  \FPtrunc\result\result0%
  \FPdiv\result{\result}{2}%
  \FPclip\result\result%
  %
  \stars[#1]{\result} (#2/#3)%
}

% % Generate stars
% \begin{itemize}
%   \foreach \k in {3,...,10} {%
%   \section{\k}
%   \foreach \n in {1,...,20} {%
%   \subsection{\n}
%   \foreach \m in {0,...,\n} {%
% \item[\m / \n]  \grade[\k]{\m}{\n}
% }
%   \clearpage
% }
% }
% \end{itemize}
