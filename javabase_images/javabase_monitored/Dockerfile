FROM 10.8.1.41:8083/javacream/javabase@sha256:0cf8435de591133429f2d3c089b22a70930a2433203f4731b5c72987ee830cf7
ADD jolokia-jvm-1.3.7-agent.jar ./jolokia-agent.jar
ENV JAVA_OPTS ${JAVA_OPTS} -javaagent:jolokia-agent.jar=port=7654,host=0.0.0.0
EXPOSE 7654
