FROM openjdk:8-alpine
ADD build/libs/springboot-jenkins-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
