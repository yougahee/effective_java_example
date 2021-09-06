package chapter5.varargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsTest {
	@SafeVarargs
	static <T> List<T> flatten(List<? extends T>... lists) {
		List<T> result = new ArrayList<>();
		for(List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

	static <T> List<T> flatten2(List<List<? extends T>> lists) {
		List<T> result = new ArrayList<>();
		for(List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

}
