package java_basic;

public class TreadExample {
	public void musicPlay() {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.start();

		Thread moviePlayer = new Thread(new MoviePlayer());
		moviePlayer.start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {
					System.out.println("i의 값은? : " + i);
				}
			}
		}).start();

	}

	public static void main(String[] args) {
		Thread current = Thread.currentThread();
		System.out.println(current);
		System.out.println(current.getName());
		TreadExample t = new TreadExample();
		t.musicPlay();

	}
}
