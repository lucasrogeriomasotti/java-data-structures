package data_structures.binary_tree;

public class NodeValue<T extends Comparable> implements Comparable<NodeValue> {
    private final T value;

    public NodeValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(NodeValue nodeValue) {
        return value.compareTo(nodeValue.getValue());
    }

    public T getValue() {
        return value;
    }

}
