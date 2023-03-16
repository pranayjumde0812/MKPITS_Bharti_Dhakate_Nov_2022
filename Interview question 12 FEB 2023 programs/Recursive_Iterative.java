/*Recursive vs Iterative*/
class Recursive_Iterative {
	static int powerOfTwo(int n) {
		if (n==0) {
			return 1;
		} else {
			var power = 2*powerOfTwo(n-1);
			return power;
		}
	 }
	 static int powerOfTwoIT(int n) {
	 	var i = 0;
	 	var power = 1;
	 	while (i < n) {
	 		power = power * 2;
	 		i = i + 1;
	 	}
	 	return power;
	 }

	public static void main (String [] args) {
		int x=powerOfTwo(5);
		System.out.println("Recursive : "+x);
		int y=powerOfTwoIT(5);
		System.out.println("Iterative : "+y);
	}
}