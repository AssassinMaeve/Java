import java.util.Scanner;
class decimalpractice {
    public static void main(String[] args) {
        int n;
        int r;
        int d=0;
        int i=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        n=sc.nextInt();

        int temp=n;
        boolean flag= true;

        while(temp!=0){
            int digit=temp%10;
            if(digit!=1 && digit!=0){
                flag=false;
                break;
            }
            temp=temp/10;
        }
        if(flag){
            while(n!=0){
                r=n%10;
                d= d +r*(int)Math.pow(2, i++);
                n=n/10;
            }System.out.println("The Decimal Number is: "+d);
        }else{
            System.out.println("Invalid Input ");
        }

    }
}
