// Fibonacci Series of Numbers in Java
import java.util.Scanner;
class fibonaccci{
	public static void main(String[]args){
		int n;
		int f1=0;
		int f2=1;
		int f3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the series");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.print(f1 + " ");
			f3= f1+f2;
			f1=f2;
			f2=f3;
		}
		
	}
}