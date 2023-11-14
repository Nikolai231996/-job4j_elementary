package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = 0; i  <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 3));
        System.out.println(sum(0, 2));
        System.out.println(sum(3, 5));
    }
}
