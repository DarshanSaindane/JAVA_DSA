

public class basicSorting {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,};
        int n = arr.length;
        Boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i+1] ) {
                flag = false;
            }
            
        }
        if (flag == true) System.out.println("sorted");
            else System.out.println("unsorted");
        
    }
    
}
