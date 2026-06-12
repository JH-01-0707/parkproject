FROM eclipse-temurin:21-jre-noble
WORKDIR /app
ARG JAR_FILE=park_project/target/*.jar app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java" , "-jar" , "app.jar" ]