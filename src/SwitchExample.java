/*
 * 조건(분기)문 switch
 */
public class SwitchExample {

// if문은 조건에 일치하면 괄호 바깥으로 이동하지만 switch문은 일치하는 값이 있어도
//	아래 값을 다 출력하기때문에 break 써줘야 함 break는 이동문 (괄호 바깥으로 이동하라는 뜻)
	
	public static void main(String[] args) {
	int num = 1;
	switch (num) {
		case 1: System.out.println("1입니다.."); break;
 		case 2: System.out.println("2입니다.."); break;
		case 3: System.out.println("3입니다.."); break;
		case 4: System.out.println("4입니다.."); break;
		case 5: System.out.println("5입니다.."); break;
		default: System.out.println("일치하는 값이 없습니다."); //일치하지않을때
	}
	 
     int score = 88; /*int 형 이라 나눈 값도 int 형으로 떨어짐*/
     switch (score/10) {
    case 10 : 
	case 9  : System.out.println("수"); break;
	case 8  : System.out.println("우"); break;
	case 7  : System.out.println("미"); break;
	case 6  : System.out.println("양"); break;
 	default: System.out.println("가"); break;
	}
     
     int x = 50, y = 30;
     char operator = '*';
     switch (operator) {
	case '+': System.out.println("덧셈 = " + (x + y)); break;
	case '-': System.out.println("뺄셈 = " + (x - y)); break;
	case '*': System.out.println("곱셈 = " + (x * y)); break;
	case '/': System.out.println("나눔 = " + (x / y)); break;
	}
     
     
     
     
   }
}
