package tree.binarytree;

/**
 * Created by lei on 2017/9/16.
 */
public class Node {
    private Node left;
    private Node right;

    private String data;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", data='" + data + '\'' +
                '}';
    }
}
