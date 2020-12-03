package com.zhongxin.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());
        int[][] mt = new int[m][2];
        for (int i = 0; i < m; i++) {
            mt[i][0] = Integer.parseInt(scanner.next());
            mt[i][1] = Integer.parseInt(scanner.next());
        }

        help(mt, n, m, x);
    }


    public static void help(int[][] mt, int n, int m, int x) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < m; i++) {
            matrix[mt[i][0] - 1][mt[i][1] - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {

                }
            }
        }
    }
}
