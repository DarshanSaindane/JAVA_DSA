public class multiOfTwoMatrix {
    public static void main(String[] args) {
        int[][] a= {{1,2,1},{2,1,2}};
        int[][] b= {{1,5,6,2},{5,8,6,3},{7,8,9,3}};
        if (a[0].length != b.length) {
            System.out.println("Multiplication is not possibal");
        }
        else{//multiplacation is possible
            int[][] c= new int[a.length][b[0].length];

            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    //c[i][j]=a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + a[i][3]*b[3][j] +....
                for(int k=0;k<b.length;k++){
                    c[i][j] += a[i][k]+b[k][j];

                }
                System.out.print(c[i][j]+" ");
                }
                System.out.println();


            }

        }
    }
    
}
 