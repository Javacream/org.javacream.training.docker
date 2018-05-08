FROM openjdk:8
ENV JAVA_MAX_MEMORY 256M
ENV JAVA_INITIAL_MEMORY 256M
ENV JAVA_NEW_MEMORY 128M
ADD org.javacream.training.docker.basic-1.0-SNAPSHOT.jar ./app.jar
ENTRYPOINT java -Xmx${JAVA_MAX_MEMORY} -Xmn${JAVA_NEW_MEMORY} -Xms${JAVA_INITIAL_MEMORY} -cp app.jar org.javacream.training.docker.SimpleApp 
