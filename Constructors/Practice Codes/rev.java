import java.util.Scanner;
class rev{
    public static void main(String args[]){
        int n;
        int rev=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a multidigit number");
        n=input.nextInt();

        while(n!=0){
            int rem=n%10;
                rev=rev*10+rem;
                n/=10;
        }

        System.out.println("The rev of the number is: "+rev);
    }
}
