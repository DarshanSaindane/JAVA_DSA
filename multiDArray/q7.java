package multiDArray;

public class q7 {
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    
    }
    public static void main(String[] args) {
        int[][] arr = {{1,5,3},{8,9,4},{6,4,7}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
            System.out.println();
        }
        print(arr);

        // rotate --> reverse each array
        // Write a program to rotate the matrix by 90 degrees
        //   clockwise.
        for (int i = 0; i < m; i++) {
            int a = 0;
            int b = m-1;
            while (a<b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;   
            }  
        }
        print(arr);
    }

    
    
}
