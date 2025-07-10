import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            int n = arr.length;
            int x = 16;
            
            
            int lo=0;
            int hi=n-1;
            while (lo<=hi) {
                int mid = (lo+hi)/2;
                int squ = mid*mid;
                if (squ==x) {
                    System.out.println(mid);
                    break;
                }
                else if (squ>x) {
                    hi=mid-1;
                }
                else if (squ<x) {
                    lo=mid+1;
                }
            }
    }
}
