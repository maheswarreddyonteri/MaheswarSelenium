package Collections;

import java.util.*;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet<String> setA=new HashSet<String>();
		 setA.add("maheswar");
		 setA.add("balu");
		 setA.add("maheswar");
		 setA.add("balu");
		 setA.add("AMPS");
		 setA.add("maheswar");
		 setA.add("AMPS");
	     Iterator irt = setA.iterator();
	     
	     while(irt.hasNext()) {
	    	 System.out.println(irt.next());
	     }

	}

}
