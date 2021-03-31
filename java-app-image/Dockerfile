FROM openjdk:8-alpine
ENV JVM_MAX_MEMORY 256M
ENV JVM_MIN_MEMORY 256M
ENV JAVA_OPTS ""
COPY org.javacream.training.docker.java.basic.jar ./app.jar
CMD java ${JAVA_OPTS} -Xms${JVM_MIN_MEMORY} -Xmx${JVM_MAX_MEMORY} -jar app.jar
