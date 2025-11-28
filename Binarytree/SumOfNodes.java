package Binarytree;

public class SumOfNodes {
      static class Node {
    
        int data;
         Node left,right;
         public Node(int data){
             this.data=data;
            this.left=null;
            this.right=null;
         }
        
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        int treesum= ls+rs+root.data;
        return treesum;
    }

     public static void main(String[] args) {
        /*
               1
             /   \
            2     3
             \   / \
             5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       System.out.println(sum(root));
    }
}
