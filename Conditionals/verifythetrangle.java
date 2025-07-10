package Conditionals;
import java.util.Scanner;
public class verifythetrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int a = sc.nextInt();
        System.out.println("Enter the second side: ");
        int b = sc.nextInt();
        System.out.println("enter the third number: ");
        int c = sc.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b) {
            System.out.println("trangle is valid");

            
        } else
        System.out.println("invalid trangle");


    }
    
}
