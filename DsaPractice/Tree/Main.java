package Tree;

public class Main{
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(3);
        tree.insert(2);

        tree.insert(1);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);

        tree.preOrderTraverse();
        System.out.println();
        tree.postOrderTraverse();
        System.out.println();
        tree.InOrderTraverse();



    }
}
