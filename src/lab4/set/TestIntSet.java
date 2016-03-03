package lab4.set;
/***********************************************************
 * Lab #4 (CIS 181)                             *
 * Submitted By: FABIO ANDRADE                       *
 * SID: Your new SID starting with "00"                    *
 * Date: Your submission date                              *
 ***********************************************************/

//package set;

public class TestIntSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] s = {2, 5,7, 11, 19};
		IntSet is = new IntSet(s);

		// CREATING NEW SET FOR THE UNION AND INTERSECTION ...
		int[] s1 = {7,11, 15, 21, 69};
		IntSet is1 = new IntSet(s1);
		
		// Test cases
		
		// TEST FOR INSERTION
		System.out.println("Befroe insertion: " + is.toString());
		is.insert(34);
		System.out.println("After insertion: " + is.toString());

		
		// TEST FOR -VE NUMBER INSERTION
		System.out.println("\nBefroe insertion: " + is.toString());
		is.insert(-88);
		System.out.println("After insertion: " + is.toString());

		// TEST FOR REMOVAL 
		System.out.println("\nBefroe remove: " + is.toString());
		is.remove(5);
		System.out.println("After remove: " + is.toString());

		// TEST FOR SET COMPLEMENT
		System.out.println("\nBefroe complement: " + is.toString());		
		System.out.println("After complement: " +is.complement().toString()); 
		

		// TEST FOR INTERSECTION
		System.out.println("\nBefroe intersection of is : " + is.toString());		
		System.out.println("\nBefroe intersection of is1 : " + is1.toString());		
		System.out.println("After complement: " +is.intersection(is1).toString());


		// TEST FOR UNION ON TWO SETS 
		System.out.println("\nBefroe union of is : " + is.toString());		
		System.out.println("\nBefroe union of is1 : " + is1.toString());		
		System.out.println("After complement: " +is.union(is1).toString());
	}

}
