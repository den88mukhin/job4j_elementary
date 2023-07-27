package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int index = 0; index < array.length; index++) {
            System.out.println("Размер вложенного массива равен: " + array[index].length);
        }
    }
}
