package com.icpc.competetion;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 0 || m == 0) {
            System.out.println(0);
            return;
        }

        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.charAt(j) + "";
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (help(matrix, n, m, i, j, 0)) {
                    res++;
                    System.out.println("(" + (i + 1) +"," + (j + 1) + ")");
                }
            }
        }

        System.out.println(res);
    }


    public static boolean help(String[][] matrix, int row, int col, int x, int y, int k) {
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return true;
        }

        if (k > row * col) {
            return false;
        }

        if (matrix[x][y].equals("W")) {
            return help(matrix, row, col, x - 1, y, k + 1);
        }
        if (matrix[x][y].equals("A")) {
            return help(matrix, row, col, x, y - 1, k + 1);
        }
        if (matrix[x][y].equals("S")) {
            return help(matrix, row, col, x + 1, y, k + 1);
        }
        if (matrix[x][y].equals("D")) {
            return help(matrix, row, col, x, y + 1, k + 1);
        }

        return false;
    }
}
