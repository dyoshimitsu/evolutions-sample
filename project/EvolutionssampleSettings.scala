import sbt._
import Keys._
import sbt.Def.SettingList

object EvolutionssampleSettings {
  lazy val commons = new SettingList(Seq(
    // https://mvnrepository.com/artifact/org.scala-lang/scala-library
    scalaVersion := "2.13.0",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfuture",
    ),
    organization := "org.example",
    libraryDependencies ++= Seq(
      // https://mvnrepository.com/artifact/org.scalatest/scalatest
      "org.scalatest" %% "scalatest" % "3.0.8" % Test,
    ),
  ))
}
