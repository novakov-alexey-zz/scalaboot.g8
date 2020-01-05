import sbt._

object Dependencies {
  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  
  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.1.11"
  lazy val akkaStreams = "com.typesafe.akka" %% "akka-stream" % "2.6.1"
  lazy val akkaCirce =  "de.heikoseeberger" %% "akka-http-circe" % "1.30.0"
  
  lazy val circeGeneric = "io.circe" %% "circe-generic" % "0.12.3"
}
