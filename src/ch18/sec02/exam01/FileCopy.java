package ch18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		String originalFileName = "C:/Temp/test1.jpg";
		String targetFileName = "C:/Temp/test3.jpg";

		try {
			InputStream is = new FileInputStream(originalFileName);
			OutputStream os = new FileOutputStream(targetFileName);

			byte[] data = new byte[1024];
			while (true) {
				int num = is.read(data);
				if (num == -1)
					break;
				os.write(data, 0, num);
			}

			os.flush();
			os.close();
			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}
