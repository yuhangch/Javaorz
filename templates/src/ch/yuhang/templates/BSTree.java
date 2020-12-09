package ch.yuhang.templates;

public class BSTree {
    private Node root;

    public void insert(int key) {
        Node p = root;
        Node prev = null;

        while (p != null) {
            prev = p;
            if (key < p.getValue()) {
                p = p.getLeft();
            } else if (key > p.getValue()) {
                p = p.getRight();
            } else {
                return;
            }

        }

        if (root == null) {
            root = new Node(key);
        } else if (key < prev.getValue()) {
            prev.setLeft(new Node(key));
        } else {
            prev.setRight(new Node(key));
        }
    }

    public void delete(int key) {
        delete(root, key);
    }

    public boolean delete(Node node, int key) {
        if (node == null) {
            return false;
        } else if (key == node.getValue()) {
            return delete(node);
        } else if (key < node.getValue()) {
            return delete(node.getLeft(), key);
        } else {
            return delete(node.getRight(), key);
        }
    }

    public boolean delete(Node node) {

        if (node.getRight() == null) {
            node = node.getLeft();
        } else if (node.getLeft() == null) {
            node = node.getRight();
        } else {
            Node temp = node;
            Node s = node.getLeft();
            while (s.getRight() != null) {
                temp = s;
                s = s.getRight();
            }
            node.setValue(s.getValue());


        }
        return true;

    }
}
