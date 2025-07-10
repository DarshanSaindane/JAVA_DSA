

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input --> loop 
    System.out.print("Enter arra element: ");
    for(int i=1;i<=n-1;i++){
        arr[i] = sc.nextInt();
    }
    //output--> loop
    System.out.print("The array elements are: ");
    for(int i=1;i<=n-1;i++){
        System.out.print(arr[i] + " ");
    }
    }
    
    
}
