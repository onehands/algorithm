package tree.binarytree;

/**
 * Created by lei on 2017/9/16.
 */
public class BinaryTree {
    private Node rootNode;

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "rootNode=" + rootNode +
                '}';
    }
}


