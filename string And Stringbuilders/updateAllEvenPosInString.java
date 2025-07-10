
import java.util.Scanner;
public class updateAllEvenPosInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the strings");
        String s = sc.nextLine();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0) {
                str = str + 'a';
                
            }
            else{
                str = str + s.charAt(i);
            }
            
        }
        System.out.println(str);
        
    }
    
}
