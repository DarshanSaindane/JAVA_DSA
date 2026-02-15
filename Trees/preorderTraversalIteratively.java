import java.util.*;
public class preorderTraversalIteratively{
    public static void solution(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root!=null){
            st.push(root);
        }
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.val);
            if(top.right!=null){
                st.push(top.right);
            }
            if(top.left!=null){
                st.push(top.left);
            }
        }
        System.out.print(ans);
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        solution(a);
    }
}