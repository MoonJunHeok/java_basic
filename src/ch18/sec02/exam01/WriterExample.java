package ch18.sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("C:/Temp/test.txt");
		try {
			// 문자 기반 스트림 생성

			// 1문자씩 출력
			char a = 'A';
			char b = 'B';
			writer.write(a);
			writer.write(b);

			// char배열 출력
			char[] arr = { 'C', 'D', 'E' };
			writer.write(arr, 0, arr.length); // writer.write(arr); 과 같은 뜻

			// 문자열 출력
			writer.write("FGH");

			// 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();

		}

	}

}
