package defaults;

// https://www.geeksforgeeks.org/bubble-sort-algorithm/
// O(n^2)
public class BubbleSort extends Sort {
	
    public BubbleSort(int[] sizes) {
        super(sizes);
    }
	
	    public void sort(int[] array) {
	        System.out.println("Starting Bubble Sort.");
	        bubbleSort(array);
	        System.out.println("Bubble Sort completed.");
	    }

	    // An optimized version of Bubble Sort
	    private void bubbleSort(int[] arr) {
	        int n = arr.length;
	        int temp;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were swapped by inner loop, then break
	            if (!swapped)
	                break;
	        }
	    }

}
