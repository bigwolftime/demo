# Use OpenJDK 8 as the base image
FROM openjdk:8-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application's jar file into the container
COPY target/*.jar app.jar

# Make port 8080 available outside this container
EXPOSE 8080
EXPOSE 18080
EXPOSE 3306

# Run the jar file
ENTRYPOINT ["java","-jar","/app/app.jar"]