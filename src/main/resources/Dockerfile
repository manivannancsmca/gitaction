FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/gitaction.jar gitaction.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gitaction.jar"]