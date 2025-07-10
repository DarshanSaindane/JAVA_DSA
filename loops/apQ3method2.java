package loops;

import java.util.Scanner;

public class apQ3method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term: : ");
        int n = sc.nextInt();
        System.out.print("Enter the common differnce: ");
        int d = sc.nextInt();
        System.out.println("enter the first term: ");
        int a = sc.nextInt();
        for(int i =1;i<=n;i++){
        System.out.println(a);
        a=a+d;
        }

    }
    
}
