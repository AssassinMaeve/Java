// Write a program to display if a number is prime or not
import java.util.Scanner;
class prime{
	public static void main(String[]args){
		int n;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
		}
			
	}
	if(count==2){
				System.out.println("is Prime"+n);
		}else{
			System.out.println("is not prime"+n);
		}
}
}