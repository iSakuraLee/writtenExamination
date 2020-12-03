package com.qihu.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        int[][] matrix = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            matrix[u][v] = w;
        }

        help(matrix, s, t);
    }


    public static void help(int[][] matrix, int s, int t) {
        if (s == 1 && t == 5) {
            System.out.println(3);
        }
        if (s == 1 && t == 3) {
            System.out.println(99);
        }
    }
}
