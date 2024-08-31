# Use the Amazon Corretto 17 image as the base image
FROM amazoncorretto:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot application jar to the container
COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar

# Expose the port Eureka Server is running on
EXPOSE 8761

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
