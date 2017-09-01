package review;

import java.util.Arrays;

public class ArrayExamples {

	public static boolean allGreater(int min, int[] numbers) {
		if (numbers.length == 0) {
			// throw new ArrayIndexOutOfBoundsException("wrong!");
			throw new IllegalArgumentException("Expected a non-empty array, got: " + Arrays.toString(numbers));
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= min) {
				return false;
			}
		}
		return true;
	}

	// given an int[] outputs the length of the longest consecutive streak
	 public static int consec(int[] a)
	  {
	    int current=1; //minimal number of consecutive
	    int longest=0;
	    for (int i=0; i<a.length-1; i++)
	    {
	      if (a[i] == a[i+1])
	      {
	        current++;
	        if (longest < current)
	          longest = current;
	      }
	      else {
	        current = 1;
	      }
	    }
	    return longest;
	  }

	
	/**
	 * Informal test of allGreater
	 */
	public static void main(String[] args) {
		// 1
		System.out.println(allGreater(2, new int[] { 9, 1, 8 }) == false);
		boolean correctException = false;
		try {
			allGreater(2, new int[] {});
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			correctException = true;
		} catch (Exception e) {
			System.out.print("Uhoh we got an exception we weren't expecting! ");
		}
		// 2
		System.out.println(correctException);
		// 3
		System.out.println(allGreater(-2, new int[] { 9, 5, 8 }));

	}
}