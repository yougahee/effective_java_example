package chapter2.singleton;

//public static final 필드 방식의 싱글턴
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();
	private Elvis() {}

	public void leaveTheBuilding() {}

	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		Elvis2 el = Elvis2.getInstance();
	}
}

//정적 팩터리 방식의 싱글턴
class Elvis2 {
	private static final Elvis2 INSTANCE = new Elvis2();
	private Elvis2() {}
	public static Elvis2 getInstance() { return INSTANCE; }

	public void leaveTheBuilding() {}
}

