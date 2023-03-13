/*factorial using recursion*/
class Factorial_Recursion {
	static public int factorial(int n) {
		if (n<0) {
		 	return -1;
		}
	 	if (n == 0 || n == 1) {
			 return 1;
		 }
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		int x=factorial(4);
		System.out.println(x);
	}
}