//Write a program to find maximum between two numbers
import java.util.Scanner;
	class Max{
		public static void main(String args[]){
		int n1,n2;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the First Number");
		n1=input.nextInt();
		System.out.println("Enter the Second Number");
		n2=input.nextInt();
		
		if(n1>n2){
			System.out.println("The First Number is Larger: \n"+n1);
		}else{
			System.out.println("The Second Number is Larger: \n"+n2);
		}
		
	}
	}