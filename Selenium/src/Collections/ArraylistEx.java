package Collections;

import java.util.*;

public class ArraylistEx {

	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		     list.add("maheswar");
		     list.add("balu");
		     list.add("maheswar");
		     list.add("balu");
		     list.add("AMPS");
		     list.add("maheswar");
		     list.add("AMPS");
		     Iterator irt = list.iterator();
		     
		     while(irt.hasNext()) {
		    	 System.out.println(irt.next());
		     }
	}

}
