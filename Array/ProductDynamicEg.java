import java.util.Scanner;

class ProductDynamic {
    int pid[];
    String name[];
    int price[];
    int size;

    ProductDynamic(int s) {
        size = s;
        pid = new int[s];
        name = new String[s];
        price = new int[s];
    }

    void Insert() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Product ID: ");
            pid[i] = sc.nextInt();

            System.out.println("Enter the Product Name: ");
            name[i] = sc.next();

            System.out.println("Enter the Product price: ");
            price[i] = sc.nextInt();
        }
        sc.close();
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("The product id is: " + pid[i]);
            System.out.println("The product name is: " + name[i]);
            System.out.println("The product price is: " + price[i]);
            System.out.println("--------------------------------------");
        }
    }
}

class ProductDynamicEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int size = sc.nextInt();

        ProductDynamic p = new ProductDynamic(size);
        p.Insert();
        p.display();

        sc.close();
    }
}
