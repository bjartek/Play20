import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "computer-database-mongo"
    val appVersion      = "1.0"

    val appDependencies = Seq(
          "leodagdag"                         % "play2-morphia-plugin_2.9.1"  % "0.0.6"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
       resolvers ++= Seq(DefaultMavenRepository, Resolvers.githubRepository, Resolvers.morphiaRepository)
    )

    object Resolvers {
      val githubRepository = "LeoDagDag repository" at "http://leodagdag.github.com/repository/"
      val morphiaRepository = "Morphia repository" at "http://morphia.googlecode.com/svn/mavenrepo/"
    }
}
            
