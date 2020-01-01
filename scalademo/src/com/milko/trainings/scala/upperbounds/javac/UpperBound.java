package com.milko.trainings.scala.upperbounds.javac;

import java.util.List;

public class UpperBound {
	void printAnimals(List<? extends Animal> animals ) {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}
}
