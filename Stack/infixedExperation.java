// Evaluate infixed using stack:
// for this we need two stack 1) Number stack and 2)Character stack.
// *RULES*
// 1)if Characteris a Number,push it in nunmber stack.
// 2)if Character is operator
//    a> if operator stack is emprty,then push it in operator stack
//    b>if operator stackis not empty,then we see operator on operator
//      on top of operator stack if its precedence is >= current
//      operator , then we first complite operation for operator on top of
//      of stack and then push the current operator.
// 3)Till operator stack is not empty {
//     v2 = numst.pop();
//     v1 = numst.pop();
//     op = opst.pop();
//     r = v1+v2;
//     numst.push(r);
//  } 
import java.util.Stack;
public class infixedExperation{
    public static void main(String[] args){
        String str ="8+(5+3)*(4/6)";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>= 48 && ascii<=57){
                val.push(ascii -48);
            }
            else if(op.size() == 0 || op.peek() =='(' || ch == '(' ){
                op.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() == ')'){
                    //do the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch == '+' || ch =='-'){
                    //we will always have to do operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                    }
                    else op.push(ch);
                }


            }
        }
        while(val.size() > 1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();

        }
        System.out.println(val.peek());
    }

}