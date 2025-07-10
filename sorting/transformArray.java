public class transformArray {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {24,32,56,5,8,97};
         // answer:   2,3,4,0,1,5
         print(arr);
         int n = arr.length;
         int x = 0;
         for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=0;j<n;j++){
                if (arr[i]<min && arr[i]>0) {
                    min = arr[i];
                    mindx = i;
                    
                }
            }
            arr[mindx] = x;
            x--;
            
         }
         print(arr);
    }
    
}
