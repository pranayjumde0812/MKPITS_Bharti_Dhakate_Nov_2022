/*WAP in java to Reverse individual words of the sentence. - HCL interview questions*/
import java.util.Scanner;
class Reverse_words_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String s=sc.nextLine();
		String reverseString="";
		//Check if the given Sentence is null
		if(s.isEmpty()) {
			System.out.println("The sentence is empty");
			System.exit(0);
		}
		//covert string into words array
		String words[]=s.split("\\s");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		//Reverse the words in String Array
		for(int i=0;i<words.length;i++) {
			StringBuffer sb=new StringBuffer(words[i]);
			sb.reverse();
			reverseString=reverseString+sb.toString()+" ";
		}
		System.out.println(reverseString);
	}
}
