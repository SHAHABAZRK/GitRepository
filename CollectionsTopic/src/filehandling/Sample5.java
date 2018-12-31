package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\shahak\\Desktop\\AMZ.PNG");
		FileInputStream fin = new FileInputStream(f1);
		byte[] arr = new byte[(int)f1.length()];
		fin.read(arr);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\shahak\\Desktop\\AMZ123.PNG");
		fout.write(arr);
		fout.flush();
		System.out.println("Copied the images.......");
	}

}
