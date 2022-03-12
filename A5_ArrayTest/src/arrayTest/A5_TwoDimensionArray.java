package arrayTest;

public class A5_TwoDimensionArray {

	public static void main(String[] args) {
		//     row,col       row,col	
		int[][] a= new int[2][3];
		
		//1st row
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
	
		//2nd row
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		//System.out.println(a[0][0].length);   // err: length can not be resolved or is not a field
		
		System.out.println(a.length);// row
		System.out.println(a[0].length); //column
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
