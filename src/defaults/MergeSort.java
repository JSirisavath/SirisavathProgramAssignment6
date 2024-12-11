package defaults;


// https://www.geeksforgeeks.org/java-program-for-merge-sort/
// O(n log n)
public class MergeSort extends Sort {
    public MergeSort(int[] sizes) {
        super(sizes);
    }
	
	
    public void sort(int[] array) {
        System.out.println("Starting Merge Sort.");
        mergeSort(array, 0, array.length - 1);
        System.out.println("Merge Sort completed.");
    }
	
	  
    // Merges two subarrays of a[]
   public void merge(int a[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

          for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts a[l..r] using
    // merge()
    public void mergeSort(int a[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);

            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }
    
}
