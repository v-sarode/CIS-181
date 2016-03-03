package lab4.set;
/***********************************************************
 * Lab #4 (CIS 181)                             *
 * Submitted By: Your name here !!!                        *
 * SID: Your new SID starting with "00"                    *
 * Date: Your submission date                              *
 ***********************************************************/

//package set;

public class TestIntSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] s = {2, 5, 11, 19};
		IntSet is = new IntSet(s);

		// Test cases
		System.out.println("Befroe insertion: " + is.toString());
		is.insert(34);
		System.out.println("After insertion: " + is.toString());

		System.out.println("\nBefroe insertion: " + is.toString());
		is.insert(-88);
		System.out.println("After insertion: " + is.toString());

	}

}
