package com.milko.trainings.scala.generics.javac;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {

	private final List<T> elements = new ArrayList<>();
	
	@Override
	public void push(T t) {
		elements.add(0, t);
		
	}

	@Override
	public T pop() {
		if (elements.isEmpty())
			throw new IndexOutOfBoundsException();
		return elements.remove(0);
	}

	public static void main(String[] args) {
		Stack<String> stack = new ListStack();
		
		stack.push("C");
		stack.push("B");
		stack.push("A");
		
		//String element = stack.pop();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
	}
	
}
