package faangprep.trees;

public class BinaryTree {

    public Node createBinaryTree() {
        // Create the Nodes with desired values
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');

        // Building the Binary Tree
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        //
        return a;
    }
}
