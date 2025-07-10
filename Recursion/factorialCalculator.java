
import java.util.Scanner;

public class factorialCalculator {
    public static int factorial(int n){
        int ans;
        if (n == 0 || n ==1) {
            return 1;
        }
        else{
            ans = n * factorial(n-1);
        }
       
       return ans;
    }
    public static void main(String[] args) {
        int m =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
