package day_010;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node() {}

    // для создания узла с определенным значением
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

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

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + left +
                ", rightChild=" + right +
                '}';
    }
}
