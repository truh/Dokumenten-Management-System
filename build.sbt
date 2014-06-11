import play.Project._

name := """Dokumenten-Mangement-System"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1")

libraryDependencies ++= Seq(
  "javax.el" % "javax.el-api" % "3.0.1-b04")

libraryDependencies ++= Seq(
  "org.hibernate" % "hibernate" % "3.6.0.Beta2",
  "org.hibernate" % "hibernate-annotations" % "3.5.6-Final",
  "org.hibernate" % "hibernate-validator" % "5.1.1.Final",
  "org.hibernate" % "hibernate-osgi" % "4.3.5.Final",
  "org.hibernate" % "hibernate-proxool" % "4.3.5.Final",
  "org.hibernate" % "hibernate-testing" % "4.3.5.Final",
  "org.hibernate" % "hibernate-validator-parent" % "5.1.1.Final",
  "org.hibernate" % "hibernate-validator-cdi" % "5.1.1.Final",
  "org.hibernate" % "hibernate-validator-annotation-processor" % "5.1.1.Final",
  "org.hibernate" % "hibernate-search-parent" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-engine" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-orm" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-serialization-java" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-serialization-avro" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-backend-jgroups" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-backend-jms" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-testing" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-infinispan" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-modules" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-integrationtest-osgi-features" % "5.0.0.Alpha4",
  "org.hibernate" % "hibernate-search-integrationtest-osgi" % "5.0.0.Alpha4")

libraryDependencies += javaEbean

playJavaSettings
