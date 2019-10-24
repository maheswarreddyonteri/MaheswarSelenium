package wrapperclass;

public class myclass {

	
	 static	int getIntLenth(int val) {
			Integer b = val;
			String s=b.toString();
			int n = s.length();
			return n;
			
		}
		public static void main(String[] args) {
			
	       int len=  getIntLenth(243);
			System.out.println(len);

	}

}
