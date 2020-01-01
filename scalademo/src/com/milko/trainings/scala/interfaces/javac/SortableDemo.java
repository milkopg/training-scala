package com.milko.trainings.scala.interfaces.javac;

import java.util.Arrays;
import java.util.Iterator;

public class SortableDemo {
	
	private static class NumberList implements Sortable<Integer> {

		private Integer [] numbers;
		
		private  NumberList(Integer ... numbers) {
			this.numbers = numbers;
		}
		
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return Arrays.asList(numbers).iterator();
		}
		
	}

	public static void main(String[] args) {
		Sortable<Integer> numbers = new NumberList(1, 34, 65, 23, 0, -1, 45, 67);
		System.out.println(numbers.sort());

	}

}
