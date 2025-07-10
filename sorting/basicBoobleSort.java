
public class basicBoobleSort {
    public static void print(int[] arr) {
       for(int ele:arr){
        System.out.print(ele + " ");

       }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>=arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

    }
    
}
