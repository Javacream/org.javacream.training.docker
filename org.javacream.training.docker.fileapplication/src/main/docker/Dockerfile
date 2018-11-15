FROM javacream/javabase:1.0
ADD org.javacream.training.docker.java.jmx-1.0-SNAPSHOT.jar ${JAVA_LIB_DIR}/app.jar
ENV JAVA_MAIN_CLASS org.javacream.training.docker.jmx.FileTransferUtil
VOLUME /in-dir