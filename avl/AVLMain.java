package avl;

import java.util.Random;

import misc.Pessoa;

public class AVLMain {
    public static final int SIZE = 1_000;
    AVLTree<Pessoa> avl = new AVLTree<>();

    public void insertOne() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            avl.insert(new Pessoa(i));
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | insert (1): " + durationInMillis + "ms");
    }

    public void searchOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            avl.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | search (1): " + durationInMillis + "ms");
    }

    public void removeOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            avl.remove(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | remove (1): " + durationInMillis + "ms");
    }

    public void insertTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            int value;
            while (true) {
                value = new Random().nextInt(SIZE * 2) + 1;
                if (avl.search(value) == null)
                    break;
            }
            avl.insert(new Pessoa(value));
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | insert (2): " + durationInMillis + "ms");
    }

    public void searchTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            avl.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | search (2): " + durationInMillis + "ms");
    }

    public void removeTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            avl.remove(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("AVL Tree | remove (2): " + durationInMillis + "ms");
    }

    public void testAvlOne() {
        insertOne();
        searchOne();
        removeOne();
    }

    public void testAvlTwo() {
        insertTwo();
        searchTwo();
        removeTwo();
    }
}
