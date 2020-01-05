import Dependencies._

ThisBuild / organization := "com.example"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file(".")).
  settings(
    name := "scalaboot",
    libraryDependencies ++= Seq(
      akkaHttp,
      akkaStreams,
      scalaLogging,
      logback,
      akkaCirce,
      circeGeneric,
      scalaTest % Test
    )
  )
