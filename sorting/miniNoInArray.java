public class miniNoInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,8,2,1};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int mindx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]< min) {
                min = arr[i];
                mindx = i;
            }
        }
        System.out.println(min+ " " +mindx);
    }
    
}
