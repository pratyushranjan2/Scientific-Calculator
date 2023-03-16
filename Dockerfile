FROM openjdk:11
COPY ./target/Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]