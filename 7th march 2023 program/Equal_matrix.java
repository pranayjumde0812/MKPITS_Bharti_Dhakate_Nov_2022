/*WAP in java to check two matrix are equal or not */
import java.util.Scanner;
class Equal_matrix
{
	public static void main(String[]args)
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the value of matrix1");
 		for(int i=0;i<2;i++)
 		{
			for(int j=0;j<2;j++)
	 		{
				a[i][j]=sc.nextInt();
 			}
  		}
  		System.out.println("Enter the value of matrix2");
  		for(int i=0;i<2;i++)
  		{
        	for(int j=0;j<2;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}
    	}
    	System.out.println(" matrix1 ");
    	for(int i=0;i<2;i++)
        {
	       for(int j=0;j<2;j++)
	       {
	          System.out.print(a[i][j]+"  ");
	       }
	       System.out.println("\n");
    	}
    	System.out.println(" matrix2 ");
    	for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(b[i][j]+"  ");
            }
        	System.out.println("\n");
    	}

    	System.out.println("Equality of two matrix");
		for(int i=0;i<2;i++)
		{

	        for(int j=0;j<2;j++)
	        {

	            if(a[i][j]==b[i][j])
   		        {
		            System.out.println("it is equal");
		        }
		        else
		        {
			         System.out.println("it is not equal");
		        }
			 }

          }
	  }
 }
