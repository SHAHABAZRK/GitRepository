package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\shahak\\Desktop\\abc.txt");
		
		FileWriter fw = new FileWriter(f1);
		fw.write("Hiiiiiiii\n");
		fw.write("Hello");
		fw.flush();
		System.out.println("written........");
	}

}
