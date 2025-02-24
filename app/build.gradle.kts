plugins {
    id 'org.springframework.boot' version '2.7.6'
    id 'io.spring.dependency-management' version '1.0.14.RELEASE'
    id 'java'
}

group = 'com.exemplo'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'com.microsoft.sqlserver:mssql-jdbc'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
    useJUnitPlatform()
}