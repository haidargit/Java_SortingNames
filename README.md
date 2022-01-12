<a href="https://github.com/haidargit/KST-SortingThousandNames-Haidar_Ali">
    <img src="https://www.kst.co.id/images/kst-logo-100x100.png" alt="KST task logo" title="KST" align="right" height="60" />
</a>

# KST - Names Sorter App Documentation
![gitab](https://user-images.githubusercontent.com/33404432/149063206-592252f7-20ce-4e29-beab-8159fdc363e3.jpg)

## Table of content

- [About](#about)
- [Stack](#stack)
- [Prerequisites](#prerequisites)
- [Project Tree Details](#project-tree-details)
- [Usage Example - Running the App](#usage-example---running-the-app)
- [Usage Example - Running the Unit Test](#usage-example---running-the-unit-test)
- [Code Editing and Modification Purpose](#code-editing-and-modification-purpose)
- [CI / Pipeline Using Jenkins (Additional)](#)



## About
This _'Names Sorter App'_ is made to sort the List of person names from the desired file which already available and located inside this project("unsorted-names-list.txt"), then we save the sorted result into another file ("sorted-names-list.txt").



## Stack
- Apache Maven 3.8.4    => https://maven.apache.org/

- Java                  => https://www.oracle.com/java/technologies/java-se-glance.html

- Junit5 (Unit Testing - already included with Maven project) => https://junit.org/junit5/

```
✅  No need 'specific IDEs'. Feel free to use any text editor to open the project folder. 

✅  Straightforward and easy to use. Since we don't do repetitive activities  
    such as start, stop, or even restart the local server for this app project.      

✅  We check the application result on the Command Prompt / terminal by using java command  
    (you'll see it on below)
```



## Prerequisites
**==>  Please make sure that you have installed  <==**: 

a. Maven: https://maven.apache.org/install.html  

b. Java: 8 (minimum version)

Use these commands to check the Maven and Java version on your system (_runnable on both Windows and Linux_):
```
mvn -v
```
![Screen Shot 2022-01-12 at 10 00 12](https://user-images.githubusercontent.com/33404432/149057251-6a8bef9b-6175-4985-8d89-6d3243d14d1c.png)
<br /><br />  


```
java --version
```
![Screen Shot 2022-01-12 at 09 59 57](https://user-images.githubusercontent.com/33404432/149056543-1a62427c-54b1-479b-8573-8000b24d2d5a.png)

<br />  

_💡 as i mentioned earlier, we don't want to be bothered by choosing specific IDEs/Text Editor for   
running/opening this Java maven app._  

_💡 By using Maven (mvn) command through our cmd or terminal, we can run this app easily ang get the result._


## Project Tree Details
![dir](https://user-images.githubusercontent.com/33404432/149060339-3935568f-1a1f-44e3-9bde-4e3578da670b.jpg)
<br />
A: Directory where Main java files/classes located  

B: Directory where Unit test files/classes located  

C: resources for _input("unsorted-names-list.txt")_ and _output("sorted-names-list.txt")._  
<br />
You can modify the Names as comprehensive and as many as you want inside the **input** file.  
The output file content will be always overwritten based on your result.  
## Usage Example - Running the App
a. Download or clone this repository to your local computer

b. Navigate to the folder location of this project that you just downloaded through command prompt(CMD) or Terminal.  
Go to the path where pom.xml is located (inside haidar folder = root).

c. Then type or copy these commands on your command prompt or terminal  
(Both of these commands runnable on Linux/Mac/Windows)  

_Remember to install Maven (and Java) first._  

```
<!-- Run this code just once, for installing dependencies. -->
mvn compile && mvn clean install  
```
<br />Then run the app,  
```
mvn exec:java -Dexec.mainClass=com.haidar.App  
```   

We can check and review the result.  
![Screen Shot 2022-01-12 at 10 14 33](https://user-images.githubusercontent.com/33404432/149057592-72f9d12d-fb2d-4e73-a0d6-60d958680b5e.png)



## Usage Example - Running the Unit Test

a. same as above, just a little different command.   
```
mvn test
```   
![Screen Shot 2022-01-12 at 11 02 56](https://user-images.githubusercontent.com/33404432/149061906-f04b5e7c-81d1-4e16-97cb-d9a99b85ee8c.png)


## Code Editing and Modification Purpose
a. Open the project folder with any IDE/Text Editor that you desired, i.e Sublime, Visual Studio Code, Notepad++, Vim, etc.   

b. Explore and modify any Java files with its resources (the .txt files that contain names). You can also modify the unit test.  

c. After you finish your editing process and you want to see the different result, **you must re-run these commands again.**  

_Before you execute this command, make sure to navigate at project's root directory where the pom.xml lies, so you can run the 'mvn' command._
```
<!-- For running the Main App (if you edited the main app, etc)-->

mvn exec:java -Dexec.mainClass=com.haidar.App  
```
```
<!-- For running the Unit Test (if you edited the unit test) -->

mvn test
```
d. You can then see the modified result.  

_🦠If there's any issue regarding installation and debugging, kindly to inform me.._    

## CI / Pipeline Using Jenkins (Additional)  
Using Free CI-CD tools Jenkins as buil and test pipelines  
Environment: AWS Virtual Server (EC2)  

<br /><br />  
#### By Haidar Ali
