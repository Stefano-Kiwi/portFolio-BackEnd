FROM amazoncorretto:17
MAINTAINER stefano
COPY target/stefano-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
