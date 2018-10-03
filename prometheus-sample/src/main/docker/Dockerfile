FROM java:8
VOLUME /tmp
ADD prometheus-sample-0.0.1-SNAPSHOT.jar /opt/prometheus-sample-1.0-RELEASE.jar
RUN bash -c 'touch /opt/prometheus-sample-1.0-RELEASE.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/prometheus-sample-1.0-RELEASE.jar"]
