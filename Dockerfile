FROM openjdk:11-jdk-slim
LABEL maintainer="kennethjusino@hotmail.com"
ARG JAR_FILE=./target/BlogService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]