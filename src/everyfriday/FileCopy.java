package everyfriday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data = fis.read())!= -1) {
				fos.write(data);
				
			}
			
			fis.close();
			fos.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
