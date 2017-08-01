FROM openjdk:8u141-jdk
ENV JAVA_MEMORY 256M
ENV JAVA_GC_LOGFILE /java/log/gc.log
ENV JAVA_OPTS ""
VOLUME /java/log
ENTRYPOINT java -Xmx${JAVA_MEMORY} -Xms${JAVA_MEMORY} -Xloggc:${JAVA_GC_LOGFILE} ${JAVA_OPTS}-jar /java/lib/app.jar
