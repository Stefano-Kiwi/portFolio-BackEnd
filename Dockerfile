FROM amazoncorretto:20
MAINTAINER SCB
COPY target/stefano-0.0.1-SNAPSHOT.jar stefano-app.jar
ENTRYPOINT ["java","-jar","/stefano-app.jar"]  