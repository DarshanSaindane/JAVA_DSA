package Conditionals;
import java.util.Scanner;
public class orOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%5==0 || n%3==0)
        System.out.println("Number is divisible by 5 or 3");
        else
        System.out.println("number is not divisible by 5 or 3"); {
            
        }
    }
    
}
