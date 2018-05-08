package org.javacream.training.docker.jmx;

public interface FileTransferUtilMBean {

	int getIterations();
	int getFilesDeleted();
	void reset();
}
