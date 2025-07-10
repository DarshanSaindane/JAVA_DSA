
public class searchReange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,5,6,7,8};
        int n = arr.length;
        int target = 8;
        int lo = 0;
        int hi = n-1;
        int fp=-1 ;
  // FOR FINDING THE FIRST POSITION
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if ( arr[mid]==target) {
                if (mid>0 && arr[mid]==arr[mid-1]) {
                   hi = mid-1;
                }
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
            
        }
        int lp = -1;
         lo = 0;
         hi = n-1;
        while (lo<=hi) {
            int mid = (lo+hi) /2;
            if (arr[mid]==target) {
                if ( mid+1<n && arr[mid]==arr[mid+1]) {
                    lo=mid+1; 
                }
                else{
                    lp=mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi=mid-1;
                else if(arr[mid]<target) lo=mid+1;
        }
        System.out.println(fp);
        System.out.println(lp);


    }
}
