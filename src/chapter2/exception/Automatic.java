package chapter2.exception;

import java.util.EmptyStackException;

public class Automatic {
	int size = 100;
	Integer[] elements = new Integer[size];


	public Object pop() {
		if(size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}
}
