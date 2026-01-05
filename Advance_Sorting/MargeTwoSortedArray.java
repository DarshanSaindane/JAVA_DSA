public class MargeTwoSortedArray {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void marge(int[] a,int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
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
    public static void main(String[] args){
        int[] a ={12,13,15,27,30};
        int[] b ={16,17,25,31,};
        print(a);
        print(b);
        int[] c =new int[a.length+b.length];
        marge(a,b,c); 
        print(c);
    }
}