package geometry;

public class PointUtils {

	public static void main(String[] args) {
		Point[] dots = new Point[3];
		dots[0] = new Point(1,2);
		dots[1] = new Point(4,1);
		dots[2] = new Point(0,5);
		for (int i = 0; i < dots.length; i++) {
			System.out.println(dots[i]);
		}
		sort(dots);
		System.out.println("After srting");
		for (int i = 0; i < dots.length; i++) {
			System.out.println(dots[i]);
		}		
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
