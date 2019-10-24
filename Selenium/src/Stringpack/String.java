package Stringpack;

public class String {

	public static void main(java.lang.String[] args) {
		
    /*	java.lang.String name = "testing";
		
		System.out.println(name.concat(" masters"));
		
		System.out.println(name);  */
		
	/*	StringBuffer name1 = new StringBuffer("testing");
		
		System.out.println(name1.append("  masters"));
	System.out.println(name1);     */
		
		StringBuffer name2 = new StringBuffer("testing masters");
		
		System.out.println(name2.charAt(0));
		System.out.println(name2.capacity());
		System.out.println(name2.codePointAt(0));
		//System.out.println(name2.deleteCharAt(3));
		System.out.println(name2.lastIndexOf("g"));
		System.out.println(name2.indexOf("e"));
		System.out.println(name2.toString());
		System.out.println(name2.replace(7, 8, "  Balu  "));
		System.out.println(name2.reverse());
	}
	
}
