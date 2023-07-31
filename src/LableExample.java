/*
 * Lable
 */
public class LableExample {

	public static void main(String[] args) {  
//		레이블 선언(모두 대문자로)
		OUT:  // 레이블이 없다면 break 이후 다시 i쪽으로 돌아감
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "," + j);
				if (j == 5) {
					break OUT;  //레이블 사용으로 for문 완전 밖으로.
				}
			}
		}


		
		
		
	}

}
