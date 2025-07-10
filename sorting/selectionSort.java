public class selectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        print(arr);
        int n = arr.length;
       
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++){
                if (arr[j]<min) {
                    min = arr[j];
                    mindx = j;
                    
                }
            }
            // swaping the numbers

             int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);

    }
    
}
