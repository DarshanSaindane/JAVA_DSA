

public class boobleSort {
    public static void print(int[] arr) {
        for(int ele:arr){
         System.out.print(ele + " ");
 
        }
     }
     public static void main(String[] args) {
         int[] arr = {2,4,5,78,4,25,6,8,3};
         int n = arr.length;
         int temp;
         // Booble sort no....1
        //  for (int x = 1; x < n-1; x++) {
        //      for (int i = 0; i < n-1; i++) {
        //         if (arr[i]>=arr[i+1]) {
        //             temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //      }
        //  }
        //Booble sort no...2
        //  for (int x = 0; x < n-1; x++) { //n-1 passes
        //     for (int i = 0; i < n-1-x; i++) {
        //        if (arr[i]>=arr[i+1]) {
        //            temp = arr[i];
        //            arr[i] = arr[i+1];
        //            arr[i+1] = temp;
        //        }
        //     }
        // }

        //Booble sort Optimised

        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n-1; i++) {
               if (arr[i]>=arr[i+1]) {
                   temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
            }
            //check if this pass has sorted or not
            Boolean flag = true;
        for ( i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i+1] ) {
                flag = false;
            }
            
        }
        if (flag == true) System.out.println("sorted");
           
        }
         print(arr);
 
     }
    }
}


    

