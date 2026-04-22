package lab2b;
import java.util.*;

public class StringBuildingFunctions {
    // 1. Function to check if a string is empty or null
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // 2. Function to count occurrences of a substring
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        return (mainString.length() - mainString.replace(subString, "").length()) / subString.length();
    }

    // 3. Function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // 4. Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // 5. Function to remove all whitespace from a string
    public static String removeWhitespace(String str) {
        return str == null ? null : str.replaceAll("\\s", "");
    }


	public static void main(String[] args) {
		 // Example usage of each function
        System.out.println("1. Is Empty: " + isNullOrEmpty("")); // true
        System.out.println("2. Occurrences: " + countOccurrences("hello hello world", "hello")); // 2
        System.out.println("3. Reverse: " + reverseString("hello")); // olleh
        System.out.println("4. Palindrome: " + isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println("5. Remove Whitespace: " + removeWhitespace("Hello World")); // HelloWorld
       
    }
}



