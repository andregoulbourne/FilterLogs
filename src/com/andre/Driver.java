package com.andre;

import com.andre.dao.Filter;

public class Driver {
	
	private static final String INFO = "INFO";
	
	private static final String DEBUG = "DEBUG";
	
	private static final String ERROR = "ERROR";
	
	private static final String FILENAME = "log";
	
	public static void main(String[] args) {
		Filter.filterLog(FILENAME, INFO);
		Filter.filterLog(FILENAME, DEBUG);
		Filter.filterLog(FILENAME, ERROR);
	}

}
