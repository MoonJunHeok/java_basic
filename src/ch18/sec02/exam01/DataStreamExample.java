package ch18.sec02.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExample {

	public static void main(String[] args) throws Exception {

		// DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream("C://Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);

		// 기본타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();
		dos.close();

		// DataInputStream 생성
		FileInputStream fis = new FileInputStream("C://Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);

		// 기본 타입 입력
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF(); // 출력때와 순서를 동일하게 입력
			double score = dis.readDouble();
			int rank = dis.readInt();

			System.out.println(name + " : " + score + " : " + rank);
		}
		dis.close();
	}

}
