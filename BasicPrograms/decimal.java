// Write a program to convert Binary to Decimal number system
import java.util.Scanner;
class decimal{
	public static void main(String args []){
		int n;
		int d=0;
		int i=0;
		int r;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the Binary Number");
		n=input.nextInt();
		
		while(n>0){
			r=n%10;
			d=d+r*(int)Math.pow(2,i++);
			n=n/10;
		}
		System.out.println("The Decimal Number is: "+d);
	}
	}