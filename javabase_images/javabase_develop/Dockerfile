FROM javacream/javabase_monitored:1.0
ENV JAVA_OPTS ${JAVA_OPTS} -agentlib:jdwp=transport=dt_socket,server=y,address=4567,suspend=n
EXPOSE 4567
VOLUME lib
