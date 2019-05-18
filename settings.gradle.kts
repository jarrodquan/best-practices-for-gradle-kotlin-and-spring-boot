pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven {
            url = uri("https://maven.aliyun.com/nexus/content/groups/public")
        }
        jcenter()
        mavenCentral()
    }
}

rootProject.name = "shack"
include("application")
include("application:domain")
include("application:implementation")
include("application:port")
include("application:mysql-port")
include("mysql-adapter")
include("web-adapter")