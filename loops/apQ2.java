package loops;

import java.util.Scanner;

public class apQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=4;i<=3*n+1;i=i+3)
        System.out.println(i);
    }
    
}
