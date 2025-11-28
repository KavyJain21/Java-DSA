package Binarytree;
import java.util.*;

public class TopViewOfTree {
     static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
     Node node;
     int hd;

     public Info(Node node,int hd){
        this.node=node;
        this.hd=hd;
     }
    }
    public static void TopView(Node root){
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map = new HashMap<>();
        int min=0, max=0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            
        }
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
      
    }
    
}