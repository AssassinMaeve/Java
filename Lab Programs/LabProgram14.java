/*
 
14) Write a Java program to accept the values (integers) as command line
arguments and count the number of palindromes. Handle necessary
exceptions i.e. NumberFormatException. Use a separate method to check
the same.

 */
class LabProgram14 {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            reverse = reverse * 10 + digit;  // Build the reversed number
            num /= 10;  // Remove the last digit
        }

        return originalNum == reverse;  // Check if original and reversed numbers are equal
    }

    public static void main(String[] args) {
        int count = 0;  // Counter for palindrome numbers

        // Check if there are command-line arguments
        if (args.length == 0) {
            System.out.println("No numbers provided. Please provide integers as command-line arguments.");
            return;
        }

        System.out.println("Input Numbers: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println("\nChecking for palindromes...");

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);  // Convert the string to an integer
                if (isPalindrome(num)) {
                    count++;  // Increment the counter if the number is a palindrome
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid integer.");
            }
        }

        System.out.println("Total number of palindromes: " + count);
    }
}

