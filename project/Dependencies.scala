import sbt._

object Dependencies {
  lazy val projectDeps = 
    "org.scalatest" %% "scalatest" % "3.0.5" ::
    "com.typesafe.akka" %% "akka-actor" % "2.5.17" ::
    Nil
}
