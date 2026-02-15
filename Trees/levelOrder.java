import java.util.*;
public class levelOrder{
    public static class pair {
        Node node;
        int level;
        pair(Node node , int level ){
            this.level = level;
            this.node = node;
        }
    }
    public static void level(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            // left to right printing
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            

            // right to left Printing
            //  if(front.right!=null) q.add(front.right);
            //  if(front.left!=null) q.add(front.left);


            
        }
        System.out.println();
    }

    public static void levels(Node root){
        int prelevel = 0;
        Queue<pair> q = new LinkedList<>();
        if(root!=null) q.add(new pair(root,0));
        while(q.size()>0){
            pair front = q.remove();
            int lvl = front.level;
            Node temp = front.node;
            if(lvl!=prelevel){
                System.out.println();
                prelevel++;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null){
                q.add(new pair(temp.left,lvl+1));
            }
            if(temp.right!=null){
                q.add(new pair(temp.right,lvl+1));
            }
        }
        System.out.println();

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

        System.out.print("Leve vise printhig : ");
        level(a);
        levels(a);
    }
}