class Pattern6
{
 public static void main(String [] args)
 {

  for(int i=0; i<=3; i++)
  {

    for(int j=0; j<=3;j++)
    {
      if(i+j==3 )
      {
		 System.out.print("*");
	  }
	  else
	     System.out.print(" ");
    }

      for(int j=4; j<=6;j++)
	    {
	      if(j-i==3 )
	      {
			 System.out.print("*");
		  }
		  else
		     System.out.print(" ");
        }

        for(int j=7; j<=9;j++)
		    {
		      if(i+j==9 )
		      {
				 System.out.print("*");
			  }
			  else
			     System.out.print(" ");
		    }
		      for(int j=10; j<=12;j++)
			    {
			      if(j-i==9 )
			      {
					 System.out.print("*");
				  }
				  else
				     System.out.print(" ");
         }

        for(int j=13; j<=15;j++)
		    {
		      if(i+j==15 )
		      {

				 System.out.print("*");
			  }
			  else
			     System.out.print(" ");
		    }
		      for(int j=16; j<=18;j++)
			    {
			      if(j-i==15)
			      {
					 System.out.print("*");
				  }
				  else
				     System.out.print(" ");
		        }

		        for(int j=19; j<=21;j++)
				    {
				      if(i+j==21)
				      {
						 System.out.print("*");
					  }
					  else
					     System.out.print(" ");
				    }
				      for(int j=22; j<=25;j++)
					    {
					      if(j-i==21)
					      {
							 System.out.print("*");
						  }
						  else
						     System.out.print(" ");
        }
    System.out.println();
   }
 }
}