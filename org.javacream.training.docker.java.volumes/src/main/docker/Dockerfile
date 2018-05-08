FROM openjdk:latest
RUN mkdir /in-dir
ADD org.javacream.training.docker.volumes-1.0-SNAPSHOT.jar .
VOLUME /in-dir
ENTRYPOINT java -cp org.javacream.training.docker.volumes-1.0-SNAPSHOT.jar org.javacream.training.docker.volumes.FileTransferUtil
