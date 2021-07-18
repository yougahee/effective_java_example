package chapter2.singleton;

import java.util.function.Supplier;

//public static final 필드 방식의 싱글턴
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();
	private Elvis() {}

	public void leaveTheBuilding() {}

	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;

		Supplier<Elvis2> elvis2Supplier = Elvis2::getInstance;
	}
}

//정적 팩터리 방식의 싱글턴
class Elvis2 {
	private static final Elvis2 INSTANCE = new Elvis2();
	private Elvis2() {}
	public static Elvis2 getInstance() { return INSTANCE; }

	public void leaveTheBuilding() {}
}

//enum 타입 방식의 싱글턴 - 바람직한 방법
enum Elvis3 {
	INSTANCE;
	public void leaveTheBuilding() {}
}
