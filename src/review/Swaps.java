package review;

public class Swaps {
	public static void main(String[] args) {
		// Part 1
		int x = 1; 
		int y = 2;
		swap1(x,y);
		System.out.println(x + " " + y);
		
		// Part 2
		int[] g = {1,2,3};
		int[] h = {2,3,4};
		swap2(g,h);
		System.out.println(g[0] + " " + h[0]);
		
		swap3(g,h);
		System.out.println(g[0] + " " + h[0]);
	
	}
	
	public static void swap1(int a, int b) {
		int temp = a; 
		a = b; 
		b = temp;
	}
	
	public static void swap2(int[] a, int[] b) {
		int[] temp = a; 
		a = b;
		b = temp;
	}

	public static void swap3(int[] a, int[] b) {
		int temp = a[0]; 
		a[0] = b[0];
		b[0] = temp;
	}

}
