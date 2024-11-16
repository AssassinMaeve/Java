import java.util.Scanner;
class primepractice {
        public static void main(String[] args) {
            int n;
            boolean flag=true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value: ");
            n=sc.nextInt();

            if(n==1){
                flag=false;
                System.out.println("It is not prime or composite: "+n);
            }
            for(int i=2; i<=(n-2); i++){
                if(i%n==0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("It is a prime number: "+n);
            }else{
                System.out.println("It is not a prime number: "+n);
            }
        }
}
