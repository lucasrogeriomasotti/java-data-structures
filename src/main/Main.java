package main;

import data_structures.binary_tree.BinaryTree;
import data_structures.binary_tree.NodeValue;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(36);
        binaryTree.add(31);
        binaryTree.add(55);
        binaryTree.add(40);
        binaryTree.add(5);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(1);

        List<NodeValue> preOrder = binaryTree.traverse(BinaryTree.TraversalType.PRE_ORDER);
        List<NodeValue> inOrder = binaryTree.traverse(BinaryTree.TraversalType.IN_ORDER);
        List<NodeValue> postOrder = binaryTree.traverse(BinaryTree.TraversalType.POST_ORDER);

        preOrder.stream().forEach(nodeValue -> System.out.print(nodeValue.getValue()));
        System.out.println("");
        inOrder.stream().forEach(nodeValue -> System.out.print(nodeValue.getValue()));
        System.out.println("");
        postOrder.stream().forEach(nodeValue -> System.out.print(nodeValue.getValue()));
    }
}
