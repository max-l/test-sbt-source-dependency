
import sbt._
import Keys._


object Buildz extends Build {

  def buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "z",
    version := "0.0.1",
    scalaVersion := "2.9.1"
  )

  import com.strong_links.PegDown

  lazy val vote = Project(
    id = "x",
    base = file("."),
    settings = buildSettings  ++ PegDown.init
  )
}
