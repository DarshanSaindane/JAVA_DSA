import java.util.Scanner;

public class totalNoOfDigitInNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Enter teh no. : ");
        int n = sc.nextInt();
       // s = s+n;
        String t = Integer.toString(n); //Build in function
        System.out.println(s);
        System.out.println(t.length());

    }


    
}
