package com.rakuten;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is gokul";
        String result = reverseWordsInString(str);
        System.out.println(result);
    }

    public static String reverseWordsInString(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word and append to the result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        // Remove the trailing space
        return reversedString.toString().trim();
    }
}
