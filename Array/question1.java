

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {55,66,7,1,8,9,22,99};

        int n = arr.length;
       // System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (arr[i]<35) {                    
                System.out.println(arr[i] + " ");
                
            }
            
        }
    }
    
}
