package Collections;

import java.util.*;

public class HashmapEx {

	public static void main(String[] args) {
		
		HashMap<String,String> maheswar = new HashMap<String,String>();
		
		maheswar.put("age", "23");
		maheswar.put("gender", "male");
		maheswar.put("village", "aramadaka");
		maheswar.put("father", "manohar");
		maheswar.put("mother", "anasuya");
		
		System.out.println(maheswar.get("age"));
		
		Set<String> allkeys = maheswar.keySet();
		for(String keyname:allkeys)
		{
			System.out.println(keyname+"  "+maheswar.get(keyname));
		}

	}

}
