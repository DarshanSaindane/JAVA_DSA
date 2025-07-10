
import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // StringBuilder sb = new StringBuilder(s);    //this is the one method to take input in string builder.
        // System.out.println(sb);

    //And another method is 
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.setCharAt(2, 'g');
        System.out.println(sb);

        // The important cancept in StringBilder is we can change the particular 
        // charector at the particular index by using 
        // Syntax:- stringName.setCharAt(indexNO , 'charector');

    }
    
}
