
import java.util.Scanner;
class multidigit {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Multidigit");
        n=input.nextInt();

        if(n>=10 || n<=-10){
            if(n>largest){
                largest=n;
            }
            if(n<smallest){
                smallest=n;
            }
        }
        if (largest == Integer.MIN_VALUE || smallest == Integer.MAX_VALUE) {
            System.out.println("No multi-digit numbers entered.");
        } else {
            sum = largest + smallest;
            System.out.println("Largest multi-digit number: " + largest);
            System.out.println("Smallest multi-digit number: " + smallest);
            System.out.println("Sum of the largest and smallest multi-digit numbers: " + sum);
        }
        }
    }
