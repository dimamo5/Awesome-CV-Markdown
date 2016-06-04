#Awesome-CV-Markdown[![Example](https://img.shields.io/badge/example-pdf-green.svg)](https://github.com/dimamo5/Awesome-CV-Markdown/blob/master/resources/generated/cv.pdf)

[Awesome CV Markdown](https://github.com/dimamo5/Awesome-CV-Markdown) is a program developed for the Compilers curricular unit. It receives a Markdown file with your Curriculum Vitae in it 
and returns you CV written in Latex and HTML. It is easy to customize your own CV, especially since it is really written by a clean markdown.
To use it all you have to do is import this project to an IDE (for example, IntelliJ) run it and follow the steps given.


# Table of Contents
1. [How to Use](#How to Use)
2. [Preview](#Preview)
3. [Markdown Used](#Markdown Used)
4. [Characters not suported](#Characters not suported)

##<a name="How to Use"></a>How to Use

It is easy to use just follow this steps:
 
1. insert the markdown path file
2. Select what you want to appear in your CV
3. Press run
4. Confirm the Latex and HTML file, present in ./resources/generated/yourCVName/ 

##<a name="Preview">Preview
Here is an example of the [PDF](https://github.com/dimamo5/Awesome-CV-Markdown/blob/master/resources/generated/cv.pdf), [LaTex](https://github.com/dimamo5/Awesome-CV-Markdown/blob/master/resources/generated/cv.tex) and [HTML](https://github.com/dimamo5/Awesome-CV-Markdown/blob/master/resources/generated/cv.html) generated for this [md File](https://github.com/dimamo5/Awesome-CV-Markdown/blob/master/resources/mdFiles/cv.md)

##<a name="Markdown Used"></a>Markdown Used
Here’s an overview of our Markdown syntax.

The CV is divided in header and blocks of information. To define any part of your CV you can use:


```Markdown 
Headers:
# For something very important 
## For something Important 
```
Blocks can contain TEXT, LISTS or TABLES.

```Markdown 
Lists:
* List header
> List item
```

```Markdown 
Tables:
Table header:

FisrtHeader ^ SecondHeader ^ ThirdHeader

Table item:

FisrtItem | SecondItem | ThirdItem

```

All List and Table items can contain a date, a place, or a classification in stars. We call this icons, the program supports all icons from [fontawsome](http://fontawesome.io/?utm_source=hackernewsletter).

```Markdown 
Icon:
{iconName}

Classification in stars:
{stars numbofStars/totalNumber}

Examples of special icons suported:
{mobile}
{linkedin}
{email}
{github}
```
Every block is divided by a spliter.

```Markdown 
Block spliter:
===
```
##<a name="Characters not suported">Characters not suported
Like in every other language some characters are not supported. All you have to do is add an escape. For example, **/** is not suported but **\/** is.


