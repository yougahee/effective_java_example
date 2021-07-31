package chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Method {
	private static final String[] PRIVATE_VALUE = {};
	// 방법 1
	public static final List<String> VALUES =
			Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUE));

	// 방법 2
	public static final String[] values() {
		return PRIVATE_VALUE.clone();
	}
}
