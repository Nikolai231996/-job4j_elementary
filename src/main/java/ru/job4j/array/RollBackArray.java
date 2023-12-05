package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastindex = array[array.length - index - 1];
            int currentindex =  index;
            result[currentindex] = lastindex;
        }
        return result;
    }
}

