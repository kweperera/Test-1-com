FROM openjdk:8
VOLUME /tmp
ADD target/user-catalog.jar user-catalog.jar



ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

ENTRYPOINT ["java", "-jar", "user-catalog.jar"]