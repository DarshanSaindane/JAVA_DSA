public class kthSmallestElement{
    static int ans;
   public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int[] arr,int lo, int hi){
        int pivot = arr[lo] , pidx = lo;
        int smallercount = 0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot){
                smallercount++;
            }    
        }
        int correctidx = pidx + smallercount;
        //now swap the pivot element to it's correct index
        swap(arr,pidx,correctidx);    

        //Partition 
        int i = lo, j = hi;     
        while(i<pivot && j>pivot){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>=pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;
       
    }

    public static void Quickselect(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans = arr[lo];
            return;
        }
        //pivot means (arr[lo]) put it's right place
        //& shift element <= pivot to left
        int idx = Partition(arr,lo,hi);
        if(idx == k-1){
          ans = arr[idx];
          return;
        }
        if(k-1<idx){
             Quickselect(arr,lo,idx-1,k);
        }
        else{
           Quickselect(arr,idx+1,hi,k);
        }
       
        
    }
    public static void main(String[] args){
        int[] arr = {1,3,8,6,7,9,11,13,15,5};
        int n = arr.length;
        print(arr);
        int k = 4;
        ans = -1 ;
       Quickselect(arr,0,n-1,k);
        System.out.println(ans);
       
    }
}