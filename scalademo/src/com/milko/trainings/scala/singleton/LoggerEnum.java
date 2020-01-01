package com.milko.trainings.scala.singleton;

import java.util.logging.Level;

public enum LoggerEnum {
	LOGGER;
	
	public void log(Level level, String string) {
		System.out.printf("%s %s%n", level, string);
	}
	
	public static void main(String[] args) {
		LOGGER.log(Level.INFO, "An alternative example");
	}
}
