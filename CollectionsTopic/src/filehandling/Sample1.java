package filehandling;

import java.io.File;

public class Sample1 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\shahak\\Desktop\\FileHandle");
		if(f1.mkdirs())
		{
			System.out.println("Folder created........");
		}
		else{
			System.out.println("Folder not created........");
		}
		if(f1.exists())
		{
			System.out.println("Folder exists........");
		}
		else
		{
			System.out.println("Folder does not exists........");
		}
		if(f1.delete())
		{
			System.out.println("Folder deleted........");
		}
		else
		{
			System.out.println("Folder not deleted........");
		}
	}
}
