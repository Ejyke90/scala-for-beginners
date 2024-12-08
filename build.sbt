name := "scala-for-beginners"

version := "0.1.0-SNAPSHOT"

scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.7.1",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.7.1",
  "org.scalatest" %% "scalatest" % "3.2.16" % Test,
  "io.spray" %% "spray-json" % "1.3.6",
  "com.typesafe.akka" %% "akka-testkit" % "2.7.1" % Test
)