package Array;

import java.util.Scanner;


public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {45,64,2,3,4,8,9,14,2,5};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum = sum + arr[i]; 
        }
        System.out.println("sum of the array numbers is: "+ sum);

    
    }
    
}
