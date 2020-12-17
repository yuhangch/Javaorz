package ch.yuhang.templates.quizzes;

import ch.yuhang.templates.Node;
import sun.jvm.hotspot.memory.StringTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Yuhang Chen
 * @date 2020/12/17
 */

public class SolutionBTreeOrder {
    public static List<Integer> result = new ArrayList<>();

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.getValue());
            stack.push(node.getRight());
            stack.push(node.getLeft());

        }
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        Node head = root;
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.getLeft();
            } else {
                head = stack.pop();
                result.add(head.getValue());
                head = head.getRight();
            }
        }
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);
            if (node.getLeft() != null) {
                stack1.push(node.getRight());
            }
            if (node.getRight() != null) {
                stack1.push(node.getRight());
            }
        }
        for (Node n :
                stack2) {
            result.add(n.getValue());
        }
    }
}
