/*
 * CST8116 Array Practice Example One Sample Solution
 * (c) Copyright 2021 Algonquin College, all rights reserved.
 */

/*
 * This class runs the program, demonstrating assigned task.
 */
public class ArrayPracticeExampleOne {

	/*
	 * Entry point for the application:
	 * Uses a for loop to print out an array of double[] with values
	 * 3.3, 5.5, 10.5, 8.8, 9.5, 10.1, 0.10, 8.0
	 * The loop prints the values with a comma after each value except
	 * for the last value.
	 * A sum of the numbers and the count of the numbers is output after the
	 * loop.
	 */
	public static void main(String[] args) {
		
		// small array size, use initializer list
		double[] numbers = {3.3, 5.5, 10.5, 8.8, 9.5, 10.1, 0.10, 8.0};
		double sum = 0;
		for(int index = 0; index < numbers.length; index++) {
			if( index == numbers.length - 1) {
				System.out.print(numbers[index]);
			}
			else {
			    System.out.print(numbers[index] + ", ");
			}
			sum = sum + numbers[index];
		}
		System.out.println(); // add a line at end of array output
		
		System.out.println("Array size: " + numbers.length);
		System.out.printf("Sum is: %.2f%n", sum);
		System.out.println("Program by Professor Stanley Pieda");
	}
}
