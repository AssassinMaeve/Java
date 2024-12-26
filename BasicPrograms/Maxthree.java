//Write a program to find maximum between three numbers
import java.util.Scanner;
	class Maxthree{
		public static void main(String args[]){
		int n1,n2,n3;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the First Number");
		n1=input.nextInt();
		System.out.println("Enter the Second Number");
		n2=input.nextInt();
		System.out.println("Enter the Third Number");
		n3=input.nextInt();
		
		if(n1>n2 && n1>n3){
			System.out.println("The First Number is Larger: \n"+n1);
		}else if(n2>n1 && n2>n3){
			System.out.println("The Second Number is Larger: \n"+n2);
		}else if(n3>n1 && n3>n2){
			System.out.println("The Third Number is Larger: \n"+n3);
		}
		input.close();
	}
	}