import java.util.Scanner;
class productpractice{
        int pid;
        String pname;
        int price;

        void accept(){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the ID of the Product");
            pid=sc.nextInt();

            System.out.println("Enter the Name of the Product");
            pname=sc.next();

            System.out.println("Enter the Price of the Product");
            price=sc.nextInt();
        }

        void display(){
            System.out.println("The ID of the Product is: "+pid);
            System.out.println("The Name of the Product is: "+pname);
            System.out.println("The Price of the Product is: "+price);
        }

        int calproduct(int n){
            return (n*price);
        }
}
/**
 * InnerproductpracticeEg
 */
public class productpracticeEg{
        public static void main(String[] args) {
            productpractice p = new productpractice();
            p.accept();
            p.display();

            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Amount of the Product");
            int n=sc.nextInt();

            int cal= p.calproduct(n);
            System.out.println("The Amount of the Product: "+cal);
         
        }
    
}
