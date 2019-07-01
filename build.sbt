lazy val `evolutions-sample-play` = project.
  settings(EvolutionssampleSettings.commons).
  settings(libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  )).
  enablePlugins(PlayScala).
  dependsOn(`evolutions-sample-domain`)

lazy val `evolutions-sample-domain` = project.
  settings(EvolutionssampleSettings.commons)

lazy val root = Project("evolutions-sample-root", file("."))
