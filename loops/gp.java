package loops;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the nth term of the GP: ");
        int n = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();

        for(int i=1;i<=n;i++){
        System.out.println(a);
        a=a*r;
        }

    }
    
}
