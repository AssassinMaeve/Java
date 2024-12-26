//Write a program to check whether a year is leap year or not
import java.util.Scanner;
class leapyear{
	public static void main (String args[]){
		int n;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the year");
		n=input.nextInt();
		
		if(n%4==0){
			System.out.println("The Year is a leapyear: \n"+n);
		}else{
			System.out.println("The Year is not a leapyear: \n"+n);
	}
	input.close();
}
}