FROM openjdk:8-jre-alpine

WORKDIR /app

COPY docker/harden.sh /usr/bin/harden.sh
COPY target/lunch-time-*.jar /app/lunch-time.jar

RUN chmod +x /usr/bin/harden.sh && \
    /usr/bin/harden.sh && \
    rm /bin/sh

USER lunch-time

EXPOSE 8080

ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-jar", "lunch-time.jar"]
