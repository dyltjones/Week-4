package week4;

import java.util.Arrays;

public class Java4CodingProject {

	public static void main(String[] args) {

		/*
		 * 1. Create an Array of int called ages that contains the following
		 * values: 3, 9, 23, 64, 2, 8, 28, 93. a. Programmatically subtract the
		 * value of the first element in the Array from the value in the last
		 * element of the Array (i.e. do not use ages[7] in your code). Print
		 * the result to the console.
		 */

		System.out.println("1:\n ");

		int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93};

		int arraySize = ages.length; // gets length of array without knowing
										// true size of array

		System.out.println(ages[0] - ages[ages.length - 1]);
		/*
		 * 0 will always be the first in the array, length - 1will get you the
		 * last number /*
		 * 
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will
		 * be longer than the ages array, and have more elements).
		 * 
		 * i. Make sure that there are 9 elements of type int in this new array.
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract
		 * the value of the first element in the new array ages2 from the last
		 * element of ages2). iii. Show that using the index values for the
		 * elements is dynamic (works for arrays of different lengths).
		 */
		System.out.println("\tb:\n ");
		int[] ages2 = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 28};

		System.out.println("\t" + (ages2[0] - ages2[ages2.length - 1]));

		/*
		 * c. Use a loop to iterate through the Array and calculate the average
		 * age. Print the result to the console. Week 4 Coding Assignment
		 */

		double agesTotal = 0;

		// adds all the ages together
		for (int i = 0; i < ages2.length; i++) {
			agesTotal += ages2[i];

		}
		// gets the average as a double
		double agesAverage = agesTotal / ages2.length;

		// System.out.println(agesTotal);
		System.out.println("\n\tc: ");
		System.out.println("\tThe average age is: " + agesAverage);

		/*
		 * 2. Create an Array of String called names that contains the following
		 * values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		{
			String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally",
					"Buck", "Bob"};
			// System.out.println(Arrays.toString(names));
			System.out.println("2:\n");

			/*
			 * a. Use a loop to iterate through the Array and calculate the
			 * average number of letters per name. Print the result to the
			 * console.
			 */
			// calculate the total of letters in the array

			double total = 0;
			for (String name : names) {
				total += name.length();

			}
			// System.out.println(total);

			// calculates average average
			System.out.println("\ta:\n ");
			System.out.println("\tthe average number of letters is: "
					+ (total / names.length) + "\n");

			/*
			 * b. Use a loop to iterate through the Array again and concatenate
			 * all the names together, separated by spaces, and print the result
			 * to the console.
			 */

			StringBuilder concatenatedNames = new StringBuilder();

			for (String name : names) {
				concatenatedNames.append(name).append(" ");

			}
			// trims the space at the end
			String trimSpace = concatenatedNames.toString().trim();

			System.out.println("\tb:\n ");
			System.out.println("\t" + trimSpace);

			// 3. How do you access the last element of any Array?
			System.out.println(
					"3: [arrayName.length - 1] will get you the last element");
			// [arrayName.length - 1] will get you the last element

			// 4. How do you access the first element of any Array?
			System.out.println(
					"4: [0] will always be the first element in an array ");

			// [0] will always be the first

			// 5. Create a new Array of int called nameLengths. Write a loop to
			// iterate over the previously
			// created names Array and add the length of each name to the
			// nameLengths Array.

			// new array equal to previous array length
			int[] nameLengths = new int[names.length];
			// loops through adding the length of each name into the nameLength
			// Array
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			System.out.println("5:\n ");
			System.out.println(Arrays.toString(nameLengths) + "\n");
			// prints to String

			// 6. Write a loop to iterate over the nameLengths Array and
			// calculate the sum of all the elements in
			// the Array. Print the result to the console.

			// adds each element together to get sum
			int sum = 0;
			for (int length : nameLengths) {
				sum += length;
			}
			System.out.println("6:\n ");
			System.out.println("Sum total: " + sum + "\n");

			// 7. Write a method that takes a String, word, and an int, in, as
			// arguments and returns the word
			// concatenated to itself n number of times. (i.e. if I pass in
			// “Hello” and 3, I expect the method to
			// return “HelloHelloHello”).

			// prints out the method
			System.out.println("7:\n ");
			System.out.println(concatenatedWord("jeff", 7) + "\n");

			// 8. Write a method that takes two Strings, firstName and lastName,
			// and returns a full name (the
			// full name should be the first and the last name as a String
			// separated by a space).

			System.out.println("8:\n ");

			String fullNameString = Utility.fullName("Bilbo", "Baggins");

			System.out.println(fullNameString);

			// 9. Write a method that takes an Array of int and returns true if
			// the sum of all the ints in the Array
			// is greater than 100.

			int[] greaterThan100Array = new int[]{4, 8, 15, 16, 23, 42};
			System.out.println("9:\n ");
			System.out.println(isSumGreaterThan100(greaterThan100Array) + "\n");

			// 10. Write a method that takes an Array of double and returns the
			// average of all the elements in
			// the Array.

			double[] doubleArray = new double[]{1.5, 2.5, .5, .5};
			System.out.println("10:\n ");
			System.out.println(
					"The average is: " + doubleAverage(doubleArray) + "\n");

			// 11. Write a method that takes two Arrays of double and returns
			// true if the average of the
			// elements in the first Array is greater than the average of the
			// elements in the second Array.

			double[] array1 = new double[]{1.5, 2.5, 5.5};
			double[] array2 = new double[]{4.5, 12.5, 5.5};
			System.out.println("11:\n ");
			System.out.println(twoArrayAverage(array1, array2) + "\n");

			// 12. Write a method called willBuyDrink that takes a boolean
			// isHotOutside, and a double
			// moneyInPocket, and returns true if it is hot outside and if
			// moneyInPocket is greater than 10.50.

			boolean isHotOutside = true;
			double moneyInPocket = 20;
			System.out.println("12:\n ");
			System.out.println("will buy drink?: "
					+ willBuyDrink(isHotOutside, moneyInPocket) + "\n");

			// 13. Create a method of your own that solves a problem. In
			// comments, write what the method
			// does and why you created it.

			// checks if password meets the length requirements of a password
			String password = "HelloWorld";
			System.out.println("13:\n ");
			if (isPasswordLongEnough(password) == true) {
				System.out.println("Your password is long enough");
			} else {
				System.out.println("Your password is NOT Long enough");

			}

			// System.out.println(isPasswordLongEnough(password));

		}

	}

	// take a string and an int concatenates it that many times with no spaces
	public static String concatenatedWord(String word, int x) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < x; i++) {
			result.append(word);
		}
		return result.toString();
	}

	

	// takes the sum of int's inside the array and checks if it's greater than
	// 100
	public static boolean isSumGreaterThan100(int[] array) {

		int sum = 0;

		for (int num : array) {
			sum += num;
		}
		return sum > 100;
	}

	// takes a double array adds up the doubles and returns the average
	public static double doubleAverage(double[] doubleArray) {
		double total = 0;

		for (double num : doubleArray) {
			total += num;
		}
		return total / doubleArray.length;
	}

	// takes two double arrays adds both together then checks to see if the
	// first average is greater than the second
	public static boolean twoArrayAverage(double[] array1, double[] array2) {

		double arrayTotal1 = 0;
		double arrayTotal2 = 0;

		for (double num : array1) {
			arrayTotal1 += num;
		}
		for (double num : array2) {
			arrayTotal2 += num;
		}
		return (arrayTotal1 / array1.length) > (arrayTotal2 / array2.length);
	}
	// takes a boolean and a double checks if the boolean is true and if the
	// double is greater than 10.50
	public static boolean willBuyDrink(boolean isHotOutside,
			double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	// checks if password is greater or equal do the requirements
	public static boolean isPasswordLongEnough(String password) {
		int passwordLengthRequired = 10;

		if (password.length() >= passwordLengthRequired) {
			return true;
		} else {
			return false;
		}
	}
}
