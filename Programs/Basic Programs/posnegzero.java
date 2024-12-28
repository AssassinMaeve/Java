//Write a program to check whether a number is negative, positive or zero

import java.util.Scanner;
class posnegzero{
	public static void main(String args []){
		int n1;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter positive, negative numbers");
		n1=input.nextInt();
		
		if(n1<=-1){
			System.out.println("The Number is a negative number: \n"+n1);
		}else if(n1>0){
			System.out.println("The Number is a positive number: \n"+n1);
		}else if(n1==0){
			System.out.println("The Number is Zero: \n"+n1);
	}
	input.close();
}
}