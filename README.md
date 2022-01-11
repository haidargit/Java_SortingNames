<a href="https://github.com/haidargit/KST-SortingThousandNames-Haidar_Ali">
    <img src="https://www.kst.co.id/images/kst-logo-100x100.png" alt="KST task logo" title="KST" align="right" height="60" />
</a>

# KST - Names Sorter App Documentation

## Table of content

- [About](#about)
- [Stack](#stack)
- [Prerequisites](#prerequisites)
- [Project Tree Details](#project-tree-details)
    - [Upload the page tree file](#upload-the-page-tree-file)
    - [Go to the import view](#go-to-the-import-view)
    - [Import the page tree](#import-the-page-tree)
    - [SEO-friendly URLs](#seo-friendly-urls)
- [Usage Example - Running the App](#usage-example---running-the-app)
- [Code Editing and Modification Purpose](#code-editing-and-modification-purpose)

## About
This Lightweight _'Names Sorter App'_ is made to sort the List of person names from desired file which already available and located inside this project
("unsorted-names-list.txt"), then we save the sorted result into another file ("sorted-names-list.txt").

## Stack
- Apache Maven 3.8.4    => https://maven.apache.org/

- Java          => https://www.oracle.com/java/technologies/java-se-glance.html

- Junit5 (Unit Testing) => https://junit.org/junit5/

```
✅  No need 'specific IDEs'. Feel free to use any text editor to open the project folder. 

✅  Straightforward and easy to use. Since we don't do repeated activities such as starting, stop,  
    or even restart local server for this app project.  

✅  We check the application result on the Command Prompt / terminal by using java command  
    (you'll see it on below)
```

## Prerequisites
Please make sure that you have installed:  
a. Maven: https://maven.apache.org/install.html
b. Java: 8 (minimum version)

Use this command to check installed Maven version on your system:
```
mvn -v
```
Use this command to check installed Java version on your system:
```
java -v
```
_as i mentioned earlier, we don't want to be bothered by choosing specific IDEs/Text Editor for funning this Java maven app.  
So, by using Maven (mvn) command through cmd or terminal, you can run this app easily._

## Project Tree Details


## Usage Example - Running the App
a. Download or clone this repository to your local computer

b. Navigate to the folder location of this project that you just downloaded through command prompt(CMD) or Terminal.

c. Type or copy these commands on your command prompt or terminal  
    **~ Remember to install MAVEN(and Java) first.**  
    Windows OS  
    ```
    mvn compile  

    mvn clean install  

    mvn exec:java -Dexec.mainClass=com.haidar.App  
    
    ```

    UNIX/LINUX/Mac
    ```
    mvn
    ```

d. We can check and review the result.  


## Code Editing and Modification Purpose
a. Open the project folder with any IDE/Text Editor that you desired.

<br />

_if there's any issue regarding installation, kindly to inform me._    
  
#### By Haidar Ali
