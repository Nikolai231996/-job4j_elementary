package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
       for (int i = 0; i < left.length - 1; i++) {
           for (int j = 0; j < right.length - 1; j++) {
               return left[left.length - 1] == right[right.length - 1];
           }

                    return true;
        }
        return false;
    }
}


