name := "jimple2cpg"

scalaVersion       := "2.13.8"
crossScalaVersions := Seq("2.13.8", "3.3.0")

dependsOn(Projects.dataflowengineoss, Projects.x2cpg % "compile->compile;test->test")

libraryDependencies ++= Seq(
  "io.shiftleft"  %% "codepropertygraph" % Versions.cpg,
  "org.soot-oss"   % "soot"              % "4.4.1",
  "org.scalatest" %% "scalatest"         % Versions.scalatest % Test
)

scalacOptions ++= Seq(
  "-deprecation" // Emit warning and location for usages of deprecated APIs.
)

enablePlugins(JavaAppPackaging, LauncherJarPlugin)
trapExit    := false
Test / fork := true
