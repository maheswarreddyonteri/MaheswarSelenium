package Array_collections;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
	
     	/* 
     	 int [][] arr=new int[3][3];
     	
	     arr[0][0]=10;
	     arr[0][1]=20;
	     arr[0][2]=30;
	
     System.out.println(arr[0][2]);   */
		
		   /* int [][] arr= {{2,3,4},{5,6,7}};
		
		System.out.println(arr[1][1]);  */
		
		int [][] arr = {{3,4,5},{8,7,6}};
		
		for(int i=0;i<=1;i++)
			for(int j=0;j<=2;j++)
				System.out.println(arr[i][j]);
}
}