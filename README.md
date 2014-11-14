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

Service URL:
---------
http://einstein.sv.cmu.edu:9005

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
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/login
    - **Sample Usages**:
    	- **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9005/estimator/login
    	- **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.
    
2. <a name="2"></a>**Log in with authentication**
    - **Purpose**: Log into the website with authentication. 
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/login?username=<"username">&password=<"password">
    - **Semantics**:
        - **username**: Existing user name.
        - **password**: Password of the user.
    - **Sample Usages**: 
    	- **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9005/estimator/login?username=<"username">&password=<"password">
      	- **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.

3. <a name="3"></a>**Account Summary**
    - **Purpose**: Provide a summary of the account.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/accountSummary?userName=<"username">
    - **Semantics**:
        - **username**: Existing user name.
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9005/estimator/accountSummary?userName=<username>
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

4. <a name="4"></a>**Log out**
    - **Purpose**: Log out from the website.
    - **Method**: Get
    - **URL**: http://einstein.sv.cmu.edu:9005/logout
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9005/logout
      - **Result**: HTTP 200 if the logged out successfully, HTTP 500 if failed.

5. <a name="5"></a>**Tutorial**
    - **Purpose**: Provide a turorial video about how to connect the vistrails workflow to the Einstein Website.
    - **Method**: Get
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/tutorial
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9005/estimator/tutorial
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

6. <a name="6"></a>**Get Estimation**
    - **Purpose**: Run estimattion for the workflow.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/1
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorTypeName** (string, not null): Name of the sensor type, which cannot be changed
        - **sensorTypeUserDefinedFields** (string, not null): User defined fields
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "sensorType.json" file contains: {"sensorTypeName": "Humidity", "sensorTypeUserDefinedFields": "Testing only"}
          2. curl -H "Content-Type: application/json" -d @sensorType.json "http://einstein.sv.cmu.edu:9000/updateSensorType"
      - **Result**: HTTP 200 if the sensor type metadata has been successfully updated to the database


7. <a name="7"></a>**Get Estimation Result**
    - **Purpose**: Get the result of workflow estimation
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/2
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9005/estimator/2
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

8. <a name="8"></a>**Get Virtual Machine Recommendation**
    - **Purpose**: Get the information of recommended virtual machine for workflow execution
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9005/estimator/3
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorName** (string, not null): Name of the sensor, which cannot be changed
        - **sensorUserDefinedFields** (string, not null): User defined fields.
    - **Sample Usages**:
      - **Command Line Example**: 
          curl http://einstein.sv.cmu.edu:9005/estimator/3
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

