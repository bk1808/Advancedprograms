package com.rakuten;
public class rightAngletriangle1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int count = 1; // Initial count of stars
        int totalStars = n * (n + 1) / 2; // Total number of stars

        for (int i = 1, currentRow = 1; count <= 5; i++) {
            if (i <= n - currentRow) {
                System.out.print(" "); // Print spaces
            } else {
                System.out.print("*"); // Print stars
            }

            if (i == n) {
                System.out.println();
                i = 0; // Reset i for the next row
                currentRow++; // Move to the next row
                count++; // Increase the number of stars in the next row
            }
        }
    }
}
