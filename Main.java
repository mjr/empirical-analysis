import abb.BinarySearchMain;
import avl.AVLMain;
import arn.RedBlackMain;

public class Main {
    public static void main(String[] args) {
        BinarySearchMain abb = new BinarySearchMain();
        AVLMain avl = new AVLMain();
        RedBlackMain arn = new RedBlackMain();

        abb.testAbbOne();
        avl.testAvlOne();
        arn.testArnOne();

        abb.testAbbTwo();
        avl.testAvlTwo();
        arn.testArnTwo();
    }
}
