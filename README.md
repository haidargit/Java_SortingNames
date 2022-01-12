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
This _'Names Sorter App'_ is made to sort the List of person names from the desired file which already available and located inside this project("unsorted-names-list.txt"), then we save the sorted result into another file ("sorted-names-list.txt").

## Stack
- Apache Maven 3.8.4    => https://maven.apache.org/

- Java                  => https://www.oracle.com/java/technologies/java-se-glance.html

- Junit5 (Unit Testing) => https://junit.org/junit5/

```
✅  No need 'specific IDEs'. Feel free to use any text editor to open the project folder. 

✅  Straightforward and easy to use. Since we don't do repetitive activities  
    such as start, stop, or even restart the local server for this app project.      

✅  We check the application result on the Command Prompt / terminal by using java command  
    (you'll see it on below)
```

## Prerequisites
**Please make sure that you have installed**:  

a. Maven: https://maven.apache.org/install.html  

b. Java: 8 (minimum version)

Use this command to check the Maven version on your system:
```
mvn -v
```
Use this command to check the Java version on your system:
```
java -v
```
_as i mentioned earlier, we don't want to be bothered by choosing specific IDEs/Text Editor for   
running this Java maven app._  

_So, by using Maven (mvn) command through cmd or terminal, you can run this app easily._

## Project Tree Details


## Usage Example - Running the App
a. Download or clone this repository to your local computer

b. Navigate to the folder location of this project that you just downloaded through command prompt(CMD) or Terminal.

c. Type or copy these commands on your command prompt or terminal  
(Both of these commands runnable on Linux/Mac/Windows)  

_Remember to install Maven (and Java) first._  

```
mvn compile && mvn clean install  
```
Then,  
```
mvn exec:java -Dexec.mainClass=com.haidar.App  
```  

d. We can check and review the result.  


## Code Editing and Modification Purpose
a. Open the project folder with any IDE/Text Editor that you desired.  

b. Explore, locate, and modify any java file, resources (the .txt files that contain names), unit test that you wanted.  

c. After you finish your editing process, re-run these commands again.  
_Make sure to navigate at project's root directory where the pom.xml lies, so you can run the 'mvn' command._
```
mvn exec:java -Dexec.mainClass=com.haidar.App  
```

<br />

_If there's any issue regarding installation, kindly to inform me.._    
  
#### By Haidar Ali