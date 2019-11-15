import abb.BinarySearchMain;
import avl.AVLMain;
import arn.RedBlackMain;

public class Main {
    public static final int SIZE = 1_000;

    public static void main(String[] args) {
        System.out.println("Análise empírica para " + SIZE + " entradas.");
        System.out.println("-----");

        BinarySearchMain abb = new BinarySearchMain(SIZE);
        AVLMain avl = new AVLMain(SIZE);
        RedBlackMain arn = new RedBlackMain(SIZE);

        abb.testAbbOne();
        avl.testAvlOne();
        arn.testArnOne();

        abb.testAbbTwo();
        avl.testAvlTwo();
        arn.testArnTwo();
    }
}
