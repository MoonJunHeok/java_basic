/*
 * 조건(분기)문 if
 */
public class IFExample {

	public static void main(String[] args) {
		int score = 88;
//		단순 if문     true일때만 출력  실행하고자 하는게 1줄이면 중괄호 생략 가능
		if(score >= 60) 	
		System.out.println("참 잘했어요.."); //한줄이든 여러줄이든 중괄호 넣는게 가독성에 유리.
		System.out.println("참 잘했어요.."); //이건 그냥 참 잘했어요를 출력한것 
		
//     if ~ else ~
	   if (score >= 60) {
		System.out.println("합격");
	} else {
		System.out.println("불합격");
	}
	   String result = score >= 60 ? "합격" : "불합격" ;
	   System.out.println(result);
	   
//	   테스트
	   int num = 56;
	   if ((num % 2) == 0) {
		 System.out.println("짝수");
	}else {
		System.out.println("홀수");
	}
	   
//	   다중 if문
	   if (score >= 90) {
		 System.out.println("수");
	} else if(score >=80){
		System.out.println("우");
	} else if(score >=70){
		System.out.println("미");
	} else if(score >=60){
		 System.out.println("양");	 
	} else {
	   System.out.println("가");
	 }

	 
	   
	   
	   
	   
	   
	   
}
}
