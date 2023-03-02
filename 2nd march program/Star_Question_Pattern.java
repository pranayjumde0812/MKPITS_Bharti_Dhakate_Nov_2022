/*        *
	 * ?
	* ? *
       * ? * ?
      * ? * ? *   */
 class Star_Question_Pattern
 {
	 public static void main(String[] args)
	 {
	 	System.out.println("Star - Question Pattern :");
	 	for(int h=1;h<=8;h++)
	 	{
			 for(int sp=1;sp<=41-h;sp++)
			 {
				 System.out.print(" ");
			 }
			 for(int str=1;str<=h;str++)
			 {
				 if(str%2==0)
				 {
					 System.out.print(" ?");
				 }
				 else
				 {
					 System.out.print(" *");
				 }
			 }
			 System.out.println();
	 	}
	}
}
