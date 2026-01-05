public class InversionCount{
    static int count;
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

     public static void marge(int[] a,int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){   //we write <= for stability.
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                count = count+(a.length-i);  // extra part for inversion this is most efficient way of inversio finding
                k++;
                j++;
            }
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
                k++;
                i++;
            }
        }
    }

    public static void margeSort(int[] arr){
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
        margeSort(a);
        margeSort(b);
        marge(a,b,arr);
        a = null; b = null;

    }
    public static void main(String[] args){
        int[] arr = {10,50,60,71,52,80,89,54};
        print(arr);
        margeSort(arr);
        print(arr);
        System.out.println(count);
 
    }
}
