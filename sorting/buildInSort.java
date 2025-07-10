
import java.util.Arrays;
public class buildInSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,89,9};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        Arrays.sort(arr);     //built in sort 
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }
    
}
