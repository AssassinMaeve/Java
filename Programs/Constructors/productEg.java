package Constructors;

import java.util.Scanner;
class product{
    int pid;
    String pname;
    int price;

    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the product");
        pid=sc.nextInt();

        System.out.println("Enter the name of the product");
        pname=sc.next();

        System.out.println("Enter the price of the product");
        price=sc.nextInt();

        sc.close();
    }
   
    int cal(int n){
        return n*price;
    }

    void display(){
        System.out.println("The product id is: "+pid);
        System.out.println("The product name is: "+pname);
        System.out.println("The product price is: "+price);
        
    }

}

class productEg{
    public static void main(String args[]){
        product p1 = new product();
        p1.insert();
        p1.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        int total = p1.cal(n);
        System.out.println("Total Amount for " + n + " products: " + total);
        
        sc.close();
    }
}