package Binarytree;

public class DiameterOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root) { // Approach 1
        if (root == null) {
            return 0;
        }
        int ldia = diameter(root.left);
        int rdia = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiameter = lh + rh + 1;
        return Math.max(selfDiameter, Math.max(ldia, rdia));
    }

    static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root) { // Approach 2 (optimized)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                                leftInfo.height + rightInfo.height + 1);

        return new Info(diameter, height);
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

        System.out.println("Diameter of the tree: " + diameter2(root).diameter);
    }
}