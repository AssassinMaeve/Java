import java.util.Scanner;
class binarypractice {
    public static void main(String args[]){
        int n,rem,s=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the decimal number");
        n=sc.nextInt();
        int pow=1;
        while(n!=0){
            rem=n%2;
            s=rem*pow+s;
            pow=pow*10;
            n=n/2;
            
        }
        System.out.println("The binary Value is: "+s);
    }
    
}
