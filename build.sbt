lazy val `sample-play` = project.
  settings(SampleSettings.commons).
  settings(libraryDependencies ++= Seq(
    guice,
    evolutions,
    jdbc,
    "mysql" % "mysql-connector-java" % "8.0.16",
    "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  )).
  enablePlugins(PlayScala).
  dependsOn(`sample-domain`)

lazy val `sample-domain` = project.
  settings(SampleSettings.commons)

lazy val root = Project("sample-root", file("."))
