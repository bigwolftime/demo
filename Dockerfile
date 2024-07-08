# Use OpenJDK 8 as the base image
#FROM openjdk:8-jre-slim
FROM azul/zulu-openjdk:8

# install telnet
#RUN apt update && apt install -y telnet curl
RUN apt update && apt install -y telnet

# Set the working directory in the container
WORKDIR /app

# Copy the application's jar file into the container
COPY target/*.jar app.jar

# Make port 8080 available outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app/app.jar"]