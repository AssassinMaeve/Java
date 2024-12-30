/*

 Define your own exception SumDigitException{int sumdigit} with necessary
methods, the same can be thrown while accepting ‘N’ integers into an
array if the given integer’s sum of digit is more than 7 and use
necessary try-catch block to handle the same.

 */

import java.util.Scanner;

// Custom Exception Class
class SumDigitException extends Exception {
     int sumdigit;

    // Constructor that accepts the sum of digits
     SumDigitException(int sumdigit) {
        super("Sum of digits exceeds 7: " + sumdigit);
        this.sumdigit = sumdigit;
    }

    // Getter for the sum of digits
     int getSumDigit() {
        return sumdigit;
    }
}

class LabProgram16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Accepting N integers into an array
        System.out.println("Please enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Checking each number for the sum of its digits
        for (int number : numbers) {
            try {
                checkSumOfDigits(number);
            } catch (SumDigitException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // Method to check the sum of digits
     static void checkSumOfDigits(int number) throws SumDigitException {
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add last digit to sum
            number /= 10;       // Remove last digit
        }

        // Throw custom exception if sum exceeds 7
        if (sum > 7) {
            throw new SumDigitException(sum);
        }
    }
}

