/*WAP in java to break inner for loop*/
class Break_Inner_For_Loop {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){    //outer loop
			for(int j=1;j<=3;j++){    //inner loop
				if(i==2&&j==2){
					break;     //break statement inside the inner loop
				}
			    System.out.println("i : "+i+" ->   j : "+j);
			}
		}
	}
}