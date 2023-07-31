/*
 * Continue 이동문
 */
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println("출력 = " + i);
		}

//	1부터 100까지 홀수만 출력 하시오.. 3개 모두 같은 결과값.

		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}

	}

}
