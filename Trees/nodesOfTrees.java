class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class nodesOfTrees{
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(0);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(a.left.right.val);
        display(a);
        System.out.println();
        System.out.println(sum(a));
    }
    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
       
    }

    public static int sum(Node root){
      
        if(root == null || root.val == 0){
            return 1;
        }
        return root.val * sum(root.left) * sum(root.right);
       
    
    }


}