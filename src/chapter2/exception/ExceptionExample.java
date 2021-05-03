package chapter2.exception;

import java.time.LocalTime;
import java.util.concurrent.*;

public class ExceptionExample {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		
		Future<Integer> future = exec.submit(() -> {
			System.out.println(LocalTime.now() + " Starting runnable");
			int sum = 1 + 1;
			Thread.sleep(800);
			return sum;
		});
		int numColors = 4;
		try {
			numColors = future.get(1L, TimeUnit.SECONDS);
			System.out.println(LocalTime.now() + " get Result");
			System.out.println(numColors);
		} catch (TimeoutException | ExecutionException | InterruptedException ignored) {
			// 기본값을 사용한다( 색상 수를 최소화하면 좋지만, 필수는 아니다. )
			System.out.println(LocalTime.now() + " " + numColors + " time out or excution exception" );
		}
	}
}
