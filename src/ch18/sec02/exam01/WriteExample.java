package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("C://Temp/test1.db", true);
		try {
			//생성자 중 append를true로 하면 파일 뒤로 출력, false는 덮어쓴다.
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		
		System.out.println("저장성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			os.close();
//			안정적으로 close를 사용하기 위해서 finally 이용
		}
		
	}

}
