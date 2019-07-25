package org.javacream.util.web;

import java.io.Serializable;
import java.util.Date;

public class ServerTime implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	
	{
		date = new Date();
	}
	
	public String getDate(){
		return date.toString();
	}
}
