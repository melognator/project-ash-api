FROM maven:3.8.4 AS BUILD
COPY ./src /home/app/src
COPY ./pom.xml /home/app/pom.xml
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:17.0.1-slim
WORKDIR /usr/src
COPY --from=BUILD /home/app/target/centropokemon-0.0.1-SNAPSHOT.jar /usr/src/centropokemon.jar
EXPOSE 5151
ENTRYPOINT [ "java",  "-jar", "/usr/src/centropokemon.jar"]
