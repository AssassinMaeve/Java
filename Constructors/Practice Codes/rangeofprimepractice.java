import java.util.Scanner;
class rangeofprimepractice {
        public static void main(String[] args) {
            int n,i;
            int count=0;
            boolean flag= true;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the range");
            n=input.nextInt();

            if(n>1){
            for( i=1;i<=n;i++){
                flag=true;
            if(i==1){
                flag=false;
            }for(int j=2;j<=Math.sqrt(i);j++){
                if(i%2==0){
                    flag=false;
                    break;
                }
                }if(flag){
                    count++;
                    System.out.println(i);
                }
                }
            }else{
                System.out.println("Invalid Range");
            }
        }   
    } 
