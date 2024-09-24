FROM openjdk:11
EXPOSE 8080
ADD target/lab2-arq-0.0.1-SNAPSHOT.jar lab2-arq-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/lab2-arq-0.0.1-SNAPSHOT.jar"]