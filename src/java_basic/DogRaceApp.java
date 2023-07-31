package java_basic;

public class DogRaceApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("경주게임 시작합니다");
		Dog dog1 = new Dog("일번", 1);
		Dog dog2 = new Dog("이번", 2);
		Dog dog3 = new Dog("삼번", 3);
		System.out.println("발출!@!@");
		dog1.start();
		dog2.start();
		dog3.start();
		dog1.join();
		dog2.join();
		dog3.join();
		System.out.println("경주를 종료합니다");

	
	
	}

}
