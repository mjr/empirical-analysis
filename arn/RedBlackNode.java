package arn;

class RedBlackNode<ValueType extends Comparable> {
    public static final int BLACK = 0;
    public static final int RED = 1;

    public ValueType key;
    RedBlackNode<ValueType> parent;
    RedBlackNode<ValueType> left;
    RedBlackNode<ValueType> right;
    public int numLeft = 0;
    public int numRight = 0;
    public int color;

    public RedBlackNode() {
        color = BLACK;
        numLeft = 0;
        numRight = 0;
        parent = null;
        left = null;
        right = null;
    }

    public RedBlackNode(ValueType key) {
        this();
        this.key = key;
    }
}