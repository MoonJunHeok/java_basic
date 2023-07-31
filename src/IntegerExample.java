class IntegerExample {
	public static void main(String[] args) {
		// 정수의 표기
		int num = 128; //10진수 표기
		int num2 = 0b0101; // 2진수 표기
		int num3 = 007;  // 8진수표기
		int num4 = 0x10AB;


		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		long balance = 11111111111L; //정수 리터럴은 기본적으로 int로 인식. long은 데이터에 알려주는 의미로 맨 뒤에 L을 적어준다.
		byte x = -128;
		byte y = 127; //byte는 127까지
		
		//실수 표현
		float pi = 3.14F;
		double pi2 = 3.1434567891011125489489489;
		System.out.println(pi2);


	}
}
