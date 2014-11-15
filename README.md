NASA-AWS-WorkflowEstimator
==========================

SOC Fall 2014 NASA-AWS Project

## Dependencies

- JDK 7

## Usage

As a pre-requisite, you need to install `mongodb` and run it. Please find the installation guide [here](http://docs.mongodb.org/manual/installation/). 

Git clone the repository and you're ready to run the app!

```
$ cd NASA-AWS-WorkflowEstimator

$ play clean start
```

This should fetch all the dependencies and start a Web Server listening on *localhost:9000*

```
[info] Loading project definition from /home/ubuntu/NASA-AWS-WorkflowEstimator-master/project
[info] Set current project to object-collection (in build file:/home/ubuntu/NASA-AWS-WorkflowEstimator-master/)
[info] Compiling 8 Scala sources and 1 Java source to /home/ubuntu/NASA-AWS-WorkflowEstimator-master/target/scala-2.10/classes...
(Starting server. Type Ctrl+D to exit logs, the server will remain in background)

Play server process ID is 26045
[info] application - ReactiveMongoPlugin starting...
[info] application - ReactiveMongoPlugin successfully started with db 'object-collection'! Servers:
		[localhost:27017]
[info] play - Application started (Prod)
[info] play - Listening for HTTP on /0:0:0:0:0:0:0:0:9000
```
To specify a customized port:

For the production mode in Play 2.x - run

```
activator "start -Dhttp.port=9006"
```

Service URL:
---------
http://einstein.sv.cmu.edu:9006

Overview:
---------
Currently we are providing APIs in 3 categores:

**Category 1: Account Management**<br/>
   - [Log in](#1)
   - [Log in with authentication](#2)
   - [Account Summary](#3)
   - [Log out](#4)

**Category 2: Recommandation**<br/>
   - [Tutorial](#5)
   - [Get Estimation](#6)
   - [Get Estimation Result](#7)
   - [Get Virtual Machine Recommendation](#8)

**Category 3: Registration**<br/>
   - [Registration form](#9)
   - [Submit](#10)
   - [Update form](#11)
   - [Update](#12)
   - [Delete form](#13)
   - [Admin page](#14)

Detailed Usages:
----------------
Note: all TimeStamps are in Unix epoch time format to millisecond. Conversion from readable timestamp format to Unix epoch timestamp can be found in http://www.epochconverter.com

1. <a name="1"></a>**Log in**
    - **Purpose**: Log into the website with username and password.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/login
    - **Sample Usages**:
    	- **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/login
    	- **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.
    
2. <a name="2"></a>**Log in with authentication**
    - **Purpose**: Log into the website with authentication. 
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/login?username=<"username">&password=<"password">
    - **Semantics**:
        - **username**: Existing user name.
        - **password**: Password of the user.
    - **Sample Usages**: 
    	- **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/login?username=<"username">&password=<"password">
      	- **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.

3. <a name="3"></a>**Account Summary**
    - **Purpose**: Provide a summary of the account.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/accountSummary?userName=<"username">
    - **Semantics**:
        - **username**: Existing user name.
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/accountSummary?userName=<username>
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

4. <a name="4"></a>**Log out**
    - **Purpose**: Log out from the website.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/logout
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/logout
      - **Result**: HTTP 200 if the logged out successfully, HTTP 500 if failed.

5. <a name="5"></a>**Tutorial**
    - **Purpose**: Provide a turorial video about how to connect the vistrails workflow to the Einstein Website.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/tutorial
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/tutorial
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

6. <a name="6"></a>**Get Estimation**
    - **Purpose**: Run estimattion for the workflow.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/1
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
    - **Sample Usages**:


7. <a name="7"></a>**Get Estimation Result**
    - **Purpose**: Get the result of workflow estimation
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/2
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/estimator/2
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

8. <a name="8"></a>**Get Virtual Machine Recommendation**
    - **Purpose**: Get the information of recommended virtual machine for workflow execution
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/3
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/estimator/3
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

9. <a name="9"></a>**Show user register page**
    - **Purpose**: Show user register page.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/register
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/tutorial
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.
      
10. <a name="10"></a>**Add a service user**
    - **Purpose**: A new service user register estimation service.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/register/publish
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **userName** (string, not null): Non existing unique user name
        - **password** (string, not null): password
        - **firstName** (string, optional): first name
        - **lastName** (string, optional): last name
        - **middleName** (string, optional): middle name
        - **affiliation** (string, optional): affiliation
        - **email** (string, optional): email
        - **researchArea** (string, optional): research area
        - **goal** (string, optional): goal
        - **algo** (string, optional): algo
        - **budgetConcerns** (string, optional): budget concerns
        - **AWSFamilarity** (string, optional): AWS familarity
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input service user data in a json file:
              - "contestUser.json" file contains: {"userName": "John", "password": "123", "firstName": "John"}
          2. curl -H "Content-Type: application/json" -d @user.json "http://einstein.sv.cmu.edu:9006/estimator/register/publish"
      - **Result**: HTTP 201 if the user has been successfully added to the database, HTTP 400 if the userName is already been used or register limit has been reached.

11. <a name="11"></a>**Show user update page**
    - **Purpose**: Show user update page.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/updateUser
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/updateUser
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.
      
12. <a name="12"></a>**Update a service user**
    - **Purpose**: Update a service user's information.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/updateUser/update
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **userName** (string, not null): Non existing unique user name
        - **password** (string, not null): password
        - **firstName** (string, optional): first name
        - **lastName** (string, optional): last name
        - **middleName** (string, optional): middle name
        - **affiliation** (string, optional): affiliation
        - **email** (string, optional): email
        - **researchArea** (string, optional): research area
        - **goal** (string, optional): goal
        - **algo** (string, optional): algo
        - **budgetConcerns** (string, optional): budget concerns
        - **AWSFamilarity** (string, optional): AWS familarity
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input contest user data in a json file:
              - "contestUser.json" file contains: {"userName": "John", "password": "123", "firstName": "John", "lastName": "White"}
          2. curl -H "Content-Type: application/json" -d @user.json "http://einstein.sv.cmu.edu:9006/estimator/updateUser/update"
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the userName/password is wrong

13. <a name="13"></a>**Show user delete page**
    - **Purpose**: Show user delete page.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/deleteUser
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/estimator/deleteUser
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.      

14. <a name="14"></a>**Delete a service user**
    - **Purpose**: Delete a service user.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/deleteUser/delete<"userName">/<"password">
    - **Semantics**
        - **userName** (string, not null): Service user name
        - **password** (string, not null): Password
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://einstein.sv.cmu.edu:9006/estimator/deleteUser/delete/John/123
      - **Result**: HTTP 201 if the contest user has been successfully deleted

15. <a name="15"></a>**Get information of current usage summary and details**
    - **Purpose**: Get information of current usage summary and details.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/estimator/adminPage">
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/estimator/adminPage
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

16. <a name="16"></a>**Show report bugs page**
    - **Purpose**: Show report new bugs page.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/bugs
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/bugs
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found. 

17. <a name="17"></a>**Bug report**
    - **Purpose**: Report new bug.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/newReport
    - **Semantics**:
        - **name** : user name
        - **title** : bug title
        - **email** : email
        - **organization** : organization
        - **description** : description
    - **Sample Usages**: 
    	- **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9006/newReport?name=<"username">&title=<"title">&email=<"email">
      	- **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.
      
18. <a name="18"></a>**Bug list**
    - **Purpose**: List bug informations.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/bug/list
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/bug/list
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.
     
19. <a name="19"></a>**Dashboard**
    - **Purpose**: Get informtion about overall information.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/dashboard
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/dashboard
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

20. <a name="20"></a>**About us**
    - **Purpose**: Get information about developers.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9006/aboutus
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9006/aboutus
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.
      
[1]: http://einstein.sv.cmu.edu:9006/ "The Application Server running in the Smart Spaces Lab, CMUSV"

## Support

Please contact Zhaokun Li, Xia Liu, Dong Chen

Professor Jia Zhang
