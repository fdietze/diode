enablePlugins(ScalaJSPlugin)

name := "Diode RAF Example"

scalaVersion := "2.11.7"

workbenchSettings

bootSnippet := "SimpleApp().main();"

// create javascript launcher. Searches for an object extends JSApp
persistLauncher := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "com.lihaoyi" %%% "scalatags" % "0.5.3",
  "me.chrons" %%% "diode-core" % "0.6.0-SNAPSHOT"
)
