// Write a program to convert Decimal to Binary number system
import java.util.Scanner;
class binary{
	public static void main(String args[]){
		int n;
		String s=" ";
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a Decimal Value");
		n=input.nextInt();
		
		while(n>0){
			int rem=n%2;
			s=s+rem;
			n=n/2;
		
		}
		System.out.println(s);
	}
}