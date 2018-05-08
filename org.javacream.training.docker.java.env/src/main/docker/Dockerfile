FROM openjdk:latest
ENV loops="5"
ADD org.javacream.training.docker.env-1.0-SNAPSHOT.jar .
ENTRYPOINT java -Dloops=$loops -cp org.javacream.training.docker.env-1.0-SNAPSHOT.jar org.javacream.training.docker.env.Loop
