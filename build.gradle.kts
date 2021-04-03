plugins {
    `java-platform`
    `maven-publish`
}

group = "com.github.vhromada.project"
version = "5.0.5"

dependencies {
    constraints {
        api("io.springfox:springfox-boot-starter:3.0.0")
        api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
        api("io.github.microutils:kotlin-logging:2.0.6")
        api("com.h2database:h2:1.4.200")
    }
    api(platform("org.springframework.boot:spring-boot-dependencies:2.4.4"))
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
