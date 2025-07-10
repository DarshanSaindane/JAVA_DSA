public class arrayTravrsal {
    public static void print(int i, int[]arr){ //when we pass an array in function 
        if(i == arr.length) return;            //then i is work as index
        System.out.print(arr[i]+ " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        print(0,arr); //we give the value of i here 
    }
}
    

