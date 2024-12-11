package defaults;

import java.util.Arrays;

// Using sort from Arrays libs
public class SortFromArraysLib extends Sort {
	
	public SortFromArraysLib(int[] sizes) {
		super(sizes);
	}
	
	public void sort(int[] array) {
		System.out.print("Array.sort to sort array");
		Arrays.sort(array);
	}
	
}
