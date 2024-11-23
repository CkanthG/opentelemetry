FROM eclipse-temurin:17-jre

ADD target/opentelemetry.jar /opentelemetry.jar

ENTRYPOINT java -jar /opentelemetry.jar --spring.application.name=OpenTelemetry --server.port=8080
