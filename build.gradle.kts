plugins {
    `java-platform`
    `maven-publish`
}

group = "com.github.vhromada.project"
version = "5.0.0"

dependencies {
    constraints {
        val swaggerVersion = "3.0.0"
        api("io.springfox:springfox-swagger-ui:$swaggerVersion")
        api("io.springfox:springfox-swagger2:$swaggerVersion")
        api("io.springfox:springfox-bean-validators:$swaggerVersion")
        api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
        api("io.github.microutils:kotlin-logging:1.8.3")
        api("com.h2database:h2:1.4.200")
    }
    api(platform("org.springframework.boot:spring-boot-dependencies:2.3.3.RELEASE"))
}

javaPlatform {
    allowDependencies()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["javaPlatform"])
        }
    }
}
