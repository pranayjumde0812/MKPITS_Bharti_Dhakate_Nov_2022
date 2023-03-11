/*WAP in java to break inner for loop*/
class Break_Outer_For_loop {
	public static void main(String[] args) {
		aa:  //Label
		for(int i=1;i<=3;i++){
			bb:
		    for(int j=1;j<=3;j++){
			    if(i==2&&j==2){

				    break aa;    //break statement with label for outer loop
			    }
			    System.out.println("i : "+i+" ->   j : "+j);
		    }
	    }
	}
}