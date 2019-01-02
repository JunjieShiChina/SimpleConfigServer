FROM java:8
MAINTAINER junjieshi
ADD SimpleConfigServer.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8761
ENTRYPOINT ["java", "-jar","/app.jar","peer1"]