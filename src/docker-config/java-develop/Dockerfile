FROM javacream/java-monitored:1.0
ENV JAVA_OPTS ${JAVA_OPTS} -agentlib:jdwp=transport=dt_socket,server=y,address=8888,suspend=n
EXPOSE 8888
VOLUME ${JAVA_LIB_DIR}