package Array;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.print("Enter the targeted element: ");
        int x = sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           boolean k = false; // false means not fund
        for(int i=0;i<n;i++){
            if(x==arr[i]){
               k = true;       // true means found
               break;
            }
        }
        if (k==true) {
            System.out.println("Element found");
            
        }
        else{
            System.out.println("Element not found");
        }
        

    }

    
}
