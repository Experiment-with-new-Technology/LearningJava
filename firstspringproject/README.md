## Spring boot Initiate

### Pre-requisite
1. Java (JDK 7+)
2. Intelij

#### Project Initiation

1. First we have to create spring boot project. Just go to File->New->Project then select spring initializr & get like:
![alt text](https://raw.githubusercontent.com/rakib09/LearningJava/master/assets/1.PNG "Spring project initiate")
2. Then Input Group, Artifact, Type, Language, packaging, Java Version, Version, name, escription, package like as bellow:

In my project, Group: com.extremecoder.springproject

Artifact: firstproject

Type: Maven Project

Language: Java,Packaging: Jar, Java Version: 8, Version: 0.0.1-SNAPSHOT,

Name: firstproject

Description: Demo project for Spring Boot

Package: com.extremecoder.springproject.firstproject


![alt text](https://raw.githubusercontent.com/rakib09/LearningJava/master/assets/2.PNG "Spring project setup")

3. Then you have to add project dependencies what you needed. First we can add only Web & click next button.

![alt text](https://raw.githubusercontent.com/rakib09/LearningJava/master/assets/3.PNG "Spring project dependency added")

4. Then set project name, location as like:

![alt text](https://raw.githubusercontent.com/rakib09/LearningJava/master/assets/4.PNG "Spring project location")

5. Then get the initiation of whole project as like:

![alt text](https://raw.githubusercontent.com/rakib09/LearningJava/master/assets/5.PNG "Spring project initiate")

6. Now we have to add controller, view, project application properties like: 

a. create package name 'controller' under your root package (com.extremecoder.springproject.firstproject)
    
b. create HomeController like:
    
```
package com.extremecoder.springproject.firstspringproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
```

c. add configuration in application.properties under main/resources/application.properties

```
#port
server.port=1010
#jsp
spring.mvc.view.prefix: /WEB-INF/views/
spring.mvc.view.suffix: .jsp
``` 
d. create directory src/main/webapp/WEB-INF/views & create index.jsp file

```
<h1>Hello</h1>
``` 

e. make pom.xml like: 

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.extremecoder.springproject</groupId>
	<artifactId>firstspringproject</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>firstspringproject</name>
	<description>Demo project for Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>


</project>

```

Make intelij Hot Swap: 

[Spring Boot Application Live Reload Hot Swap With Intellij Idea](https://rakib09.github.io/2017/04/28/Spring-Boot-Application-Live-Reload-Hot-Swap-With-Intellij-IDEA/)

Run application