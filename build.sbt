enablePlugins(ScalaJSPlugin)

name := "Scala Troubleshooting"

scalaVersion := "2.11.8"

artifactPath in fastOptJS := file("output.js")
