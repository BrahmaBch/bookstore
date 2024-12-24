# Use an OpenJDK 17 base image (since your pom.xml is using Java 17)
FROM openjdk:17-jdk-slim

# Expose port 8080 (common for Spring Boot apps)
EXPOSE 9001

# Copy the Spring Boot jar from the target folder to the Docker container
# Assuming the jar file is named bookstore-0.0.1-SNAPSHOT.jar (adjust the version if necessary)
ADD target/bookstore-0.0.1-SNAPSHOT.jar bookstore.jar

# Set the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/bookstore.jar"]
