addCommandAlias("build", ";headerCreate;compile")
addCommandAlias("rebuild", ";clean;build")

lazy val root = project.in(file("."))
  .enablePlugins(AssemblyPlugin, AutomateHeaderPlugin)
  .settings(logLevel in Test := Level.Info)
  .settings(logLevel in Compile := Level.Error)
  .settings(libraryDependencies += Dependency.Akka)
  .settings(libraryDependencies ++= Dependency.Logging)
  .settings(libraryDependencies ++= Dependency.Tools)
  .settings(libraryDependencies += Dependency.ScalaTest)
  .settings(libraryDependencies += Dependency.MongoDB)
  //.settings(libraryDependencies += Dependency.LoMRF)
  //.settings(libraryDependencies ++= Dependency.Optimus)