9. <a name="9"></a>**Registrate New User form**
    - **Purpose**: Query a specific sensor.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getSensor/<"sensorName">/<"resultFormat">
    - **Semantics**: 
        - **sensorName**: Sensor name
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**:  
      - **Result**: HTTP 200 if the sensorName exists, HTTP 404 if not found
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getSensor/<"sensorName">/csv<br/>
      - **Sample csv result**: (sensorName, sensorUserDefinedFields, deviceUri, sensorTypeName, manufacturer,version,maxValue,minValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>sensor1, for test, www.device.com, Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getSensor/sensor1/json
      - **Sample json result**: {"sensorName": "sensor1", "sensorUserDefinedFields": "for test", "deviceUri":"www.device.com", "sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment"}
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

10. <a name="10"></a>**Submit**
    - **Purpose**: Delete a sensor type from sensor data service platform.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteSensorType/<"sensorTypeName">
    - **Semantics**
        - **sensorTypeName** (string, not null): Name of the sensor type
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteSensorType/testSensorTypeName
      - **Result**: HTTP 201 if the sensor type metadata has been successfully deleted from the database

11. <a name="11"></a>**Update form**
    - **Purpose**: Delete a sensor from sensor data service platform.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteSensor/<"sensorName">
    - **Semantics**
        - **sensorName** (string, not null): Name of the sensor
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteSensor/testSensorName
      - **Result**: HTTP 201 if the sensor metadata has been successfully deleted from the database

12. <a name="12"></a>**Update**
    - **Purpose**: Add a new user to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addUser
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **userName** (string, not null): Non existing unique user name
        - **userProfile** (string, optional): User profile
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "user.json" file contains: {"userName": "John", "userProfile": "CMU student"}
          2. curl -H "Content-Type: application/json" -d @user.json "http://einstein.sv.cmu.edu:9000/addUser"
      - **Result**: HTTP 201 if the user has been successfully added to the database, HTTP 400 if the userName is already been used

13. <a name="13"></a>**Delete form**
    - **Purpose**: Query a specific user.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getUser/<"userName">/<"resultFormat">
    - **Semantics**: 
        - **userName**: Existing user name.
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getUser/John/csv<br/>
      - **Sample csv result**: (userName,userProfile) </br>John, CMU student
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getUser/John/json
      - **Sample json result**: {"userName":John,"userProfile":"CMU student"}
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

14. <a name="14"></a>**Update page**
    - **Purpose**: Add a new sensor as a registered user to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addSensor
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorName** (string, not null): Non existing unique name of the sensor
        - **sensorTypeName** (string, not null): Existing name of its sensor type
        - **deviceUri** (string, not null): Existing device URI it belongs to
        - **sensorUserDefinedFields** (string, optional): User defined fields.
        - **userName**(string, not null): Existing user name
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor metadata in a json file:
              - "sensor.json" file contains: {"sensorName": "TestSensor", "sensorTypeName": "Humidity", "deviceUri": "www.testsensor.com", "sensorUserDefinedFields": "Test only", "userName":"John"}
          2. curl -H "Content-Type: application/json" -d @sensor.json "http://einstein.sv.cmu.edu:9000/addSensor"
      - **Result**: HTTP 201 if the sensor metadata have been successfully added to the database, HTTP 400 if failed.

18. <a name="18"></a>**GET ALL ESTIMATIONS AS A REGISTERED USER**
    - **Purpose**: Query all sensors which has been added by a registered user.
    - **Method**: GET(Specify user name in request header)
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensors/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample json request**: curl -H "Authorization:John" http://einstein.sv.cmu.edu:9000/getAllSensorTypes/json
      - **Sample json result**: [{"sensorName": "sensor01", "sensorUserDefinedFields": "for test", "deviceUri": "www.device.com/001","sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment", "purpose": "test only"}]
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.


19. <a name="19"></a>**GET A SPECIFIC ESTIMATION AS A REGISTERED USER**
    - **Purpose**: Query a specific sensor which has been added by a registered user.
    - **Method**: GET (Specify user name in request header)
    - **URL**: http://einstein.sv.cmu.edu:9000/getSensor/<"sensorName">/<"resultFormat">
    - **Semantics**: 
        - **sensorName**: Sensor name
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**:  
      - **Sample csv request**: curl -H "Authorization:John" http://einstein.sv.cmu.edu:9000/getSensor/<"sensorName">/csv<br/>
      - **Sample csv result**: (sensorName, sensorUserDefinedFields, deviceUri, sensorTypeName, manufacturer,version,maxValue,minValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>sensor1, for test, www.device.com, Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment
      - **Sample json request**: curl -H "Authorization:John" http://einstein.sv.cmu.edu:9000/getSensor/sensor1/json
      - **Sample json result**: {"sensorName": "sensor1", "sensorUserDefinedFields": "for test", "deviceUri":"www.device.com", "sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment"}
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.


20. <a name="20"></a>**ADD A CONTEST USER**
    - **Purpose**: Add a new contest user.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addContestUser
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
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input contest user data in a json file:
              - "contestUser.json" file contains: {"userName": "John", "password": "123", "firstName": "John"}
          2. curl -H "Content-Type: application/json" -d @user.json "http://einstein.sv.cmu.edu:9000/addContestUser"
      - **Result**: HTTP 201 if the user has been successfully added to the database, HTTP 400 if the userName is already been used or register limit has been reached.
      
21. <a name="21"></a>**UPDATE A CONTEST USER**
    - **Purpose**: Update a new contest user.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/updateontestUser
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
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input contest user data in a json file:
              - "contestUser.json" file contains: {"userName": "John", "password": "123", "firstName": "John", "lastName": "White"}
          2. curl -H "Content-Type: application/json" -d @user.json "http://einstein.sv.cmu.edu:9000/updateContestUser"
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the userName/password is wrong
      
22. <a name="22"></a>**DELETE A CONTEST USER**
    - **Purpose**: Delete a contest user.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteContestUser/<"userName">/<"password">
    - **Semantics**
        - **userName** (string, not null): Contest user name
        - **password** (string, not null): Password
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteContestUser/John/123
      - **Result**: HTTP 201 if the contest user has been successfully deleted
      
[1]: http://einstein.sv.cmu.edu:9000/ "The Application Server running in the Smart Spaces Lab, CMUSV"

## Support

Please contact Zhaokun Li, Xia Liu, Dong Chen

Professor Jia Zhang
