package org.javacream.training.docker.webapp;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld")
public class HelloWorldWebBean {
	private String name;

	public String sayHello() {
		if (name != null && !name.trim().equals("")) {
			return "Hello, " + name + "!";
		} else {
			return null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
