package lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyArraylist<Integer> mal = new MyArraylist<>();

        for (int i = 0; i < 1000000; i++) {
            mal.add(random.nextInt(100000));
        }

        System.out.println("array is created!");

        System.out.println("start selection sort");
        long a = System.currentTimeMillis();
        mal.selectionSort();
        long split = System.currentTimeMillis();
        System.out.println("Time for selectionSort: "+ (split-a));
//
//        System.out.println("Start insertion sort");
//        long a1 = System.currentTimeMillis();
//        mal.insertionSort();
//        long split1 = System.currentTimeMillis();
//        System.out.println("Time for insertionSort: "+ (split1-a1));
//
//        System.out.println("Start bubble sort");
//        long a2 = System.currentTimeMillis();
//        mal.bubbleSort();
//        long split2 = System.currentTimeMillis();
//        System.out.println("Time for bubbleSort: "+ (split2-a2));

        System.out.println(mal.find(9));

    }
}