public class levelsOfTree{
    public static int levels(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(9);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println(levels(a));
    }

}