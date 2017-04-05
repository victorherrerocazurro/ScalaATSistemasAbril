name := "Simple Project"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.file("Local", file(System.getenv("IVY_HOME") + "/cache"))(Resolver.ivyStylePatterns)

// https://mvnrepository.com/artifact/org.scalatest/scalatest_2.11
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"

lazy val hello = taskKey[Unit]("An example task")

hello := { println("Hello!") }
