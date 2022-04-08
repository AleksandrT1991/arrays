package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // задание 1

        int[] weights = new int[] {10, 15, 20};
        float[] height = {1.57f, 7.654f, 9.986f};
        int[] date = {1991, 1992, 1993};

        // задание 2

        for (int i = 0; weights.length <= 20; i++) {
            System.out.println(weights[0] + "," + weights[1] + "," + weights[2]);
            if (i == 20);
            break;
        }
        for (float j = 0; height.length < 10; j++) {
            System.out.println(height[0] + "," + height[1] + "," + height[2]);
             if (j < 10);
              break;
        }
        for (int d = 0; date.length < 1995; d++) {
            System.out.println(date[0] + "," + date[1] + "," + date[2]);
            if (d == 2000);
            break;
        }
        // задание 3
        for (int i = 20; weights.length >= 0; i--) {
            System.out.println(weights[2] + "," + weights[1] + "," + weights[0]);
            if (i >= 0);
            break;
        }
        for (float j = 10; height.length >= 0; j--) {
            System.out.println(height[2] + "," + height[1] + "," + height[0]);
            if (j >= 0);
            break;
        }
        for (int d = 1995; date.length >= 0; d++) {
            System.out.println(date[2] + "," + date[1] + "," + date[0]);
            if (d >= 0);
            break;
        }

        // задание 4

        int[] even = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < even.length; i++) {
        if (even[i] % 2 != 0)
        even[i] = even[i] + 1;
            System.out.println(even[i]);


        }


    }
}
