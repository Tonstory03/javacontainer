FROM openjdk:8-jdk-alpine
WORKDIR /usr/src/app
ARG JAR_FILE=build/lib/*.jar
COPY ${JAR_FILE} javacontainer.jar
ENTRYPOINT ["java","-jar","javacontainer.jar"]