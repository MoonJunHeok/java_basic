package ch18.sec02.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) {

		try {
			//버퍼가 없는 스트림 생성
			String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath(); // 상대경로와 절대경로 반환
			String targetFilePath1 = "C://Temp/targetFile1.jpg";

			FileInputStream fis1 = new FileInputStream(originalFilePath1);
			FileOutputStream fos1 = new FileOutputStream(targetFilePath1);
			
			//버퍼가 있는 스트림 생성
			String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath(); 
			String targetFilePath2 = "C://Temp/targetFile2.jpg";

			FileInputStream fis2 = new FileInputStream(originalFilePath2);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);

			long nonBufferTime = copy(fis1, fos1);
			System.out.println("버퍼 미사용: " + nonBufferTime + "ns");
			long bufferTime = copy(bis, bos);
			System.out.println("버퍼 사용: " + bufferTime + "ns");
			
			fis1.close();
			fos1.close();
			bis.close();   // 보조스트림이 닫히면 연결된 스트림도 자동으로 닫힌다.
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작과 끝 시간 측정

		while (true) { // 걸리는 시간 측정을 위해 일부러 느리게 복사
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}

		os.close();

		long end = System.nanoTime(); // 시작과 끝 시간 측정
		return (end - start);

	}

}
