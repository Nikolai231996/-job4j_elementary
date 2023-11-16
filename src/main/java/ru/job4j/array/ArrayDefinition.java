package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Nikolya Ilin";
        names[1] = "Petr Butanov";
        names[2] = "Alex Vlasov";
        names[3] = "Egor Voronin";
        String years = names[0];
        String years1 = names[1];
        String years2 = names[2];
        String years3 = names[3];
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
