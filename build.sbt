ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "oops2_1706"
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"