FROM openjdk:8u141-jdk
ADD jolokia-jvm-1.3.7-agent.jar jolokia-agent.jar
ENV JAVA_MEMORY 256M
ENV JAVA_GC_LOGFILE /java/log/gc.log
ENV JAVA_OPTS ""
ENV JOLOKIA_PORT 7777
VOLUME /java/log
EXPOSE ${JOLOKIA_PORT} 
ENTRYPOINT java -javaagent:jolokia-agent.jar=port=${JOLOKIA_PORT},host=0.0.0.0 -Xmx${JAVA_MEMORY} -Xms${JAVA_MEMORY} -Xloggc:${JAVA_GC_LOGFILE} ${JAVA_OPTS}-jar /java/lib/app.jar
