package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // задание 1

        int[] weights = new int[3];
        weights[0] = 10;
        weights[1] = 15;
        weights[2] = 20;
        float[] height = {1.57f, 7.654f, 9.986f};
        int[] date = {1991, 1992, 1993};

        // задание 2

        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1)
                System.out.print(weights[i]);
            else System.out.print(weights[i] + ",");
        }
        System.out.println();
        for (int j = 0; j < height.length; j++) {
            if (j == height.length - 1)
                System.out.print(height[j]);
            else System.out.print(height[j] + ",");
        }
        System.out.println();
        for (int d = 0; d < date.length; d++) {
            if (d == date.length - 1)
                System.out.print(date[d]);
            else System.out.print(date[d] + ",");
        }
        // задание 3

        System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == 0)
                System.out.print(weights[i]);
            else System.out.print(weights[i] + ",");
        }
        System.out.println();
        for (int j = height.length - 1; j >= 0; j--) {
            if (j == 0)
                System.out.print(height[j]);
            else
                System.out.print(height[j] + ",");
        }
        System.out.println();
        for (int d = date.length - 1; d >= 0; d--) {
            if (d == 0)
                System.out.print(date[d]);
            else
                System.out.print(date[d] + ",");
        }

        // задание 4

        int[] even = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int e = 0; e < even.length; e++) {
            if (even[e] % 2 != 0)
                even[e] = even[e] + 1;
            System.out.println(even[e]);
        }

    }

}