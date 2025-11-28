package Binarytree;

public class CountOfNodes {
    static class Node {
    
        int data;
         Node left,right;
         public Node(int data){
             this.data=data;
            this.left=null;
            this.right=null;
         }
        
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        int treecount= lc+rc+1;
        return treecount;
    }

     public static void main(String[] args) {
        /*
               1
             /   \
            2     3
           /  \   / \
          4    5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       System.out.println(count(root));
    }
}
