name := "NASA-AWS-WorkflowEstimator"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa, 
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
  "com.google.code.gson" % "gson" % "2.2.2",
  "com.amazonaws" % "aws-java-sdk" % "1.7.6",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"
)     

play.Project.playJavaSettings

