class Recursive_method {
	static int Adoll (int doll) {
		if(doll == 10) {
				return doll;
		}
		else {
			System.out.println(" "+doll);
			//System.out.println("doll number : " +doll);
			Adoll(doll+1);
			System.out.println("doll number : " +doll);
		}
		return doll;
	}
	public static void main(String[] args) {

		int doll=1;
		Adoll(doll);
	}
}

