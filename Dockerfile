FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN apk --no-cache add curl
RUN curl -L "https://dl.bintray.com/frailwords/ebi_test/ebi_test/ebi_test_release/1.0/ebi_test_release-1.0.jar" -o server.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /server.jar" ]
EXPOSE 8080