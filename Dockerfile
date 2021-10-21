FROM openjdk:8
ADD target/spring-boot-react-mysql-0.0.1-SNAPSHOT.jar spring-boot-react-mysql-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","spring-boot-react-mysql-0.0.1-SNAPSHOT.jar"]
