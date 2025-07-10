package Array;

import java.util.Scanner;

public class question6TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {1,24,5,6,8,0,};
        int x = 11;
        for (int i = 0; i < arr.length; i++) {
           for(int j = i+1; j< arr.length;j++){
            if (arr[i]+arr[j]==x) {
                System.out.println(arr[i]+" " +arr[j]);
                
                
            }
           }
            
        }
    }
    
}
