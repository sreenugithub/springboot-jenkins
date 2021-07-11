# Start with a base image containing Java runtime
FROM openjdk:8

# Add Maintainer Info
#LABEL maintainer="akhan@affiniongroup.com,simore@affiniongroup.com"

# Add a volume pointing to /tmp
#VOLUME /tmp

# Make port 8087 available to the world outside this container
EXPOSE 8000

# The application's jar file
#ARG JAR_FILE=./build/libs/benefit-standing-data-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} benefit-standing-data-service.jar

# Run the jar file
#ENTRYPOINT ["java","-Dserver.port=8087","-Djava.security.egd=file:/dev/./urandom","-jar","/benefit-standing-data-service.jar"]
ADD target/docker.jar docker.jar
ENTRYPOINT ["java","-jar","/docker.jar"]