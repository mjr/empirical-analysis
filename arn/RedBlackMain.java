package arn;

import java.util.Random;

public class RedBlackMain {
    RedBlackTree arn = new RedBlackTree();
    public int SIZE;

    public RedBlackMain(int SIZE) {
        this.SIZE = SIZE;
    }

    public void insertOne() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arn.insert(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | insert (1): " + durationInMillis + "ms");
    }

    public void searchOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            arn.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | search (1): " + durationInMillis + "ms");
    }

    public void removeOne() {
        long startTime = System.currentTimeMillis();

        for (int i = SIZE - 1; i >= 0; i--) {
            arn.remove(arn.search(i));
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | remove (1): " + durationInMillis + "ms");
    }

    public void insertTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            int value;
            while (true) {
                value = new Random().nextInt(SIZE * 2) + 1;
                if (arn.search(value) == null)
                    break;
            }
            arn.insert(value);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | insert (2): " + durationInMillis + "ms");
    }

    public void searchTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            arn.search(i);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | search (2): " + durationInMillis + "ms");
    }

    public void removeTwo() {
        long startTime = System.currentTimeMillis();

        for (int i = (SIZE * 2) - 1; i >= 0; i--) {
            RedBlackNode n = arn.search(i);
            if (n != null)
                arn.remove(n);
        }

        long endTime = System.currentTimeMillis();
        long durationInMillis = (endTime - startTime);

        System.out.println("Black Red Tree | remove (2): " + durationInMillis + "ms");
    }

    public void testArnOne() {
        insertOne();
        searchOne();
        removeOne();
    }

    public void testArnTwo() {
        insertTwo();
        searchTwo();
        removeTwo();
    }
}
