package Conditionals;
import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter the y co-ordinate: ");
        int y = sc.nextInt();

        if (x>0 && y>0) 
        System.out.print("Opint is in first quadrant");
        else if (x>0 && y<0)
        System.out.println("Opint is in second quadrant ");
        else if (x<0 && y<0) 
        System.out.println("Opint is in third quadrant");
        else if (x<0 && y>0) 
        System.out.println("Opint is in forth quadrant");
        else 
        System.out.println("Opint on origin");            
        
            
        
            
        
    }
    

}
