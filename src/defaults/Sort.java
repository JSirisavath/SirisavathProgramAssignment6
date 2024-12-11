package defaults;
import java.util.Random;
import java.util.Arrays;

public abstract class Sort {
	protected int[][] initial;
	public static final int TEST = 20;

	public Sort(int[] sizes) {
		initial = new int[sizes.length][];
		Random random = new Random();
		
		
		// Populate the initial array with random numbers
		
		for (int i =0; i<sizes.length; i++) {
			initial[i] = new int[sizes[i]];
			
			for (int j = 0; j <sizes[i]; j++) {
				initial[i][j] = random.nextInt(Integer.MAX_VALUE); // Random numbers
			}
		}
	}
	
	// Print array
	public static void show(int[] a) {
		for (int num:a) {
			System.out.printf("%20d\n", num);
		}
	}
	
	
	// verify if array is sorted
	public boolean isSorted(int[] a) {
		for (int i =0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		
		return true;
	}

	
	public abstract void sort(int[] array);
	
	
	// Util helper method to copy arrays
	public int[][] copyInitial() {
		System.out.print("Copy init arrays");
		int[][] copy = new int[initial.length][];
		
		for (int i =0; i <initial.length; i++) {
			copy[i] = Arrays.copyOf(initial[i], initial[i].length);
		}
		
		return copy;
	}
}
