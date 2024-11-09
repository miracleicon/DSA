import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Create a new node with given data
    public Node createNode(int data) {
        return new Node(data);
    }

    // Preorder Traversal
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Inorder Traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Check if tree is a BST
    public boolean isBST(Node root) {
        return isBSTUtil(root, null, null);
    }

    // Utility function to check BST properties
    private boolean isBSTUtil(Node node, Node left, Node right) {
        if (node == null) return true;
        if (left != null && node.data <= left.data) return false;
        if (right != null && node.data >= right.data) return false;
        return isBSTUtil(node.left, left, node) && isBSTUtil(node.right, node, right);
    }

    // Iterative Search
    public Node searchIter(Node root, int key) {
        while (root != null) {
            if (key == root.data) {
                return root;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    // Insert a new node
    public void insert(int key) {
        if (root == null) {
            root = createNode(key);
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            prev = temp;
            if (key == temp.data) {
                System.out.println("Cannot insert " + key + " already in bst");
                return;
            } else if (key < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        Node newNode = createNode(key);
        if (key < prev.data) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        // Inserting nodes in the tree
        bst.root = bst.createNode(5);
        Node p1 = bst.createNode(3);
        Node p2 = bst.createNode(4);

        bst.root.left = p1;
        bst.root.right = p2;

        // Insert a new node
        bst.insert(16);

        // Print the inserted node if it exists
        if (bst.root.right != null && bst.root.right.right != null) {
            System.out.println("Inserted node data: " + bst.root.right.right.data);
        }
    }
}
