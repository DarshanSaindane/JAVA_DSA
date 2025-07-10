package multiDArray;

import java.util.Scanner;

public class maxNoIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2,3,6,5},{8,7,9,55,},{14,22,33,66}};
        int max = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.print(max);
    }
    
}
