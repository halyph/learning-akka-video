name := "akka-playground"

version := "1.0"

scalaVersion in ThisBuild := "2.11.8"

lazy val aggregatedProjects: Seq[ProjectReference] = Seq(
  helloAkka,
  playingWithActors,
  actorPaths,
  actorRouting,
  hotswapBehavior,
  persistence,
  persistentFsm
)

lazy val root = Project(
    id = "learning-akka-video",
    base = file("."),
    aggregate = aggregatedProjects
  )


lazy val helloAkka = project("hello-akka")
lazy val playingWithActors = project("playing-with-actors")
lazy val actorPaths = project("actor-paths")
lazy val actorRouting = project("akka-routing")
lazy val hotswapBehavior = project("hotswap-behavior")
lazy val persistence = project("persistence")
lazy val persistentFsm = project("persistent-fsm")

def project(id: String) = Project(id, base = file(id))