package data_structures.binary_tree;

public class TreeNode {
    private NodeValue value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode() { }

    public TreeNode(NodeValue value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public NodeValue getValue() {
        return value;
    }

    public void setValue(NodeValue value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}

