name := "Actores"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.file("Local", file(System.getenv("IVY_HOME") + "/cache"))(Resolver.ivyStylePatterns)

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.17"