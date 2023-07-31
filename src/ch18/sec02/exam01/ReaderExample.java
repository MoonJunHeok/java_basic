package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws IOException {

		Reader reader = null;

		// 1문자씩 읽기
		try {
			reader = new FileReader("C:/Temp/test.txt");
			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
			reader.close();
			System.out.println();

			// 문자 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			while (true) {
				int num = reader.read(data); //읽은 문자 수는 배열에 저장, 읽은 문자수는 리턴
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) { //실제 읽은 값을 위해 num으로
					System.out.println(data[i]); 
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}