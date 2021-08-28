package chapter5.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class ObjectStackCopy<T> {
	private List<T> elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public ObjectStackCopy() {
		elements = new ArrayList<T>();
	}

	public void push(T e) {
		elements.add(e);
	}

	public Object pop() {
		if(elements.isEmpty())
			throw new EmptyStackException();
		return elements.remove(elements.size()-1);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}
}
