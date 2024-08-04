package com.rakuten;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int count = 1; // Initial count of stars

        for (int i = 1, currentRow = 1; currentRow <= n; i++) {
            int totalSpaces = n - currentRow; // Spaces before stars in the current row

            if (i <= totalSpaces) {
                System.out.print(" "); // Print leading spaces
            } else {
                System.out.print("*"); // Print stars  
            }

            if (i == totalSpaces + 2 * currentRow - 1) {
                System.out.println();
                i = 0; // Reset i for the next row
                currentRow++; // Move to the next row
            }
        }
    }
}

