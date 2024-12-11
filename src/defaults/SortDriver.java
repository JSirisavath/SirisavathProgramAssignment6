package defaults;

import java.util.Arrays;

public class SortDriver {

	public static void main(String[] args) {
		
		int[] sizes = {20, 50, 1000, 5000,10000}; // Examples
		Sort[] sorts = {new SortFromArraysLib(sizes), new BubbleSort(sizes), new MergeSort(sizes) };
		
		Stopwatch stopwatch = new Stopwatch();
		
		
		// init array 
		int[][] initArray = sorts[0].copyInitial();
		
		
        for (Sort sort : sorts) {
            System.out.println("\nTesting " + sort.getClass().getSimpleName() + ":");
            for (int i = 0; i < initArray.length; i++) {
                int[] testArray = Arrays.copyOf(initArray[i], initArray[i].length);

                System.out.println("\nOriginal Array of Size " + testArray.length + ":");
                Sort.show(testArray);

                System.out.println("Sorting using " + sort.getClass().getSimpleName() + ".");
                stopwatch.stopTimer();
                sort.sort(testArray);
                stopwatch.stopTimer();

                System.out.println("\nSorted Array of Size " + testArray.length + ":");
                Sort.show(testArray);

                System.out.println("\nIs Sorted: " + sort.isSorted(testArray));
                System.out.println("Elapsed Time: " + stopwatch.elapsedTime() + " ms");
            }
        }
		
	}

}
