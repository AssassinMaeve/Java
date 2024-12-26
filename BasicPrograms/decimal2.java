import java.util.Scanner;

class decimal2{
    public static void main(String args[]) {
        int n;
        int d = 0;
        int i = 0;
        int r;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Binary Number:");
        n = input.nextInt();
        
        // Copy of the input number to validate digits
        int temp = n;
        boolean isValid = true;
        
        // Check if all digits are binary (0 or 1)
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isValid = false;
                break;
            }
            temp = temp / 10;
        }
        
        if (isValid) {
            // Perform binary to decimal conversion
            while (n > 0) {
                r = n % 10;
                d = d + r * (int) Math.pow(2, i++);
                n = n / 10;
            }
            System.out.println("The Decimal Number is: " + d);
        } else {
            System.out.println("Error: Please enter a valid binary number (only 0 and 1).");
        }
        input.close();
    }
}
