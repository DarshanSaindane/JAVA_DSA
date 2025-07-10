package Conditionals;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%5==0)
        System.out.println("number is divisible by five"); 
        else
            System.out.println("number is not divisible by five");
        
    }
    
}
