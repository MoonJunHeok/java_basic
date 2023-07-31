/*
 * 메소드 (함수) 정의 및 사용
 */
public class MethodExample {

	/*
	 * 구구단을 출력하는 메소드 정의
	 */

	static void printGugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	/*
	 * 단을 입력 받아 해당 단을 출력하는 기능
	 */
	static void printDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
		}
		System.out.println();
	}

	/*
	 * 두개의 정수를 전달 받아 해당 정수의 합을 반환하는 기능 만들기.
	 */
	static int sum(int x, int y) {
		// return; 은 그냥 괄호 밖으로 나감
		return x + y; // 끝내면서 결과값이 호출하는 쪽으로 반환됨
	}

	public static void main(String[] args) {
		System.out.println("구구단 출력하기");
		// 구구단 출력 메소드 호출하기(사용)
		printGugudan();
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		printGugudan();
//		5단 출력
		printDan(5); // 5 를 전달인자(Argument) 라고 한다.
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>");

		printDan(7);

		int x = 500, y = 4545454; // 지역변수로 만든 메소드와는 무관
		int result = sum(x, y); // 내 구역 안의 지역변수로 이동
		System.out.println(result); // 결과를 받아서 출력

		System.out.println(sum(5, 10));

	}

}
