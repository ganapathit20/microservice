FROM openjdk:8-jdk-alpine
EXPOSE 7271
ARG JAR_FILE=target/Demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} Demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Demo-0.0.1-SNAPSHOT.jar"]