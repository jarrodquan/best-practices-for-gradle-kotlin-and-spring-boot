import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
}

allprojects {
    group = "com.jarrodquan"
    version = "0.0.1.SNAPSHOT"

    buildscript {
        repositories {
            mavenLocal()
            maven {
                url = uri("https://maven.aliyun.com/nexus/content/groups/public")
            }
            jcenter()
            mavenCentral()
        }
    }

    repositories {
        mavenLocal()
        maven {
            url = uri("https://maven.aliyun.com/nexus/content/groups/public")
        }
        jcenter()
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(kotlin("reflect"))

        testImplementation(kotlin("test"))
        testImplementation(kotlin("test-junit"))
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.clean {
        doLast {
            project.delete("out")
            println("Folder \"out\" has been cleared.")
        }
    }
}