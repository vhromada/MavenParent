plugins {
    `java-platform`
    `maven-publish`
}

group = "com.github.vhromada.project"
version = "5.0.1"

dependencies {
    constraints {
        api("io.springfox:springfox-boot-starter:3.0.0")
        api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
        api("io.github.microutils:kotlin-logging:1.12.0")
        api("com.h2database:h2:1.4.200")
    }
    api(platform("org.springframework.boot:spring-boot-dependencies:2.3.4.RELEASE"))
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
