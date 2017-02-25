FROM openjdk:latest
RUN mkdir /in-dir
ADD org.javacream.training.docker.jmx-1.0-SNAPSHOT.jar .
ADD libs/jolokia-jvm-1.3.5-agent.jar .
VOLUME /in-dir
EXPOSE 7777
ENTRYPOINT java -javaagent:jolokia-jvm-1.3.5-agent.jar=port=7777,host=0.0.0.0 -cp org.javacream.training.docker.jmx-1.0-SNAPSHOT.jar org.javacream.training.docker.jmx.FileTransferUtil
