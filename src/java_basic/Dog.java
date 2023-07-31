package java_basic;

public class Dog extends Thread{

	private int number;
	public Dog() {
		this("안녕", 0);
	}

	public Dog(String name , int number) {
		super(name);
		this.number = number;
	}
	
	public void race() {
		System.out.println("=========="+ getName() + "강아지 출발 =========");
		for (int i = 0; i < 100; i++) {
			int delayTime = (int)(Math.random()*12);
			System.out.println(getName() +"강아지"+ i +"미터 전진!!!");
			try {
				sleep(delayTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}System.out.println("========"+ getName() + "강아지 결승점 통과 ========");
		
		
		
		
		
	}
	@Override
	public void run() {
		race();
	}
	
	
}
