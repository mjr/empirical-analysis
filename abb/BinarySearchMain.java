package abb;

import java.util.Random;

public class BinarySearchMain {
    public static final int SIZE = 1_000;
    BinarySearchTree abb = new BinarySearchTree();

    public void insertOne() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            abb.insert(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | insert (1): " + durationInMillis + "ms");
    }

    public void searchOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            abb.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | search (1): " + durationInMillis + "ms");
    }

    public void removeOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            abb.remove(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | remove (1): " + durationInMillis + "ms");
    }

    public void insertTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            int value;
            while (true) {
                value = new Random().nextInt(SIZE * 2) + 1;
                if (!abb.search(value))
                    break;
            }
            abb.insert(value);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | insert (2): " + durationInMillis + "ms");
    }

    public void searchTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            abb.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | search (2): " + durationInMillis + "ms");
    }

    public void removeTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            abb.remove(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Binary Search Tree | remove (2): " + durationInMillis + "ms");
    }

    public void testAbbOne() {
        insertOne();
        searchOne();
        removeOne();
    }

    public void testAbbTwo() {
        insertTwo();
        searchTwo();
        removeTwo();
    }
}
