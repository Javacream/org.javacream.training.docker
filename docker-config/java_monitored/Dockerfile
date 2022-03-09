FROM javacream/javabase:1.0
ENV JAVA_OPTS ${JAVA_OPTS} "-javaagent:jolokia-agent.jar=port=${JAVA_JOLOKIA_PORT},host=0.0.0.0"
ADD jolokia-jvm-1.3.7-agent.jar ./jolokia-agent.jar
EXPOSE 7777