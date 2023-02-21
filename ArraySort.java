package ArraySort;
import java.util.Arrays; // Import the class Arrays

/**
 * This class sorts two arrays that share the same size and elements
 * Using two different methods of sorting
 * The elements of both arrays are random integers produced from the Math.random() method.
 * Finally, it computes the time taken to sort each array in each sorting method.
 */

public class ArraySort {

	public static void main(String[] args) {

		int[] A = new int[1000]; // Create array A of type int.
		int[] B = new int[1000]; // Create array B of type int.

		// Produce random integers and add them to array A.
		int i = 0;
		while (i < A.length) {
			int numbers = (int)(Integer.MAX_VALUE * Math.random());
			A[i] = numbers; // Put the numbers in the array.
			i++;
		}

		B = Arrays.copyOf( A, A.length ); // Copy the all the elements of array A into array B.

		long startTime = System.currentTimeMillis(); // Count the start time before sorting array A.

		selectionSort(A); // Call the selection sort method to sort the array A.

		long runTime = System.currentTimeMillis() - startTime; // Count the run time took in sorting array A.

		System.out.println("The array A:");
		System.out.println();

		// Display the length of array A.
		System.out.println("The length of array A is: " + A.length);

		// Display the run time took in sorting array A in seconds.
		System.out.println("Run time in seconds for array A was: " + runTime/1000.0);
		System.out.println();


		System.out.println("***************************************");
		System.out.println("The array B:");
		System.out.println();


		long startTime2 = System.currentTimeMillis(); // Count the start time before sorting array B.

		Arrays.sort(B); // Call the Array sort method to sort the array B.

		long runTime2 = System.currentTimeMillis() - startTime2; // Count the run time took in sorting array B.

		// Display the length of array B.
		System.out.println("The length of array B is: " + B.length);

		// Display the run time took in sorting array B in seconds.
		System.out.println("Run time in seconds for array B was: " + runTime2/1000.0);

	}

	/**
	 * "This method sorts the array in ascending order using selection sort
	 * It finds the largest item produced from Math random function and move it into the last position.
	 * It does that by swapping the current largest produced number in the last position" (Eck, 2019, p. 363).
	 * @param A is an array.
	 */

	static void selectionSort(int[] A) {
		// Sort A into increasing order, using selection sort
		for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {

			int maxLoc = 0; // Location of largest item seen so far.
			for (int j = 1; j <= lastPlace; j++) {
				if (A[j] > A[maxLoc]) {

					// j is now the new location of the maximum value.
					maxLoc = j;
				}
			}
			int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
			A[maxLoc] = A[lastPlace];
			A[lastPlace] = temp;
		} // end of for loop

	} // end of selection sort method.

} // end of class Lab2


//Reference
//
//Eck, D. J. (2019). Introduction to programming using Java, version 8.1. Hobart and William Smith College. http://math.hws.edu/javanotes.
