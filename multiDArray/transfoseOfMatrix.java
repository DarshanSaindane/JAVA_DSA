package multiDArray;

import PatternPrenting.floydTringle;

public class transfoseOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{5,6,8},{8,7,5}};
    int m = arr.length;
    int n = arr[0].length;

    // for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    //transform

    // for(int j=0;j<n;j++){
    //     for(int i=0;i<m;i++){
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    //Storing 

    int[][] trans = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            trans[i][j] = arr[j][i];
            System.out.print(trans[i][j] + " ");
        }
        System.out.println();
    }
    
}
    }
    
