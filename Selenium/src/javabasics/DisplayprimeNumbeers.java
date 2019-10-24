package javabasics;

public class DisplayprimeNumbeers {

	public static void main(String[] args) {
	
		
	  	for(int n=1;n<=100;n++)
	  	{	
		   int   Counter=0;
		    	
		   for(int i=2 ;i<= (n/2) ; i++)
		   {   
		   if(n%i == 0)	
		    Counter++;
		   }
		    
		   if(Counter == 0)
			   
			   System.out.println(n);

	}

}
}