public class pickIndxInMountenArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int n = arr.length;
        int lo = 1;
        int hi = n-2;
        int mid = (lo+hi)/2;

        while (lo<=hi) {
           
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                lo=mid+1; 
            }
            else if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
                hi=mid-1;
            }
        }                    
    }
}
