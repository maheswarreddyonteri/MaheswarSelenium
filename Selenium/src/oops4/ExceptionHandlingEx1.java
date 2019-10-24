package oops4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fl = null;
		
		boolean btag = false;
		try {
			File file = new File("C:\\Users\\Premaltha Reddy\\Documents\\Family.txt");
			fl = new FileReader(file);
			btag= true;
			char[] arr= new char[50];
			fl.read(arr);
			
			for(int i=0;i<50;i++)
			{
				System.out.print(arr[i]);
			}
	
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found in given path");
		}
		catch(IOException ex) {
			System.out.println("unable to rread/write content in text file");
		}
		catch(Exception f) {
			f.printStackTrace();
		}
		finally {
			if(btag)
			{
				fl.close();
			}
		}
	}
}
