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

	/**
	 * Informal test of allGreater; should print true 5 times to indicate that we
	 * got the output we expect.
	 */
	public static void main(String[] args) {
		// 1
		System.out.println(!allGreater(2, new int[] { 9, 1, 8 }));
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

		// Once again, this time with people.
		Person[] people = new Person[] { new Person(1, "Ali", Gender.MALE), new Person(9, "Maude", Gender.FEMALE) };
		int[] ages = new int[2];
		for (int p = 0; p < people.length; p++) {
			ages[p] = people[p].getAge();
		}
		// 4
		System.out.println(ages[0] == 1 && ages[1] == 9);
		// 5
		System.out.println(!allGreater(5, ages));
	}
}