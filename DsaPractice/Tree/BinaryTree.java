package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
class Node {
    int data;
    Node left;
    Node right;
    public Node(int value){
        this.left = null;
        this.right = null;
        this.data = value;
    }
}
    Node root;
    void insert( int key)
    {
        Node newNode = new Node(key);
        Node temp = root;
        if (temp == null) {
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            }
            else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = newNode;
                break;
            }
            else
                q.add(temp.right);
        }
    }

    //print tree in preorder
    private void preOrderTraverse(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    public void preOrderTraverse(){
        preOrderTraverse(root);
    }

    //print tree in post order
    private void postOrderTraverse(Node root){
        if(root==null)
            return;

        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.data+" ");
    }
    public void postOrderTraverse(){
        postOrderTraverse(root);
    }

    private void InOrderTraverse(Node root){
        if(root==null)
            return;

        InOrderTraverse(root.left);
        System.out.print(root.data+" ");
        InOrderTraverse(root.right);
    }
    public void InOrderTraverse(){
        InOrderTraverse(root);
    }

}
