package Binarytree;

public class KthAncestorOfNode {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 1; // Start counting from 1
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max == k) {
            System.out.println("Kth ancestor is: " + root.data);
        }

        return max + 1;
    }

    public static void main(String[] args) {
        /*
               1
             /   \
            2     3
           / \   / \
          4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int targetNode = 5;
        int k = 2;
        KAncestor(root, targetNode, k);
    }
}
