import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		// make two arrays into one
		int[] test = { 1, 2 };
		int[] test2 = { 3, 4 };

		int[] trying = plusTwo(test, test2);
		System.out.println(Arrays.toString(trying));

	}// main method
		// {1,2} and {3,4} are a fixed length and cannot be expanded or changed. So need to make a new array with length 4.

	public static int[] plusTwo(int[] a, int[] b) {
		// get first set of arrays
		int first1 = a[0];
		int first2 = a[1];
		// get last set of arrays
		int last1 = b[0];
		int last2 = b[1];
		// add together into a 4 array
		int[] together = { first1, first2, last1, last2 };
		// for(int num:together) {
		// System.out.println(num);
		// }
		
		return together;

	}// plusTwo method close

}// class
