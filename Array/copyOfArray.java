

import java.util.Arrays;
import java.util.Scanner;

public class copyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={10,20,30,40,50};
    for(int ele : arr ){
           System.out.println(ele + " ");
    }
    System.out.println();

    int[]brr= Arrays.copyOf(arr,arr.length);
     for(int ele:brr){
        System.out.println(ele + " ");
     }

    }
    
}
