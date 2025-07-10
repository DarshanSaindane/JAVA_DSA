

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {5,66,4,8,2,9,3,100,4,3,6,22,200};
        int n = arr.length;
        int max =arr[0];
        for(int i=1;i<=n-1;i++){
            if (arr[i]>max) 
                max=arr[i];
        }
        System.out.println("the max number from given array is : "+max);
    }

    
}
