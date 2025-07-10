
import java.util.Scanner;
public class printDecressingNo {
    public static void print(int n){
        int ans;
       if(n==0) return;
       System.out.println(n);
       print(n-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        print(n);
        
    }
    
}
