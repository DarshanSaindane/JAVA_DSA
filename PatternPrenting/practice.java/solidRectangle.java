import java.util.Scanner;
public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) { //rows
            for(int j=0;j<=col;j++){     //coloums
                System.out.print(j + " ");
            }
            System.out.println();

            
        }
    }
    
}
