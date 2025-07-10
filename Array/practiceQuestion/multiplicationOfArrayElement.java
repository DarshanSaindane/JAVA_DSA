package Array.practiceQuestion;

public class multiplicationOfArrayElement {
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6};
        int n= arr.length;
        int mul= 1;
    for(int i=0;i<n;i++){
        mul = mul*arr[i];
    }
    System.out.println(mul);
    }
    
}
