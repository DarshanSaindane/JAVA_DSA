
import java.util.Scanner;
public class inputStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();   // here we only write next but the problem is if we give string like 
                                      // "darshan saindane" then compiler only conceder darshan not the saindane for the concedering whole string we have to give nextLine.
       
        System.out.print("Hi " + str);
        


        
    }
    
}
