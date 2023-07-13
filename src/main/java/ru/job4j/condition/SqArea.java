package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println(result);
        result = SqArea.square(6, 2);
        System.out.println(result);
    }
}
