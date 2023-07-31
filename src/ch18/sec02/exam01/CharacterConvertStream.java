package ch18.sec02.exam01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStream {

	public static void main(String[] args) {

		try {
			write("문자 변환 스트림을 사용합니다");
			String str = read();
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("C://Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}

	
	public static String read() throws IOException{
//		InputStream is = new FileInputStream("C:/Temp/test.txt");
//		Reader reader = new InputStreamReader(is, "UTF-8");
//		char[] data = new char[50]; // data 는 50바이트까지 쭉 읽어온다.
//		int num = reader.read(data); // 실제 읽어온 데이터를 활용하기 위함.
//		reader.close(); 
//		String str = new String(data, 0, num);
//		return str;
		
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine();
		return str;
	}
}
