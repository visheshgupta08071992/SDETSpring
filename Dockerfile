# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/SDETSpring-0.0.1-SNAPSHOT.jar SDETSpring-0.0.1-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-jar","SDETSpring-0.0.1-SNAPSHOT.jar"]