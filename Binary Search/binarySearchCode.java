
public class binarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int target = 8;
        boolean flag = false;
        
        while (lo<=hi) {
         int mid = (lo+hi)/2;
         if (arr[mid] == target) {
           flag = true; break;
         }
         else if (arr[mid]<target)  lo = mid+1;
         
         else if (arr[mid] > target) hi = mid-1; 
        }

        if ( flag==true) {
            System.out.println("target element is found");
        }
        else{
            System.out.println("target is not found");
        }
        
    }
}

