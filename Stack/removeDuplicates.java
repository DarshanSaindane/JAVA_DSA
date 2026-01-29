import java.util.Scanner;
import java.util.Stack;

public class removeDuplicates{
    public static String Remove(String ch){
        Stack<Character> st =  new Stack<>();

        for(char c: ch.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                 sb.append(st.pop());
            }
            return sb.reverse().toString();
               
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the string: ");
       String op = sc.nextLine();   

      System.out.println(Remove(op));
    }
}