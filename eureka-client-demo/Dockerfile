# Use the Amazon Corretto 17 image as the base image
FROM amazoncorretto:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot application jar to the container
COPY target/eureka-client-demo-0.0.1-SNAPSHOT.jar demo-client.jar

# Expose the port Eureka Server is running on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "demo-client.jar"]
