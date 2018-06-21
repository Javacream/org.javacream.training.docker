FROM javacream/javabase:1.0
ENV JAVA_DEBUG_PORT 8888
ENV JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,address=${JAVA_DEBUG_PORT},suspend=n
EXPOSE ${JAVA_DEBUG_PORT}
RUN ls /java/lib