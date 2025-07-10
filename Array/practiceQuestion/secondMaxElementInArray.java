package Array.practiceQuestion;

public class secondMaxElementInArray {
    public static void main(String[] args) {
        int[]arr={56,6,9,1,44,7,8,1,414,14};
        int n = arr.length;
        int max=arr[0];
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++) {
           if (arr[i]!=max && arr[i]>smax) {
                smax=arr[i];
           }
        }
        System.out.println("Max numbar is : "+max);
        System.out.print("second max number is : "+smax);
    }
    
}
