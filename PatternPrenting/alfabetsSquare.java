package PatternPrenting;

import java.util.Scanner;

public class alfabetsSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+ " ");
            }   // Here we use type casting to conver number into askey value
            System.out.println();
        }
    }
    
}
