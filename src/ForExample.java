/*
 *  fod 반복문
 */
public class ForExample {

	public static void main(String[] args) {
		for (int index = 0; index < 100; index++) { // while문을 쉽게 사용
			System.out.println("김기정 바보");
		}
//		System.out.println(index); 변수스코프때문에 index는 위에서만 적용
//      아래에도 인덱스를 출력하고싶으면 for문 위에 int index; 선언해야 함.		

		int result = 0; // result를 for 안에 선언하면 초기화되서 위로
		for (int index = 1; index <= 100; index++) {
			result += index;
		}
		System.out.println(result);

//		중첩 For 문을 이용한 사각형 출력
		for (int i = 0; i < 5; i++) { // 행 반복
			for (int j = 0; j < 5; j++) { // 열 반복
				System.out.print('*');

			}
			System.out.println(); // 아무것도 집어넣지 않으면 라인만 바뀜

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}



		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
//		중첩 for 문을 활용한 구구단 출력
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t" );
			}
			System.out.println();
		}
	}

}
