import java.util.*;
public class printNthLevelElement{
    static int n;
    public static void levelPrint(Node root,int level){
        if(root == null){
            return;
        }
        if(level==n){
            System.out.print(root.val + " ");
        }
        levelPrint(root.left,level+1);       
        levelPrint(root.right,level+1);

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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // n = sc.nextInt();
        //  levelPrint(a,0);

        //printing whole tree(level order) by anothe method 
        for(int i=0;i<=3;i++){
           n = i;
              levelPrint(a,0);
        }
       
    }
}