package com.jingdong.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = Integer.parseInt(scanner.next());
        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            char[][] matrix = new char[n][m];

            for (int j = 0; j < n; j++) {
                String line = scanner.next();
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = line.charAt(k);
                }
            }

            int a = 0;
            int b = 0;
            boolean[][] flag = new boolean[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (matrix[j][k] == 'E') {
                        a = j;
                        b = k;
                        break;
                    }
                }
            }

            if (help(n, m, a, b, matrix, flag)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static boolean help(int n, int m, int i, int j, char[][] matrix, boolean[][] flag) {
        if (i < 0 || i >= n || j < 0 || j >= m || matrix[i][j] == '#' || flag[i][j]) {
            return false;
        }

        if (matrix[i][j] == 'S') {
            return true;
        }

        flag[i][j] = true;

        if(help(n, m, i - 1, j, matrix, flag)
                || help(n, m, i + 1, j, matrix, flag)
                || help(n, m, i, j - 1, matrix, flag)
                || help(n, m, i, j + 1, matrix, flag)) {
            return true;
        }

        flag[i][j] = false;
        return false;
    }
}
