package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // задание 1
//        int[] weights = new int[3];
//       float[] height = {1.57f, 7.654f, 9.986f};
//        int[] date = {1991, 1992, 1993, 1994};

        // задание 2
        int[] weights = new int[3];
        weights[0] = 10;
        weights[1] = 15;
        weights[2] = 20;
        int januaryWeights = weights[0];
        int februaryWeights = weights[1];
        int marchWeights = weights[2];
        float[] height = {1.57f, 7.654f, 9.986f};
        height[0] = 1.57f;
        height[1] = 7.654f;
        height[2] = 9.986f;
        int[] date = {1991, 1992, 1993, 1994};
        date[0] = 1991;
        date[1] = 1992;
        date[2] = 1993;
        date[3] = 1994;
         System.out.println(januaryWeights + "," + februaryWeights + "," + marchWeights);
         System.out.println( height[0] + "," + height[1] + "," + height[2]);
         System.out.println(date[0] + "," + date[1] + "," + date[2] + "," + date[3]);
        // задание 3
         System.out.println(marchWeights + "," + februaryWeights + "," + januaryWeights);
         System.out.println( height[2] + "," + height[1] + "," + height[0]);
         System.out.println(date[3] + "," + date[2] + "," + date[1] + "," + date[0]);
        // задание 4

        int[] even = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                i = i + 1;
            System.out.println(even[i]);


        }


    }
}
