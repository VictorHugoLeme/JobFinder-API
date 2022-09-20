FROM adoptopenjdk/openjdk8:jre
MAINTAINER victorhleme.dev
COPY target/jobfinder-0.0.1-SNAPSHOT.jar jobfinder-server.jar
ENTRYPOINT ["java","-jar","/jobfinder-server.jar"]