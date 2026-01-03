public class findDuplicateNo{
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int Find(int[] arr){
        while(true){
            int ele = arr[0];
            if(arr[ele]==ele){
               return ele;
            }
            else{
                swap(0,ele,arr);
            }
        }
        
    }
    public static void main(String[] args){
        int[] arr = {2,4,1,4,3};
        System.out.println(Find(arr));

    }
}