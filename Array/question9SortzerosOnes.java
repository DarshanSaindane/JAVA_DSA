

public class question9SortzerosOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,0,0,1,1};
        int n = arr.length;
    //     int noOfZeros = 0;

    //    for(int i=0;i<n-1;i++){
    //     if (arr[i]==0) {
    //         noOfZeros++;
    //     }
    //    }
    //    for(int i=0;i<n-1;i++){
    //     if (i<noOfZeros) {
    //         arr[i]=0;
    //     }
    //     else
    //     arr[i]=1;
    //    }
    //    System.out.println(arr.length);
    //    for(int i=0;i<=n-1;i++){
    //     System.out.print(arr[i]+" ");
    //    }
     
    // ******************** METHOD 2ND **********************
    
    int i=0,j=n-1;
    while(i<j){
        if (arr[i]==0)  i++;
           
        if (arr[j]==1)  j--; 
        
        if (i>j) 
        break;
            
       if (arr[i]==1 && arr[j]==0) {
        arr[i]=0;
        arr[j]=1;
        i++;
        j--;

       }
       
    }
    for( int ele : arr){
        System.out.print(ele+" ");
       }
  System.out.println();
       
    }

    
}
