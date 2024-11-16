import java.util.Scanner;
class primerangepractice {
    public static void main(String args[]){
        int r1,r2;
        int count=0;
        boolean flag=true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        r1=sc.nextInt();
        r2=sc.nextInt();

        if(r1<r2){
            for(int i=r1;i<=r2;i++){
                flag=true;
                if(i==1){
                    flag=false;
                    System.out.println("It is not a prime nor composite: "+i);
                    continue;
                }for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                count++;
                System.out.println(i+"\t ");
            }
            }
        }else{
            System.out.println("Invalid Range");
        }
            System.out.println("The range of "+count);
    }
}
