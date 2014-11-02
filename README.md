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
Overview:
---------
Currently we are providing APIs in 3 categores:

**Category 1: Recommadation**<br/>
   - [Log in](#1)
   - [Log in with authentication](#2)
   - [Account Summary](#3)
   - [Log out](#4)
   - [Tutorial](#5)
   - [Estimator1](#6)
   - [Estimator2](#7)
   - [Estimator3](#8)

**Category 2: Registration**<br/>
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
    - **URL**: http://einstein.sv.cmu.edu:9000/estimator/login
    - **Sample Usages**:
      - **Command Line Example**: 
            curl http://einstein.sv.cmu.edu:9000/estimator/login
      - **Result**: HTTP 200 if the logged in successfully posted, HTTP 500 if failed.
    
2. <a name="5"></a>**Log in with authentication**
    - **Purpose**: Log into the website with. 
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/estimator/login
    - **Semantics**:
        - **sensorName**: Existing sensor name.
        - **startTime**: Start time of the readings to query.
        - **endTime**: End time of the readings to query.
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getSensorReadingInRange/androidAccelerometer/1395266600000/1395279800000/csv
      - **Sample csv result**: (sensorName,timestamp,value)<br/>
          sensor1,1368568993000,517.0 <br/>
          ... <br/>
          sensor1,1368568896000,518.0
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getSensorReadingInRange/androidAccelerometer/1395266600000/1395279800000/json
      - **Sample json result**: <br/>
          [{"timestamp":1368568993000,"value":517,"sensorName":"sensor1"},
          ... <br/>
          {"timestamp":1368568896000,"value": 520,"sensorName":"sensor1"}]
      - **Result**: HTTP 200 if returned successfully, HTTP 404 if not found.

3. <a name="22"></a>**Account Summary**
    - **Purpose**: Add a new sensor category to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addSensorCategory
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorCategoryName** (string, not null): Non existing unique name of the sensor category
        - **purpose** (string, optional): Purpose of the sensor category
    - **Sensor type metadata format**: {"sensorCategoryName": <"sensorCategoryName">, "purpose": <"purpose">}    
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "sensorCategory.json" file contains: {"sensorCategoryName": "Category 1", "purpose": "Test only"}
          2. curl -H "Content-Type: application/json" -d @sensorCategory.json "http://einstein.sv.cmu.edu:9000/addSensorCategory"
      - **Result**: HTTP 201 if the sensor category metadata has been successfully added to the database, HTTP 400 if the sensorCategoryName is already been used


4. <a name="8"></a>**Log out**
    - **Purpose**: Add a new sensor type to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addSensorType
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorTypeName** (string, not null): Non existing unique name of the sensor type
        - **manufacturer** (string, optional): Name of the manufacturerof this sensor type
        - **version** (string, optional): Version of the sensor type
        - **maximumValue** (double, optional): Maximum value of the sensor reading under this sensor type
        - **minimumValue** (double, optional): Minimum value of the sensor reading under this sensor type
        - **unit** (string, optional): Unit of the sensor reading under this sensor type
        - **interpreter** (string, optional): The interpreter used to parse the sensor reading under this sensor type
        - **sensorTypeUserDefinedFields** (string): User defined fields
        - **sensorCategoryName** (string, not null): Existing sensor category name which the sensor type belongs to
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "sensorType.json" file contains: {"sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment"}
          2. curl -H "Content-Type: application/json" -d @sensorType.json "http://einstein.sv.cmu.edu:9000/addSensorType"
      - **Result**: HTTP 201 if the sensor type metadata has been successfully added to the database, HTTP 400 if failed.

5. <a name="9"></a>**Tutorial**
    - **Purpose**: Add a new sensor to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/addSensor
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorName** (string, not null): Non existing unique name of the sensor
        - **sensorTypeName** (string, not null): Existing name of its sensor type
        - **deviceUri** (string, not null): Existing device URI it belongs to
        - **sensorUserDefinedFields** (string, optional): User defined fields.
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor metadata in a json file:
              - "sensor.json" file contains: {"sensorName": "TestSensor", "sensorTypeName": "Humidity", "deviceUri": "www.testsensor.com", "sensorUserDefinedFields": "Test only"}
          2. curl -H "Content-Type: application/json" -d @sensor.json "http://einstein.sv.cmu.edu:9000/addSensor"
      - **Result**: HTTP 201 if the sensor metadata have been successfully added to the database, HTTP 400 if failed.

6. <a name="12"></a>**EDIT ESTIMATION TYPE**
    - **Purpose**: Edit a sensor type to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/updateSensorType
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorTypeName** (string, not null): Name of the sensor type, which cannot be changed
        - **sensorTypeUserDefinedFields** (string, not null): User defined fields
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "sensorType.json" file contains: {"sensorTypeName": "Humidity", "sensorTypeUserDefinedFields": "Testing only"}
          2. curl -H "Content-Type: application/json" -d @sensorType.json "http://einstein.sv.cmu.edu:9000/updateSensorType"
      - **Result**: HTTP 200 if the sensor type metadata has been successfully updated to the database


6. <a name="23"></a>**Estimator1**
    - **Purpose**: Edit a sensor category to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/updateSensorCategory
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorCategoryName** (string, not null): Name of the sensor category, which cannot be changed
        - **purpose** (string, not null): Purpose of the sensor category
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor type metadata in a json file:
              - "sensorCategory.json" file contains: {"sensorCategoryName": "Category 1", "purpose": "Production only"}
          2. curl -H "Content-Type: application/json" -d @sensorCategory.json "http://einstein.sv.cmu.edu:9000/updateSensorCategory"
      - **Result**: HTTP 200 if the sensor category metadata has been successfully updated to the database

17. <a name="13"></a>**EDIT ESTIMATION**
    - **Purpose**: Edit a sensor to sensor data service platform.
    - **Method**: POST
    - **URL**: http://einstein.sv.cmu.edu:9000/updateSensor
    - **Semantics**: As a POST method, the API cannot be directly executed through a web browser.  Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
        - **sensorName** (string, not null): Name of the sensor, which cannot be changed
        - **sensorUserDefinedFields** (string, not null): User defined fields.
    - **Sample Usages**:
      - **Command Line Example**: 
          1. Prepare input sensor metadata in a json file:
              - "sensor.json" file contains: {"sensorName": "TestSensor", "sensorUserDefinedFields": "Production only"}
          2. curl -H "Content-Type: application/json" -d @sensor.json "http://einstein.sv.cmu.edu:9000/updateSensor"
      - **Result**: HTTP 200 if the sensor metadata have been successfully updated to the database

31. <a name="31"></a>**GET ALL ESTIMATION CATEGORIES**
    - **Purpose**: Query all sensor categories.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensorCategories/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**:  
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getAllSensorCategories/csv<br/>
      - **Sample csv result**: (sensorCategoryName,purpose) </br>sensorCategory1, temp
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getAllSensorCategories/json
      - **Sample json result**: [{"sensorCategoryName":sensorCategory1,"purpose":"temp"}]
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.
      
32. <a name="32"></a>**GET A SPECIFIC ESTIMATION CATEGORY**
    - **Purpose**: Query a specific sensor category.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getSensorCategory/<"sensorCategoryName">/<"resultFormat">
    - **Semantics**: 
        - **sensorCategoryName**: Sensor category name.
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Result**: HTTP 200 if the sensorCategoryName exists, HTTP 404 if not found
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getSensorCategory/sensorCategory1/csv<br/>
      - **Sample csv result**: (sensorCategoryName,purpose) </br>sensorCategory1, temp
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getSensorCategory/sensorCategory1/json
      - **Sample json result**: {"sensorCategoryName":sensorCategory1,"purpose":"temp"}
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.
      
33. <a name="33"></a>**GET ALL ESTIMATION TYPES**
    - **Purpose**: Query all sensor types.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensorTypes/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getAllSensorTypes/csv<br/>
      - **Sample csv result**: (sensorTypeName, manufacturer,version,maximumValue,minimumValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getAllSensorTypes/json
      - **Sample json result**: [{"sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment"}]
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

34. <a name="34"></a>**GET A SPECIFIC ESTIMATION TYPE**
    - **Purpose**: Query a specific sensor type.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getSensorType/<"sensorTypeName">/<"resultFormat">
    - **Semantics**: 
        - **sensorTypeName**" Sensor type name
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**:  
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getSensorType/Humidity/csv<br/>
      - **Sample csv result**: (sensorTypeName, manufacturer,version,maximumValue,minimumValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getSensorType/Humidity/json
      - **Sample json result**: {"sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment"}
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.
    

35. <a name="35"></a>**GET ALL ESTIMATIONS**
    - **Purpose**: Query all sensors.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensors/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getAllSensors/csv<br/>
      - **Sample csv result**: (sensorName, sensorUserDefinedFields, deviceUri, sensorTypeName, manufacturer,version,maximumValue,minimumValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>sensor01, for test, www.device.com/001, Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment, test only
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getAllSensors/json
      - **Sample json result**: [{"sensorName": "sensor01", "sensorUserDefinedFields": "for test", "deviceUri": "www.device.com/001","sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment", "purpose": "test only"}]
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

28. <a name="28"></a>**GET ALL ESTIMATIONS (REDUCED)**
    - **Purpose**: Query all sensors and returns a subset of the information (for faster performance).
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensorsReduced/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      TODO

36. <a name="36"></a>**GET A SPECIFIC ESTIMATION**
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

41. <a name="24"></a>**DELETE ESTIMATION CATEGORY**
    - **Purpose**: Delete a sensor category from sensor data service platform.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteSensorCategory/<"sensorCategoryName">
    - **Semantics**
        - **sensorCategoryName** (string, not null): Name of the sensor category
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteSensorCategory/testSensorCategoryName
      - **Result**: HTTP 201 if the sensor category metadata has been successfully deleted from the database

42. <a name="16"></a>**DELETE ESTIMATION TYPE**
    - **Purpose**: Delete a sensor type from sensor data service platform.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteSensorType/<"sensorTypeName">
    - **Semantics**
        - **sensorTypeName** (string, not null): Name of the sensor type
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteSensorType/testSensorTypeName
      - **Result**: HTTP 201 if the sensor type metadata has been successfully deleted from the database

43. <a name="17"></a>**DELETE ESTIMATION**
    - **Purpose**: Delete a sensor from sensor data service platform.
    - **Method**: DELETE
    - **URL**: http://einstein.sv.cmu.edu:9000/deleteSensor/<"sensorName">
    - **Semantics**
        - **sensorName** (string, not null): Name of the sensor
    - **Sample Usages**:
      - **Command Line Example**: 
          1. curl -X DELETE http://localhost:9000/deleteSensor/testSensorName
      - **Result**: HTTP 201 if the sensor metadata has been successfully deleted from the database
      

41. <a name="41"></a>**ADD USER**
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

42. <a name="42"></a>**GET A USER INFORMATION**
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

43. <a name="43"></a>**ADD ESTIMATION AS A REGISTERD USER**
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

44. <a name="44"></a>**GET ALL ESTIMATIONS AS A REGISTERED USER**
    - **Purpose**: Query all sensors which has been added by a registered user.
    - **Method**: GET(Specify user name in request header)
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllSensors/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: curl -H "Authorization:John" http://einstein.sv.cmu.edu:9000/getAllSensors/csv<br/>
      - **Sample csv result**: (sensorName, sensorUserDefinedFields, deviceUri, sensorTypeName, manufacturer,version,maximumValue,minimumValue,unit,interpreter,sensorTypeUserDefinedFields, sensorCategoryName) </br>sensor01, for test, www.device.com/001, Humidity, Motorola, 1.0, 100, 0, Percentage, MyInterpreter, Testing only, Environment, test only
      - **Sample json request**: curl -H "Authorization:John" http://einstein.sv.cmu.edu:9000/getAllSensorTypes/json
      - **Sample json result**: [{"sensorName": "sensor01", "sensorUserDefinedFields": "for test", "deviceUri": "www.device.com/001","sensorTypeName": "Humidity", "manufacturer": "Motorola", "version": "1.0", "maximumValue": 100, "minimumValue": 0, "unit": "Percentage", "interpreter": "MyInterpreter", "sensorTypeUserDefinedFields": "Testing only", "sensorCategoryName": "Environment", "purpose": "test only"}]
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.


45. <a name="45"></a>**GET A SPECIFIC ESTIMATION AS A REGISTERED USER**
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


51. <a name="51"></a>**ADD A CONTEST USER**
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
      
52. <a name="52"></a>**UPDATE A CONTEST USER**
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
      
53. <a name="53"></a>**DELETE A CONTEST USER**
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

54. <a name="54"></a>**GET ALL REGISTERED CONTEST USERS**
    - **Purpose**: Query all registered contest users.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getAllContestUsers/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getAllContestUsers/csv<br/>
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getAllContestUsers/json
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

55. <a name="55"></a>**GET SPECIFIC REGISTERED CONTEST USER**
    - **Purpose**: Query specific registered contest user.
    - **Method**: GET
    - **URL**: http://einstein.sv.cmu.edu:9000/getContestUser/<"userName">/<"password">/<"resultFormat">
    - **Semantics**: 
        - **resultFormat**: Either JSON or CSV.
    - **Sample Usages**: 
      - **Sample csv request**: http://einstein.sv.cmu.edu:9000/getContestUser/John/123/csv<br/>
      - **Sample json request**: http://einstein.sv.cmu.edu:9000/getContestUser/John/123/json
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

[1]: http://einstein.sv.cmu.edu:9000/ "The Application Server running in the Smart Spaces Lab, CMUSV"

## Support

Zhaokun Li, Xia Liu, Dong Chen

Professor Jia Zhang
