package Array;

public class question7ReverseArray {
    public static void main(String[] args) {
        int[]dj = {1,2,3,4,5,6,7,8,9,0};
        int n = dj.length;

        for (int i = 0; i < n; i++) {
            System.out.print(dj[i]+" ");
        }
        System.out.println();

        //Reverse 

        // for (int i = 0; i < n/2; i++) {
        //    int temp = dj[i];
        //    dj[i]=dj[n-1-i];
        //    dj[n-1-i]=temp;
        // }
        
        // ********Different method ************
      //  int i = 1,j=4;    //part of array reverse.
        int i=0,j=n-1;
        while (i<=j) {
         swap(dj,i,j); 
         i++;
         j--; 
        }
        for ( i = 0; i < n; i++) {
             System.out.print(dj[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[]dj,int i,int j){
        int temp = dj[i];
        dj[i] =dj[j];
        dj[j]=temp;
    }
} 

