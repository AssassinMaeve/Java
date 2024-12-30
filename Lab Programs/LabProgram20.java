/*

Write a Java program to add N given strings into an ArrayList and then
by iterating the list display only the strings which contains repeated
characters in it.

*/

import java.util.*;

class LabProgram20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<String> stringList = new ArrayList<>();

        // Accept N strings from the user
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            stringList.add(input);
        }

        // Display strings with repeated characters
        System.out.println("Strings with repeated characters:");
        for (String str : stringList) {
            if (hasRepeatedCharacters(str)) {
                System.out.println(str);
            }
        }

        scanner.close();
    }

    // Method to check if a string has repeated characters
    static boolean hasRepeatedCharacters(String str) {
    for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
        }
    }
    return false;
}
}

