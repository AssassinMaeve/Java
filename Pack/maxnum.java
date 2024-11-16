import src.Innermaxnum;
import java.util.Scanner;
 class maxnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();

        Innermaxnum m = new Innermaxnum(n);
        m.insert();
        m.display();
        m.max();

        sc.close();
    }
    
}
