enablePlugins(ScalaJSPlugin)

// project name/version
name := "scala-js-mousetrap"
version := "1.6.1"

// what version of scala to use
scalaVersion := "2.12.3"

// libraries
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)

// javascript sources
jsDependencies ++= Seq(
  "org.webjars.npm" % "mousetrap" % "1.6.1" / "mousetrap.js" minified "mousetrap.min.js" commonJSName "Mousetrap"
)
