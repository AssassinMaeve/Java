import java.util.Scanner;
class numoperation {
        static int maxdigit(int n){
            int rem;
            int max=0;

            while(n!=0){
                rem=n%10;
                if(rem>max){
                    max=rem;
                }
                n=n/10;
            }
            return max;
        }    

        static boolean checkpali(int n){
            int rem;
            int pali=0;
            int t=n;
            int m=0;
            boolean flag=false;
            while(n!=0){
                rem=n%10;
                m=m*10+rem;
                n=n/10;
                
                }if(pali==n){
                    return true;
                }else{
                    return false;
            }
        }

        static int bin(int n){
            int rem;
            int bin=0;
            int pow=1;
            while(n!=0){
                rem=n%2;
                bin=bin+rem*pow;
                pow=pow*10;
                n=n/2;
            }
            return bin;
        }
}

/**
 * numoperationEg
 */
public class numoperationEg {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
        System.out.println("The max digit of the multi digit number is: "+numoperation.maxdigit(n));
        System.out.println("The max digit of the multi digit number is: "+numoperation.checkpali(n));
        System.out.println("The max digit of the multi digit number is: "+numoperation.bin(n));
    }
}
