FROM openjdk:8
ADD target/dockerImpl-0.0.1-SNAPSHOT.jar dockerImpl-0.0.1-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "dockerImpl-0.0.1-SNAPSHOT.jar"]