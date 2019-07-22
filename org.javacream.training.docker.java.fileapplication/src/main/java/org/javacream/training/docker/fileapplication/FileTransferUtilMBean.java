package org.javacream.training.docker.fileapplication;

public interface FileTransferUtilMBean {

	int getIterations();
	int getFilesDeleted();
	void reset();
}
