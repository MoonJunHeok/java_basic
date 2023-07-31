package java_basic;

public class MusicPlayer extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("음악을 재생합니다...: ");
		}
	}
}
