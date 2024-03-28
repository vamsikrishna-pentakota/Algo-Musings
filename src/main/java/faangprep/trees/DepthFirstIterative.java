package faangprep.trees;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstIterative {
    public static void main(String[] args) {
        // Aggressively explore nodes down the Tree in a chosen direction
        // Once a leaf node is reached, track back upwards and then move breadth wise
        // Implementation : Using a STack in an iterative fashion
        ArrayList<Character> traversalRoute = new ArrayList<>();
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createBinaryTree();
        Stack<Node> dfsStack = new Stack<>();
        //Feed the stack with the root Node, Initially
        dfsStack.push(root);

        while(!dfsStack.isEmpty()){
            Node currNode = dfsStack.pop();
            if(currNode.left != null) dfsStack.push(currNode.left);
            if(currNode.right != null) dfsStack.push(currNode.right);
            traversalRoute.add(currNode.value);
        }
        System.out.println("The DFS travel route is : " + traversalRoute);
    }
}
