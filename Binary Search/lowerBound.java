
public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17,19,23,26,55};
        int n = arr.length;
        int lo=0;
        int hi=n-1;
        int target = 15;
        int lb = n;

        while (lo<=hi) {
          int mid = (lo+hi)/2;
            if (arr[mid]>=target) {
                lb = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        System.out.println(lb);
        
    }
}
