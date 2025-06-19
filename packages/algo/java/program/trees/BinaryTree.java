package packages.algo.java.program.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private void addToTree(int element) {
        TreeNode newNode = new TreeNode(element);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.offer(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                return;
            } else
                queue.offer(current.right);
        }
    }

    private void deleteNode(int key) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (root.data == key) root = null;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode keyNode = null;
        TreeNode current = null;
        TreeNode parentOfDeepest = null;

        while (!queue.isEmpty()) {
            current = queue.poll();

            if (current.data == key) {
                keyNode = current;
            }

            if (current.left != null) {
                parentOfDeepest = current;
                queue.offer(current.left);
            }

            if (current.right != null) {
                parentOfDeepest = current;
                queue.offer(current.right);
            }
        }

        if (keyNode != null) {
            keyNode.data = current.data; // Replace data
            // Delete deepest node
            if (parentOfDeepest.right == current)
                parentOfDeepest.right = null;
            else
                parentOfDeepest.left = null;
        }
    }


    public void preOrderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public void postOrderTraversal(TreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addToTree(10);
        tree.addToTree(30);
        tree.addToTree(40);
        tree.addToTree(50);
        tree.addToTree(60);
        tree.addToTree(70);
        tree.addToTree(80);
        System.out.println("Preorder Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nInorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPostorder Traversal: ");
        tree.postOrderTraversal(tree.root);

    }


}
