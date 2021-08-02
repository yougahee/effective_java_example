/*
package chapter2;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{
	private static final Cleaner cleaner = Cleaner.create();

	public Room(State state, Cleaner.Cleanable cleanable) {
		this.state = state;
		this.cleanable = cleanable;
	}

	private static class State implements Runnable {
		int numJunkPiles;

		State(int numJunkPiles) {
			this.numJunkPiles = numJunkPiles;
		}

		//close 메서드나 cleaner 호출
		@Override
		public void run() {
			System.out.println("방 청소");
			numJunkPiles = 0;
		}
	}

	private final State state;
	private final Cleaner.Cleanable cleanable;

	public Room(int numJunkPiles) {
		state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	@Override
	public void close() throws Exception {
		cleanable.clean();
	}
}
*/
