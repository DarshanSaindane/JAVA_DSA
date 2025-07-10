public class boobleSortOptimize {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 78, 4, 25, 6, 8, 3};
        int n = arr.length;
        int temp;
        
        // Optimized Bubble Sort
        for (int x = 0; x < n - 1; x++) {  // n-1 passes
            boolean flag = true; // Move flag declaration here

            for (int i = 0; i < n - 1 - x; i++) { // Reduce comparisons
                if (arr[i] > arr[i + 1]) { // Use '>' instead of '>=' for stability
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false; // If swap happens, array is not sorted yet
                }
            }
            
            if (flag) { // If no swaps, array is already sorted
                System.out.println("Already Sorted");
                break;
            }
        }
        
        print(arr);
    }
}
