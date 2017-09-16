package tree.binarytree;

/**
 * Created by lei on 2017/9/16.
 */
public class BinaryTreeHandler {

    public static BinaryTree initBinaryTree(String value) {
        Node root = new Node();
        root.setData(value);

        BinaryTree tree = new BinaryTree();
        tree.setRootNode(root);
        return tree;

    }


    public static void addNode(Node node, String leftValue, String rightValue) {

        if (leftValue != null && leftValue.length() > 0) {
            Node left = new Node();
            left.setData(leftValue);
            node.setLeft(left);
        }
        if (rightValue != null && rightValue.length() > 0) {
            Node right = new Node();
            right.setData(rightValue);
            node.setRight(right);
        }
    }

    public static boolean findNodeDeep(Node node, String value, int deep) {
        if (node != null) {
            if (node.getData().equals(value)) {
                System.out.println("deep of " + value + " : " + deep);
                return true;
            }
            deep++;
            if (!findNodeDeep(node.getLeft(), value, deep)) {
                findNodeDeep(node.getRight(), value, deep);
            }
        }
        return false;
    }

    public static int getDeepOfTree(Node node, int deep) {
        int value = deep;
        if (node != null) {
            value++;
            int left = getDeepOfTree(node.getLeft(), value);
            int right = getDeepOfTree(node.getRight(), value);
            return left > right ? left : right;

        }
        return value;
    }

    public static void lnr(Node node) {
        if (node != null) {
            lnr(node.getLeft());
            System.out.print(node.getData());
            lnr(node.getRight());
        }

    }

    public static void lrn(Node node) {
        if (node != null) {
            lrn(node.getLeft());
            lrn(node.getRight());
            System.out.print(node.getData());

        }
    }

    public static void nlr(Node node) {
        if (node != null) {
            System.out.print(node.getData());
            nlr(node.getLeft());
            nlr(node.getRight());
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = initBinaryTree("A");

        addNode(tree.getRootNode(), "B", "C");
        addNode(tree.getRootNode().getLeft(), "E", "F");
        addNode(tree.getRootNode().getLeft().getLeft(), "G", "H");
        System.out.println(tree);
        findNodeDeep(tree.getRootNode(), "E", 0);
        System.out.println(getDeepOfTree(tree.getRootNode(), 0));
        System.out.println("先序遍历：");
        lnr(tree.getRootNode());
        System.out.println();
        System.out.println("后序遍历：");
        lrn(tree.getRootNode());
        System.out.println();
        System.out.println("中序遍历：");
        nlr(tree.getRootNode());
    }


}
