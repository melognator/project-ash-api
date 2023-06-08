FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 5151
ARG JAR_FILE=target/centropokemon-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]