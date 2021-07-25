package chapter3.equals;

public class PhoneNumber {
	private final short areaCode, prefix, lineNum;
	private int hashCode;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "지역코드");
		this.prefix = rangeCheck(prefix, 999, "프리픽스");
		this.lineNum = rangeCheck(lineNum, 999, "가입자 번호");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if(val < 0 || val > max)
			throw new IllegalArgumentException(arg + ": " + val);
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(!(o instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) o;
		return pn.lineNum == lineNum && pn.prefix == prefix &&
				pn.areaCode == areaCode;
	}

	/*@Override
	public int hashCode() {
		int result = Short.hashCode(areaCode);
		result = 31 * result + Short.hashCode(lineNum);
		result = 31 * result + Short.hashCode(prefix);
		return result;
	}*/

	// 지연 초기화하는 hashCode 메서드
	@Override
	public int hashCode() {
		int result = hashCode;
		if(result == 0) {
			result = Short.hashCode(areaCode);
			result = 31 * result + Short.hashCode(lineNum);
			result = 31 * result + Short.hashCode(prefix);
			return result;
		}
		return result;
	}

	@Override
	public PhoneNumber clone() {
		try {
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			//일어날 수 없는 일이다.
			throw new AssertionError();
		}
	}
}
