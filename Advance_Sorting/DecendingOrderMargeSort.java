public class DecendingOrderMargeSort{
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void marge(int[] a, int[]  b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
            if(i==a.length){
                while(j<b.length){
                    c[k]=b[j];
                    k++;
                    j++;
                }
            }
            if(j==b.length){
                while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
                }
            }
        }
    }
    public static void MargeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        MargeSort(a);
        MargeSort(b);
        marge(a,b,arr);
    }
    public static void main(String A []){
        int[] arr = {12,13,45,68,15,3,5,79};
        print(arr);
        MargeSort(arr);
        print(arr);

    }
}