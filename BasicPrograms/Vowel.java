// Write a program to input any alphabet and check whether it is vowel or consonant
import java.util.Scanner;
class Vowel{
	public static void main(String [] args){
		char a;
		Scanner input= new Scanner (System.in);
		System.out.println("Enter an Alphabet");
		a=input.next().charAt(0);
		
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
			System.out.println("It is a vowel: \n"+a);
		}else{
			System.out.println("It is a consonant: \n"+a);
		}
	}
}