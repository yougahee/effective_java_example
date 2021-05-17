package chapter5;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		//런타임시 ERROR
		Object[] objectArray = new Long[1];
		objectArray[0] = "타입이 다름";

		// 호환되지 않는 타입
		//List<Object> ol = new ArrayList<Long>();
		//ol.add("타입이 달라서 넣을 수 없음");
	}

}
