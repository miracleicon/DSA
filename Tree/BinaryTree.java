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
  static void PreOrder(Node node) {
        if (node == null) {
            return;
        }
    System.out.print(node.data + " ");
    PreOrder(node.left);
    PreOrder(node.right);
    }

  static void PostOrder(Node node) {
        if (node == null) {
            return;
        }
PostOrder(node.left);
    PostOrder(node.right);
    System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(6);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        System.out.print("In-order DFS: ");
        inOrder(firstNode);
       System.out.println();
      
      System.out.print("Pre-order DFS: ");
        PreOrder(firstNode);
       System.out.println();
      
      System.out.print("Post-order DFS: ");
        PostOrder(firstNode);
       System.out.println();
      
    }
}
