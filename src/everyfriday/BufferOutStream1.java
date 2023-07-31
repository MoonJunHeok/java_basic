package everyfriday;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutStream1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			for(int i = 1; i<=9; i++) {
				bos.write(Integer.toString(i).getBytes());
			}
			
			bos.flush();
			bos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
