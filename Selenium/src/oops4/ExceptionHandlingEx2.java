package oops4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingEx2 {
	
	static void readtext()throws IOException, InterruptedException{
		
		File file = new File("C:\\Users\\Premaltha Reddy\\Documents\\Family.txt");
		FileReader fl = new FileReader(file);
		char[] arr= new char[50];
		fl.read(arr);
		Thread.sleep(5000);
		for(int i=0;i<50;i++)
		{
			System.out.print(arr[i]);
			
		}
	}
	
	public static void main(String[] args) {
		try {
			readtext();
		}
		catch(IOException e) {
			System.out.println("either file not found or unable to open the file");
		}
		catch(InterruptedException f) {
			System.out.println("Exception is in sleep mode");
		}
	}
		
	}


