FROM openjdk:21
COPY target/demorestapi-0.0.1-SNAPSHOT.jar demorestapi-0.0.1-SNAPSHOT.jar
CMD java -jar demorestapi-0.0.1-SNAPSHOT.jar