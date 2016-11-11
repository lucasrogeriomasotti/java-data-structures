package data_structures.binary_tree;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;


public class BinaryTree {
    private TreeNode root;

    public enum TraversalType {
        PRE_ORDER, IN_ORDER, POST_ORDER;
    }

    public BinaryTree() {
        root = null;
    }

    public void add(NodeValue value) {
        add(root, value);
    }

    public void add(Integer integer) {
        add(root, new NodeValue(integer));
    }

    public void add(String integer) {
        add(root, new NodeValue(integer));
    }

    private void add(TreeNode node, NodeValue value) {
        if(root == null) {
            root = new TreeNode(value);
        } else {
            if(value.compareTo(node.getValue()) < 0){
                if(node.getLeftNode() != null) {
                    add(node.getLeftNode(), value);
                } else {
                    node.setLeftNode(new TreeNode(value));
                }
            } else if (value.compareTo(node.getValue()) > 0) {
                if(node.getRightNode() != null) {
                    add(node.getRightNode(), value);
                } else {
                    node.setRightNode(new TreeNode(value));
                }
            }
        }
    }


    public List<NodeValue> traverse(TraversalType type) {
        List<NodeValue> list = new ArrayList<>();

        switch(type) {
            case PRE_ORDER:
                preOrder(root, list);
                break;
            case IN_ORDER:
                inOrder(root, list);
                break;
            case POST_ORDER:
                postOrder(root, list);
                break;
            default:
                throw new IllegalArgumentException("Traversal Type not supported");
        }
        return list;
    }


    private void preOrder(TreeNode node, List<NodeValue> list) {
        if(node != null){
            list.add(node.getValue());
            preOrder(node.getLeftNode(), list);
            preOrder(node.getRightNode(), list);
        }
    }

    private void inOrder(TreeNode node, List<NodeValue> list) {
        if(node != null){
            preOrder(node.getLeftNode(), list);
            list.add(node.getValue());
            preOrder(node.getRightNode(), list);
        }
    }

    private void postOrder(TreeNode node, List<NodeValue> list) {
        if(node != null){
            preOrder(node.getLeftNode(), list);
            preOrder(node.getRightNode(), list);
            list.add(node.getValue());
        }
    }

}
