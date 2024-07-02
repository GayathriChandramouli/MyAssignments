package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		    int num1 = 0, num2 = 1;
		    
		    System.out.println("First 8 Fibonacci series are");

	        for (int i = 0; i < 8; i++) {
	            // Print the number
	            System.out.print(num1 + " ");

	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	        }
	    }

	}
