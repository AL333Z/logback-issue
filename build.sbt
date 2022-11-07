ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "logback-issue",
    // it works with 1.4.1, broken with https://github.com/qos-ch/logback/commit/7e3e2ae770c19724b0714c7f48fd33bbc6791c7e#diff-e5a738c3ab37fbeacbb433d7d7171c51c6058623c377c8549191ad47ca5020f3R177
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.4"
  )
