plugins {
    id("org.springframework.boot") version "2.1.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
    war
    kotlin("plugin.spring") version "1.3.31"
}

dependencies {
    implementation(project(":app-common"))
    implementation(project(":app-domain"))
    implementation(project(":app-port"))
    implementation(project(":app-port-repo"))
    implementation(project(":adapter-repo-mysql"))
    implementation(project(":app-adapter"))

    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.hateoas:spring-hateoas")

    compileOnly("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")

    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
}