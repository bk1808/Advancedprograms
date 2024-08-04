package com.rakuten;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 6, 7, 8, 0, 9, 8};
        shiftZerosToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shiftZerosToEnd(int[] arr) {
        int n = arr.length;
        int nextNonZero = 0; // Index of the next non-zero element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap elements
                int temp = arr[nextNonZero];
                arr[nextNonZero] = arr[i];
                arr[i] = temp;
                nextNonZero++;
            }
        }
    }
}
