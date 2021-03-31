FROM openjdk:8-alpine
ENV JVM_MAX_MEMORY 256M
ENV JVM_MIN_MEMORY 256M
ENV JAVA_OPTS ""
CMD ["sh", "-c", "java -Xms${JVM_MIN_MEMORY} -Xmx${JVM_MAX_MEMORY} -jar /lib/app.jar"]
