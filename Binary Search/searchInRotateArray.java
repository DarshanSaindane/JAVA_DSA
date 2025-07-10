public class searchInRotateArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int n = arr.length;
        int lo=0;
        int hi=n-1;
        int target=5;

        while (lo<=hi) {
            int mid = lo+(hi-lo);
            if (arr[mid]==target) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid]<=hi ) { //I am in right sorted array (mid to high everything is sorted)
                if (target>arr[mid] && target<=arr[hi]) {
                    lo=mid+1;
                }
               else hi=mid-1;
            }
            else{ // I am in left sorted array (lo to mid everything is sorted)
                if (target>=lo && target<arr[mid]) {
                    hi=mid-1;
                }
                else lo=mid+1;
            }
        }
    }
}
