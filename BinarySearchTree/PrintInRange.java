package BinarySearchTree;

public class PrintInRange {
      static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node Insert(Node root,int val){
 if(root==null){
    root=new Node(val);
    return root;
 }
    if(root.data>val){
       root.left=  Insert(root.left, val);
    }else{
        root.right=Insert(root.right, val);
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
public static void PrintinRange(Node root,int k1,int k2){
    if(root==null){return;}
    if(root.data>=k1&&root.data<=k2){
        PrintinRange(root.left, k1, k2);
        System.out.println(root.data+" ");
        PrintinRange(root.right, k1, k2);
    }else if(root.data>k2){
        PrintinRange(root.right, k1, k2);
    }else{
        PrintinRange(root.left, k1, k2);
    }
}
 public static void main(String[] args) {
        int values[] = {8,5, 1, 3, 4, 6,10,11,14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
      PrintinRange(root, 5, 12);
    }
}
