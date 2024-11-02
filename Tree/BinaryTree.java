class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class binarytree {
    static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(6);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        System.out.print("In-order DFS: ");
        inOrder(firstNode); // यहाँ पर root की जगह firstNode को pass करें
    }
}
