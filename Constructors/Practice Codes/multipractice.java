import java.util.Scanner;
class multipractice {
    public static void main(String args[]){
        int n;
        int find;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the multidigit number: ");
        n=sc.nextInt();

        System.out.println("Enter the number u want to find: ");
        find=sc.nextInt();

        if(n>=10){
        while(n!=0){
            int rem=n%10;
            if(rem==find){
                flag=true;
                break;
            }
            n=n/10;
        }if(flag){
            System.out.println("The multidigit exists: "+find);
        }else{
            System.out.println("The multidigit does not exists: "+find);
        }
    }else{
        System.out.println("Please Enter a multi digit number");
    }
}
}
