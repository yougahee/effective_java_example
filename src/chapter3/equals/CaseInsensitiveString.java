package chapter3.equals;

import java.lang.annotation.Documented;
import java.util.Objects;

public class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		this.s = Objects.requireNonNull(s);
	}

	// 대칭성 위배
	/*@Override
	public boolean equals(Object o) {
		if( o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(
					((CaseInsensitiveString) o).s);

		if (o instanceof String)
			return s.equalsIgnoreCase((String) o);
		return false;
	}*/

	// 정상적인 코드
	@Override
	public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString &&
				((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
	}
}
