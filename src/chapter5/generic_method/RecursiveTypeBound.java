package chapter5.generic_method;

import java.util.Collection;
import java.util.Objects;

public class RecursiveTypeBound {
	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if (c.isEmpty())
			throw new IllegalArgumentException("컬렉션이 비어있습니다.");

		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);

		return result;
	}
}
