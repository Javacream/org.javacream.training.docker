package org.javacream.training.docker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class SimpleApp {

	public static void main(String[] args) {
		new SimpleApp();
	}

	{
		System.out.println("Hello Docker from Java!");
		checkScheduling();
		checkFileIo();
		checkUrl();
		checkUi();
	}

	private void checkUi() {
		try {
			JOptionPane.showMessageDialog(null, "Hello UI!");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
			}

		}, 0, 5, TimeUnit.SECONDS);
	}

}
