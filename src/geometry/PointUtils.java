package geometry;

public class PointUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void sort(Point[] array) {
		int smallestIndex;
		for (int i = 0; i < array.length - 1; i++) {
			// find smallest index
			smallestIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].getX() < array[smallestIndex].getX())
					smallestIndex = j;
			}

			// swap values
			if (i != smallestIndex) {
				Point temp = array[i];
				array[i] = array[smallestIndex];
				array[smallestIndex] = temp;
			}
		}
	}
	

}
