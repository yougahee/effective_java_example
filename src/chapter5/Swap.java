package chapter5;

import java.util.List;

public class Swap {
	public static <E> void swap1(List<E> list, int i, int j){

	}

	public static void swap2(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}

	public static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
}
