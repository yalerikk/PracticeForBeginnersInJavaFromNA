package day_010;

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNode(20);
        tree.addNode(14);
        tree.addNode(23);
        tree.addNode(11);
        tree.addNode(16);
        tree.addNode(5);
        tree.addNode(8);
        tree.addNode(15);
        tree.addNode(18);
        tree.addNode(22);
        tree.addNode(27);
        tree.addNode(24);
        tree.addNode(150);

        Tree.printTree(tree.getRootNode());
    }
}
