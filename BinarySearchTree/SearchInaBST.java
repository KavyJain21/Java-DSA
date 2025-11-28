/*package BinarySearchTree;

public class SearchInaBST {
     static class Node {
      int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public static Node Insert(Node root,int val){
 if(root==null){
    root=new Node(val);
    return root;
 }
    if(root.data>val){
       root.left=  Insert(root.right, val);
    }else{
        root.right=Insert(root.left, val);
    }
 return root;
} 
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
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

  
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(Search(root, 1)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}*/
package BinarySearchTree;

public class SearchInaBST {
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

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(Search(root, 1)){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
