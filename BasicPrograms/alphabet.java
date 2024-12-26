//Write a program to check whether a character is alphabet or not
import java.util.Scanner;
class alphabet{
	public static void main(String []args){
		char a;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an Alphabet");
		a=input.next().charAt(0);
		
		if(a>='a' && a<='z' || a>='A' && a<='Z'){
			System.out.println("It is an alphabet: \n"+a);
		}else{
			System.out.println("It is not an alphabet: \n"+a);
		}
		input.close();
	}
}