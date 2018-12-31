package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample6 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\shahak\\Desktop\\xyz.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.write("Hi");
		bw.flush();
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		while(s1!=null)
		{
			System.out.println(s1);
			s1 = br.readLine();
		}
	}

}
