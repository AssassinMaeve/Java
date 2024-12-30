/*
Write a java program to accept a line of text from the user and write
the same into a file “ input.txt ”. Now while reading from the file
display only vowels along with count of the same.

------Important Note if the code is not running remove the comment and run the code------
 */

import java.io.*;
import java.util.Scanner;

public class LabProgram17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "input.txt";

        try {
            // Accept a line of text from the user
            System.out.println("Enter a line of text:");
            String inputText = scanner.nextLine();

            // Write the text to the file
            FileWriter writer = new FileWriter(fileName);
            writer.write(inputText);
            writer.close();
            System.out.println("Text written to " + fileName);

            // Read from the file and process vowels
            FileReader reader = new FileReader(fileName);
            int vowelCount = 0;
            System.out.println("Vowels in the file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;
                if ("AEIOUaeiou".indexOf(character) != -1) {
                    System.out.print(character + " ");
                    vowelCount++;
                }
            }
            reader.close();

            // Display the count of vowels
            System.out.println("\nTotal vowels: " + vowelCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


