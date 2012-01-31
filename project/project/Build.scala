
import sbt._
import Keys._

object PluginDef extends Build {
	
	override lazy val projects = Seq(root)
	
	lazy val root = Project("plugins", file(".")) dependsOn( pegdownPlugin )
	
	lazy val pegdownPlugin = file("C:/dev/sl-0.3/git-projects/pegdown-sbt")
	
	//lazy val pegdownPlugin = uri("git://github.com/max-l/pegdown-sbt.git")  
}
