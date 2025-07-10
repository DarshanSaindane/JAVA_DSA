

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,3,2,6},{5,6,4,9},{8,9,7,4}};
       int[][] b = {{5,6,4,8},{8,7,9,2},{7,5,2,3}};
       int m = a.length;
       int n = a[0].length;
       int[][] arr = new int[m][n];

       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            arr[i][j] = a[i][j] + b[i][j];
            
        }
        
       }
       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j] + " ");
    }
           System.out.println();
}

    }
}
