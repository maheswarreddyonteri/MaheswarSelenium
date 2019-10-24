package Filesystem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWrite {

	public static void main(String[] args) throws Exception {
		
/*
		File file=new File("C:\\Users\\Premaltha Reddy\\Documents\\Family.txt");
		FileWriter fw=new FileWriter(file);
	     	fw.write("testing maters"+"\n");
	     	fw.write(" maheswar reddy");
	     	fw.close();
	     	*/
	    	File file=new File("C:\\Users\\Premaltha Reddy\\Documents\\Family.txt");
			FileReader fr=new FileReader(file);
			char[] arr = new char[50];
			fr.read(arr);
			fr.close();
			for(char c: arr) {
				System.out.print(c);
			}
				

	}

}
