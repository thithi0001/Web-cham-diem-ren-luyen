# Dockerfile cho Backend (Spring Boot)
FROM openjdk:17
WORKDIR /app
COPY target/backend.jar app.jar
# dieu chinh duong dan cho file .jar
# cai lai Maven
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


