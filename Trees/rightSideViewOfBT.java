import java.util.*;
public class rightSideViewOfBT{
    public static int level(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void solution(Node root,int level, List<Integer> ans){
        if(root==null){
            return;
        }
        ans.set(level,root.val);
        solution(root.left,level+1,ans);
        solution(root.right,level+1,ans);
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
         
        List<Integer> ans = new ArrayList<>();
        int n = level(a);
        for(int i=0;i<n;i++){
            ans.add(0);
        }

        solution(a,0,ans);
        System.out.print(ans);
    }
}