import java.util.*;

public class balanceBrackets {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("Balanced ");
        } else {
            System.out.println("Not Balanced ");
        }

        sc.close();
    }
}
