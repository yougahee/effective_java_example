package chapter5;

import java.util.ArrayList;
import java.util.List;

public class ArrayRatherThanList {
	public static void main(String[] args) {
		//런타임에서 Error
		Object[] objectArray = new Long[1];
		objectArray[0] = "타입이 달라 넣을 수 없습니다.";

		//컴파일 자체가 되지 않음.
		//List<Object> ol = new ArrayList<Long>();
		//ol.add("타입이 달라 넣을 수 없다.");


		//제네릭 배열 생성 -> 허용X
		//List<String>[] stringLists = new List<String>;

	}
}
