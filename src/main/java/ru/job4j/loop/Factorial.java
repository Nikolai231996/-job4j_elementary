package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int a = 1; a  <= n; ++a) {
          result = result * a;
        }
        return result;
    }
}

