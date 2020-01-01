package com.milko.trainings.scala.singleton;

import java.util.logging.Level;

public class LoggerJava {

	private static final LoggerJava INSTANCE = new LoggerJava();
	
	private LoggerJava() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static LoggerJava getLogger() {
		return INSTANCE;
	}
	
	public  static void log(Level level, String string) {
		System.out.printf ("%s %s%n", level, string);
	}
	public static void main(String[] args) {
		LoggerJava.getLogger().log(Level.INFO, "Everything is fine");
	}

}
