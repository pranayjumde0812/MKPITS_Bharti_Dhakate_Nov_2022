/* Java program to calculate Simple Interest with explanation.*/
/*Example 1:

Input :  P = 10000
         R = 5
         T = 5
Output : 2500

Explanation - We need to find simple interest on
Rs. 10, 000 at the rate of 5% for 5
units of time*/
class Simple_Interest
{
    public static void main(String args[])
    {
        float P = 10000, R = 5, T = 5;

        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}