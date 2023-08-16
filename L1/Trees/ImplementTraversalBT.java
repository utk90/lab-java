package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ImplementTraversalBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner scn = new Scanner(System.in);

    static Node buildTree(Node root) {
        System.out.print("Enter data ");
        int data = scn.nextInt();
        root = new Node(data);

        if (data == -1) {
            return null;
        }

        root.data = data;

        System.out.println("Enter data for left node");
        root.left = buildTree(root.left);
        System.out.println("Enter data for right node");
        root.right = buildTree(root.right);

        return root;
    }

    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        // ArrayList<ArrayList<Node>> arr = new ArrayList<>();
        List<List<Node>> resArr = new ArrayList<>();
        queue.add(root);

        while (queue.size() > 0) {
            int currSize = queue.size();
            List<Node> currLevel = new ArrayList<>();

            for (int i = 0; i < currSize; i++) {
                Node leftNode = queue.peek().left;
                Node rightNode = queue.peek().right;
                if (leftNode != null) {
                    queue.add(leftNode);
                }
                if (rightNode != null) {
                    queue.add(rightNode);
                }
                currLevel.add(queue.remove());
            }
            resArr.add(currLevel);
        }

        for (List<Node> arr : resArr) {
            for (Node sub : arr) {
                System.out.print(sub.data + " ");
            }
            System.out.println();
        }
    }

    // LNR
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // NLR
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // LRN
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = null;
        root = buildTree(root);

        System.out.println("LEVEL ORDER--------");
        levelOrder(root);
        System.out.println("INORDER--------");
        inorder(root);
        System.out.println();
        System.out.println("PREODER--------");
        preorder(root);
        System.out.println();
        System.out.println("POSTORDER--------");
        postorder(root);
    }
}