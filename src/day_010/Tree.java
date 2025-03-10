package day_010;

public class Tree {
    private Node rootNode; // корневой узел

    public Tree() {
        rootNode = null; // изначально пустое дерево
    }

    public Node getRootNode() {
        return rootNode; // геттер для корневого узла
    }

    public void addNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);

        // если корневой узел не существует
        if (rootNode == null) {
            rootNode = newNode; // если его нет — новый элемент и есть корневой
        } else {
            Node currentNode = rootNode; // начинаем с корня
            Node parentNode;
            while (true) {
                parentNode = currentNode; // сохраняем родителя
                if (value == currentNode.getValue()) {
                    return; // если значение уже существует, ничего не делаем
                } else if (value < currentNode.getValue()) { // движение влево
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) { // если нашли место для нового узла
                        parentNode.setLeft(newNode); // устанавливаем узел как левого потомка
                        return;
                    }
                } else {
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parentNode.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    static void printTree(Node root) {
        printSubtree(root, 0);
    }

    static void printSubtree(Node node, int space) {
        if (node == null) return;
        space += 10;
        printSubtree(node.getRight(), space);
        System.out.print("\n");
        for (int i = 10; i < space; i++) System.out.print(" ");
        System.out.print(node.getValue() + "\n");
        printSubtree(node.getLeft(), space);
    }
}
