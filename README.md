# example-1-operationsOn2numbers
Example Java project created via STS as Java Project, that does some basic math operations on 2 numbers, showing how to;
- doing without any OOP or polymorphism - simple package,
- doing with OOP and polymorphism - oop package,
- create main entry classes (MainEntry4simple, MainEntry4oop),
- create interfaces (Has2numbers, oop.Multiply), 
- create abstract base class (OperatorFor2numbers) that contain some common attribute and methods that implement an interface (Has2numbers),
- create child class (MultiplyOperatorFor2numbers) that extend an abstract base (OperatorFor2numbers) and implement an interface (oop.Multiply)
- polymorphism, users of implementations of an interface to view them via interface (MainEntry4oop.main)
- using ObjectAid UML plugin to create dynamic(diagram will auto update when you change a class in it) UML diagrams (class diagram)

## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/fdu/csci3307/projects

### to import the project from github to STS
In github, go to the repository your want to clone<br>
https://github.com/fdu-3307/example-1-operationsOn2numbers <br>
click green "Clone or download" on right hand side<br>
click icon with "Copy to clipboard" tooltip (NOTE when you click that later during import in STS most fields of "Source Git Repository" will be auto populated) or copy the URL

In STS<br>
File --> Import --> Git --> Projects from Git + Next --> Clone URI + Next --> URI, Host, Repository path, Protocol of "Source Git Repsitory" will be auto filled, fill in Authentication section, click check box of "Store in Secure Store" + Next --> let "master" be selected in "Branch Selection" + Next --> in "Local Destination" type in Directory or click Browse and select workspace, let "origin" be Remote name + Next  --> in "Select a wizard to use for importing projects" click radio button of "Import using the New Project wizard" + Finish<br>
in "Select a wizard" click Java --> Java Project + Next --> in "Create a Java Project" enter "Project name" value + Finish

Now you should see the project in STS with yellow milk tank on its lower right corner and blue J in its upper right corner  

### or to clone the project from github via command line to a directory
cd to where you put your example projects.<br>
As example, at bash command line issue;<br>
cd /c/fdu/csci3307/projects <br>
git clone https://github.com/fdu-3307/example-1-operationsOn2numbers.git <br>
or<br>
git clone https://github.com/fdu-3307/example-1-operationsOn2numbers.git  whateverDirectoryNameYouWantStuffToBeClonedInto

Now you can import the project into STS via
File --> Import --> General --> Projects from Folder or Archive
Select the directory that you cloned into, click Finish 

then follow the wizard

## How to create dynamic UML diagrams (class diagram) via ObjectAid UML
### Install ObjectAid UML plugin to your STS via
- Click Help --> Install New Software
- Click Add
- Enter
<br> Name: ObjectAid UML Explorer
<br> Location: http://www.objectaid.net/update
- Click Finish and follow rest of wizard cliking Next and accepting License and Finish
- Let STS restart for plugin to take effect

### Create dynamic(meaning when a class is modified in code, it is auto reflected in diagram) class diagram
- Create a top level directory called design, 
    - Right click on project, click New --> Folder, call it "design"
- Right click on above created folder "design"
- Click New --> Other, ObjectAid UML Diagram --> Class Diagram
- Enter something like "classDiagram_SIMPLE" for name
- Click check box of "Save Image with Diagram as", right next to it let default pull down value of PNG be there
- From Navigator or Page Explorer view on left hand side, drag and drop the classes interfaces you are interested in
- Save
- Notice "classDiagram_SIMPLE.ucls" and "classDiagram_SIMPLE.png" are created under design

## Project directory structure
- README.md this read me file
- src directory of java packages
- src/com.mycompany.basicmathoperations.simple is where SIMPLE(no OOP) approach code is in
- src/com.mycompany.basicmathoperations.oop is where OOP and polymorphism approach code is in
- design directory of design documents, like class diagram
