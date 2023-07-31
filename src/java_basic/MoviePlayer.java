package java_basic;

public class MoviePlayer implements Runnable{
	
	public void play() throws InterruptedException {
		while(true) {
		 Thread.sleep(3000);
			System.out.println("영화가 재생중입ㄴ디ㅏ...");
		}
	}
	public void run() {
		try {
			play();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
