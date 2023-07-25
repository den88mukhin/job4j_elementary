package ru.job4j.array;

public class Square {
    public  static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int index = 0; index < bound; index++) {
            rsl[index] = index * index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
