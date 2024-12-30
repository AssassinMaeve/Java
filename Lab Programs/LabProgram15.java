/*

 Write a Java program to illustrate working of multi-catch statements by
considering the following exception using throw keyword.
• ArithmeticException ……. Divide by zero.
• ArrayIndexOutOfBoundsException ………. Out of bound in an array.
• InputMistmatchException …………. Accepting a value from scanner class
  which is not comply with data type. (invalid input data type).

 */

import java.util.Scanner;

public class LabProgram15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user for a number and perform division
            System.out.print("Enter a number to divide 100: ");
            int divisor = scanner.nextInt(); // This may throw InputMismatchException
            
            // Throw ArithmeticException if divisor is zero
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            
            int result = 100 / divisor; // This may throw ArithmeticException
            System.out.println("Result: " + result);
            
            // Example of ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            System.out.print("Enter an index to access in the array (0-4): ");
            int index = scanner.nextInt(); // This may throw InputMismatchException
            
            // Throw ArrayIndexOutOfBoundsException if index is out of bounds
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
            }
            
            System.out.println("Array value at index " + index + ": " + array[index]);
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input: Please enter an integer.");
        } finally {
            scanner.close(); // Close the scanner resource
        }
        
        System.out.println("End of program.");
    }
}

