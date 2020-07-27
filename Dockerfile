FROM openjdk:8

WORKDIR /usr/app

COPY target/*.jar .


CMD ["java","-jar","DemoApp-1.0-SNAPSHOT.jar"]