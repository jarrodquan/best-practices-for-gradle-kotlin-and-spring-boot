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
include("app-common")
include("app-domain")
include("app-port")
include("app-port-repo")
include("app-adapter")
include("repo-mysql-adapter")
include("web-adapter")