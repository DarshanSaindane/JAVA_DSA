import java.util.Scanner;

public class nthSteir {
    public static int steir(int n){
        if (n==1) return 1;
        if (n==2) return 1;
        if (n==3) return 3;
        
        return steir(n-1) + steir(n-3);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = sc.nextInt();
    System.out.println(steir(n));
   }
}
