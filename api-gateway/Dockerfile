# Use the Amazon Corretto 17 image as the base image
FROM amazoncorretto:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot application jar to the container
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

# Expose the port Eureka Server is running on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
