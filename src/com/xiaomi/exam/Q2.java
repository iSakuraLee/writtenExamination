package com.xiaomi.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
//            System.out.println(help(s, ));
        }
    }

    public static boolean help(String s, char[][] matrix) {
        boolean[][] flag = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (s.charAt(0) == matrix[i][j] && helpCore(i , j, flag, s, matrix, 0)) {
                    return true;
                }
            }
        }
        return  false;
    }


    private static boolean helpCore(int i, int j, boolean[][] flag, String s, char[][] matrix, int k) {
        if (k == s.length()) {
            return true;
        }

        if (i >= matrix.length || j >= matrix[0].length || i < 0 || j < 0 || matrix[i][j] != s.charAt(k)) {
            return false;
        }

        flag[i][j] = true;

        if (helpCore(i - 1, j, flag, s, matrix, k + 1) ||
                helpCore(i + 1, j, flag, s, matrix, k + 1) ||
                helpCore(i, j -1, flag, s, matrix, k+1) ||
                helpCore(i, j + 1, flag, s, matrix, k + 1)) {
            return true;
        }

        flag[i][j] = false;
        return false;
    }
}
