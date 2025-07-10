
import java.util.Scanner;
public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m colums & n rows: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i=1;i<=m;i++){ //rows
            for(int j=1;j<=n;j++){ //coloum3
                System.out.print("* ");
                }
                System.out.println();
        }
        
        

     
    }
    
}
