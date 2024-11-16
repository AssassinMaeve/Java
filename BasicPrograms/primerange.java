import java.util.Scanner;

class primerange {
    public static void main(String args[]) {
        int r1;
        boolean flag;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        r1 = sc.nextInt();

        if (r1>1) {
            for (int i = 2; i <= r1; i++) {
                flag = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {  // If the number is prime

                    System.out.println(i + "\t");
                }
            }
        } else {
            System.out.println("Invalid Range");
        }


    }
}