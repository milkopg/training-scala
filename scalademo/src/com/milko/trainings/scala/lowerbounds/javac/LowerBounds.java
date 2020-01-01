package com.milko.trainings.scala.lowerbounds.javac;

import java.util.List;

public class LowerBounds {
	void addNumbers(List<? super Integer> numbers) {
		for (int i=0; i< 100; i++) {
			numbers.add(i);
		}
	}
}
