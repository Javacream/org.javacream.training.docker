package org.javacream.training.docker.env;

public class Loop {

	
	public static void main(String[] args) {
		int loops = Integer.parseInt(System.getProperty("loops", "10"));
		for (int i = 0; i < loops; i++){
			System.out.println(i);
		}
	}
}
