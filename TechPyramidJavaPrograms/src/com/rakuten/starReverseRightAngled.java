package com.rakuten;

public class starReverseRightAngled {

	 public static void main(String[] args) {
	        int rows = 5; // Number of rows for the triangle
	        
	        // Single loop to handle both rows and columns
	        for (int i = 4, stars = 5; i < rows * (rows + 1) / 2; i++) {
	            System.out.print("* ");
	            if (--stars == 0) {
	                System.out.println(); // Move to the next line after finishing one row
	                stars = (int) (Math.sqrt(8 * (i + 1) + 1) - 1) / 2 + 1; // Calculate stars for the next row
	            }
	        }	    
	}
}
