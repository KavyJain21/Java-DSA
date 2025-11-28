package BinarySearchTree;

import java.util.ArrayList;

public class BSTtoBalancedBST {
       static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=this.right=null;
        }

    }
    public static void preorder(Node root){
            if(root== null){
                return;
            }
            System.out.println(root.data+" ");
            preorder( root.left);
            preorder(root.right);
        }
        public static void getinorder(Node root,ArrayList<Integer>inorder){
        if(root == null){
            return;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }
     public static Node CreateBST( ArrayList<Integer>inorder,int start,int end){
            if(start>end){
                return null;
            }
            int mid=(start+end)/2;
            Node root = new Node(inorder.get(mid));
            root.left=CreateBST(inorder, start, mid-1);
            root.right=CreateBST(inorder, mid+1, end);
            return root;

        }
        public static Node BalancedBST(Node root){
          ArrayList<Integer>inorder=new ArrayList<>();
          getinorder(root, inorder);
          root= CreateBST(inorder, 0, inorder.size()-1);
          return root;
        }
              public static void main(String[] args) {
          Node root= new Node(8);
            root.left= new Node(6);
            root.left.left= new Node(5);
             root.left.left.left= new Node(3);
             root.right=new Node(10);
             root.right.right=new Node(11);
             root.right.right.right=new Node(12);
             root= BalancedBST(root);
             preorder(root);
        }
}
