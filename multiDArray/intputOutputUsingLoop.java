package multiDArray;

import java.util.Scanner;

public class intputOutputUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [3][3];

        int m = arr.length;  //row
        int n = arr[0].length; // colome
       //Int of 2D array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

       //Output of 2D array
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
    }
    
}
