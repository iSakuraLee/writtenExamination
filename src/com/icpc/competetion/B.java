package com.icpc.competetion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 */
public class B {
    LinkedHashMap<Integer, Integer> paths = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 列数
        int m = scanner.nextInt();  // 行数
        int k = scanner.nextInt();  // 墙的数量

        for (int i = 0; i < k; i++) {
            int key1 = scanner.nextInt();
            int value1 = scanner.nextInt();
            int key2 = scanner.nextInt();
            int value2 = scanner.nextInt();

        }

        int t_key1 = scanner.nextInt();
        int t_value1 = scanner.nextInt();
        int t_key2 = scanner.nextInt();
        int t_value2 = scanner.nextInt();


    }


    private static boolean help(int[][] matrix, int rows, int columns, int x, int y, boolean[][] flag) {
        if (x < 0 || x >= rows || y < 0 || y >= columns || !isAccess(x, y)) {
            return false;
        }

        flag[x][y] = true;


        return false;
    }



    private static boolean isAccess(int x, int y) {



        return false;
    }
}


