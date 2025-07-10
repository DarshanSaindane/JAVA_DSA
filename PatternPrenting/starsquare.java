package PatternPrenting;
import java.util.Scanner;

public class starsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the side of square : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){ //row
            for(int j=1;j<=n;j++){ //col
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
    
}
