/*
 * 자바에서 지원하는 연산자들
 */
public class OperatorExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
//		산술연산자
		System.out.println("합 = " + (x + y));   // 우선순위 안넣으면 합305
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); // 나머지 연산자..
		
//		+ 연산자 오버로딩(중복정의)
		System.out.println(10 + 50);             // 연산
		System.out.println("김기정" + "바보");   // 연결
		System.out.println(10 + 30 + "바보");    // 형 변환
		System.out.println("바보" + 30 + 10);    // 형 변환 두번
		System.out.println("바보" + (30 + 10));  // 우선순위 연산자
		
//		복합대입 연산자( +=, -=, *=, /=, %=
//		x = x + 5;  풀어쓴것
		x += 5;   //축약     x에 +5를 해서 x에 대입 하라는 뜻 
		x -= 5;
        System.out.println(x);
       
        
       x = 10;
       y = 5;
//     비교연산자(==, !=, >, >=,....
       System.out.println(x == y);
       System.out.println(x != y);
       System.out.println(x > y);
       System.out.println(x >= y);
       
//     증감연산자 (++, --
//       x = x +1;  아래 3개 모두 같은 뜻
//       x += 1;
       x++;
       System.out.println(x);
       x--;
       System.out.println(x);
       
      x = 10;
//    System.out.println(x++);    //++ 전에 실행이 된것
      System.out.println(++x);    //x값을 먼저 증가 후 출력
      
      x = 30;
      y = 50;   //값을 수정할때는 한개씩
      
     
      System.out.println(x >=30 && y <=50);
      System.out.println(x < 30 && y <=50);
      System.out.println(x < 30 || y <=50);  //2개중 1개가 true면 true로 출력
      System.out.println(!true);
      
//      조건 삼항 연산자
      int score = 55;
      String result = score >=60 ? "통과" : "실패" ;
      System.out.println(result);
      
      
//      기본 데이터 타입 형 변환
//      자동 형 변환(promotion - Up Casting)
        double some = 50;
        
//     강제 형변환(Demotion - Down Casting)
       double avg = 85.34567; 
       System.out.println(avg);
       System.out.println((int)avg); //화면에 출력 시 double 형을 int 형으로 출력
       
       int avg2 = (int)avg; 
       System.out.println(avg2);
      
      
      
      
      
      
      
      
     
      
	}

}
