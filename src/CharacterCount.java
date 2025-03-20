package demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the string to count each character
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Output the character count for each character
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Output the total number of characters in the string
        int totalCount = inputString.length();
        System.out.println("The total number of characters in the string is: " + totalCount);

        // Close the scanner
        scanner.close();
    }
}

