package BinarySearchTree;

public class DeleteaNode {
     static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
      public static Node Insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
            root.left = Insert(root.left, val); // ✅ Correct: insert into left subtree
        } else {
            root.right = Insert(root.right, val); // ✅ Correct: insert into right subtree
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return Search(root.left, key); // ✅ Search in left subtree
        } else {
            return Search(root.right, key); // ✅ Search in right subtree
        }
    }
 public static Node Delete(Node root,int val){
    if(root.data<val){
        root.right=Delete(root.right, val);
    }else if(root.data>val){
        root.left=Delete(root.left, val);
    }else{
        //leaf node case1
        if(root.left==null&&root.right==null){
            return null;
        }
        //case2- one child
          if(root.left==null){
            return root.right;
          }else if(root.right==null){
            return root.left;
          }
        //case-3 two child
        Node IS= findInorderSuccessor(root.right);
        root.data=IS.data;
        root.right=Delete(root.right, IS.data);
          }
          return root;
    }
    public static Node findInorderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;
        }return root;
    }
    
 
    public static void main(String[] args) {
        int values[] = {8,5, 1, 3, 4, 6,10,11,14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
       Delete(root, 1);
       System.out.println();
       inorder(root);
    }

}