# MedicalApp
The project is divided into MVC layers.
The web Application uses : HTML, CSS, Bootstrap, thymeleaf, SpringBoot, Java, JPA, JDBC, MYSQL.

**Model Layer**:
The project has two Entity classes.

**User Entity(User)** that creates a table to store the Users.
It stores values of Id(generated), Email, Password, First Name and Last Name.

**Form Entity(Form)** to store the values of the forms filled by the User.
It stores values of User Id, User Email, answers for the following questions in yes or no form.

•	Are you experiencing any flu symptoms-like cold, cough?
 •	Are you experiencing any of these conditions: Stomach upset, vomiting, fatigue? 
 •	Are you suffering from shortness of breath or other respiratory problems?

I have created a connection class UserDto to store the combined values by joining both the tables using the following queries.
There are two Repositories for each entity and implements JpaRepository.

**User Repository(UserRepo)** consists of queries to check email existence while signing up and login.

Query to check the if email and password match for login.
checking if the email and password entered exists in the user table

Query to check if email exists during creation of account
checking if the email entered exists in the user table

**Form Repository(FormRepo)** 

consists of the query to populate all users on a particular date.
checking if the any user has filled a form on a particular date.
  
**Services:**
There are 2 service files.
**User Service(UserService):**
This class consists of all the methods that are called by the controller.
The methods are used to save data to the User and Form dataset, to find all the users and .
**User Service Implementaton(UserServiceImpl):**
This class consists of all the method Implementations that are called by the controller in UserService class.
It consists of the logics to save data to database and retrieve data from the data base.

**Controller:**
**ApplicationController**
This class consists of the endpoints that are called by the website.
It acts like a mediator between the Frontend (HTML pages) and the Backend (Databases).

**Front End:**
The front end is made with combination of HTML, CSS, bootstrap, thymeleaf.
The front end of the web application is shown in different pages.
E.g. Login page, register page, find users page.

**Backend:**
The data is saved in form of relation databases in MYSQL database.
Use MySql workbench to create table and the application to enter data into the database.

 **Application.Properties:**
This file consists of the properties to connect to the database.
Like the link to the database, name and password to the database.
It has Jpa properties to allow us the CRUD implementation and the hibernate dialect.
  
**POM.xml**
This has all the dependencies used in the application.
e.g. Bootstrap, thymeleaf, JPA, Spring Boot, Web jars, Web services, Devtools,Lombak.
Lombak is used to reduce boiler plate code.

-----------------------------------------------------------------------------------------------------------------------------------------------------------

**Technical Specification:**

Java Version: 11

Spring Boot Version: 2.6.6

BootStrap Version: 4.6.0-1

-----------------------------------------------------------------------------------------------------------------------------------------------------------

**Download links:**

Mysql workbench:  https://dev.mysql.com/downloads/workbench/

Connect to the lost host or default host. 
You can even dowload the the entire SQL Installer if you do not have SQL in your system. It consists of MySQl, MySql workbench, commandline for SQL.

Spring Tool Suite:  https://spring.io/tools

Tool mostly used for spring and maven projects. You can also use Eclipse by create the file in spring Initializer and importing it.
