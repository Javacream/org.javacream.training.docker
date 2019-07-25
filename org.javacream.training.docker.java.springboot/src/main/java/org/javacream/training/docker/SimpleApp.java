package org.javacream.training.docker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class SimpleApp {

	@PostConstruct
	public void init() {
		System.out.println("Hello Docker from Java!");
		printMemory();
		checkScheduling();
		checkFileIo();
		checkUrl();
	}

	private void printMemory() {
		Runtime r = Runtime.getRuntime();
		System.out.println("****         MEMORY");
		System.out.println("Free Memory: " + r.freeMemory());
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Max Memory: " + r.maxMemory());
		System.out.println("****         MEMORY DONE");
	}

	private void checkUrl() {
		try {
			URL url = new URL("http://google.de");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			System.out.println(reader.readLine());
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void checkFileIo() {

		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(this.getClass().getResourceAsStream("/demo.txt")));
			System.out.println(reader.readLine());
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void checkScheduling() {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

			public void run() {
				System.out.println("Scheduled Message from Java at " + new Date());
				System.gc();
			}

		}, 0, 5, TimeUnit.SECONDS);
	}

}
