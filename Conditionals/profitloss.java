package Conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();

        if (sp>cp) System.out.println("loss is" +(sp-cp)); 
        
        if (sp<cp) System.out.println("profit is" +(cp-sp));
        if (sp == cp) System.out.println("No profit on loss");

        

         
        

    } 
    
}
