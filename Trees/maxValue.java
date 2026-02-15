public class maxValue{
    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(min(root.right),min(root.left)));
    }

    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(max(root.right),max(root.left)));
    }

    public static int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(9);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(min(a));
        System.out.println(max(a));
        System.out.println(size(a));
    }
}