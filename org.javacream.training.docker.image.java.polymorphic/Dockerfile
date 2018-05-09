FROM javacream/basejava:1.1
VOLUME ${JAVA_LIB_DIR}
ENV JAVA_DEBUG_PORT 8888
ENV JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,address=${JAVA_DEBUG_PORT},suspend=n
EXPOSE ${JAVA_DEBUG_PORT}