import java.util.Scanner;

public class sunOfNumbers {
    public static void sum(int n , int s){
        if (n == 0) {
            System.out.println("The sum of the given range of number is : " + s);
            return;
        }
         sum(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sum(n,0); // here we give '0' as a parameter because it is the initial value of (int s)
    }
}
