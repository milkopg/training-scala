package com.milko.trainings.scala.interfaces.javac;

import java.io.File;
import java.nio.CharBuffer;

public class FileReader implements Readable, AutoCloseable {
	
	private File file;
	
	public FileReader(File file) {
		this.file = file;
	}

	@Override
	public int read(CharBuffer buffer) {
		int read = 0;
		
		return 0;
	}

	@Override
	public void close() throws Exception {
		//close
		
	}

}
