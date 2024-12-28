import java.util.Scanner;
class product {
            int pid[]= new int[3];
            String pname[]= new String[3];
            int price[]= new int[3];
            int quantity[]= new int[3];

            void accept(){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the Product details: ");
                for(int i=0;i<3;i++){
                    System.out.println("Enter the product id: ");
                    pid[i]=sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Enter the product name: ");
                    pname[i] = sc.nextLine();

                    System.out.println("Enter the product price: ");
                    price[i]=sc.nextInt();

                    System.out.println("Enter the product quantity: ");
                    quantity[i]=sc.nextInt();
                    
                    sc.close();
                }
            }

            int calQuantity(int q){
                return price[q] * quantity[q];
        }

        void display(){
            for(int i=0;i<3;i++){
            System.out.println("The product id is: "+pid[i]);
            System.out.println("The product name is: "+pname[i]);
            System.out.println("The product price is: "+price[i]);
            System.out.println("The product price is: "+calQuantity(i));
            System.out.println("----------------------------------------");

        }
    }
}
class productEg{
    public static void main(String[] args) {
        product p = new product();
        p.accept();
        p.display();

    }
}

