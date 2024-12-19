# Use a base image with Java and a minimal Linux distribution
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper and source code into the container
#COPY .mvn/ .mvn
#COPY mvnw .
#COPY pom.xml .

# Copy the application source code into the container
#COPY src/ src/

# Expose the port your Spring Boot app is running on (default is 8080)
EXPOSE 8080

# Build the application
#RUN ./mvnw clean package -DskipTests

# Copy the JAR file into the container
COPY target/hello-springboot-cucumber-1.0.0.jar app.jar

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]