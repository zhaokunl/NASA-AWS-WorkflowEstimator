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

## Support

Zhaokun Li, Xia Liu, Dong Chen

Professor Jia Zhang
