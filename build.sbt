name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.0"

val sparkVersion = "2.1.0"

libraryDependencies ++= Seq(
		    "org.apache.spark" %% "spark-core" % "2.1.0",
		    "org.apache.spark" %% "spark-sql" % "2.1.0")
