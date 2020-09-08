FROM openjdk:11-jre-slim

ENV TZ America/Sao_Paulo

COPY ./target/monitoring.jar /app/

ENTRYPOINT exec java $JAVA_OPTIONS -jar /app/monitoring.jar

EXPOSE 9000
