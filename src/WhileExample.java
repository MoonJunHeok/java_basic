/*
 * 반복문 While 문
 */
public class WhileExample {


	public static void main(String[] args) {
		int index = 0;
		while (index < 10) {    //  <= 100 하면 101번 찍힘
			System.out.println("김기정 바보!!");
			index++;
		}
		 
		
		int oddSum = 0, evenSum = 0;    //초기화를 시켜놓음
		index =1;
		while (index <= 10) {			 
			if((index % 2) == 0) {
				evenSum += index;
			}else {
				oddSum += index;
			}
			index++;
		}
		 System.out.println("누적합 : " + (oddSum + evenSum));
		 System.out.println("홀수합 : " + oddSum);
		 System.out.println("짝수합 : " + evenSum);
		

		/*int result = 0;    //초기화를 시켜놓음
		index =1;
		while (index <= 100) {
//			result = result + index;
			result += index;
			index++;
		}
            System.out.println("누적합 : " + result);*/
	
     
	   index = 0;
	   do {
		System.out.println("풀스택 웹 개발자 과정 화이팅!!");
		index++;
	   } while (index < 10);
	   
     
     
	   
	   
	   
   }
}
