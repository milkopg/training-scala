package com.milko.trainings.scala.interfaces.javac;

import java.util.ArrayList;
import java.util.List;


public interface Sortable<A extends Comparable<A>> extends Iterable<A>{
	default public List<A> sort() {
		List<A> list = new ArrayList<A>();
		for (A element: this) {
			list.add(element);
		}
		list.sort((first, second) -> first.compareTo(second));
		return list;
	}
}
