package org.javacream.training.docker.volumes;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FileTransferUtil {

	public static void main(String[] args) {
		new FileTransferUtil();
	}

	{
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				File file = new File("/in-dir");
				String[] fileNames = file.list();
				System.out.println("IN-DIR: " + Arrays.asList(fileNames));
				File[] files = file.listFiles();
				for (File f : files) {
					f.delete();
				}
			}

		}, 0, 5, TimeUnit.SECONDS);
	}

}
