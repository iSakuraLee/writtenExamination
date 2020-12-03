package com.didi.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.next());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            int k = Integer.parseInt(scanner.next());

            int[][] matrix = new int[n][m];
            for (int j = 0; j < m; j++) {
                int a = Integer.parseInt(scanner.next()) - 1;
                int b = Integer.parseInt(scanner.next()) - 1;
                int w = Integer.parseInt(scanner.next());
                if (w > k) {
                    w = 0;
                }
                matrix[a][b] = matrix[b][a] = w;
            }

            prim(matrix, n);

        }


    }


    public static void prim(int[][] matrix, int n) {
        int[] low = new int[n];
        int[] mid = new int[n];

        int i,j,min,minid,sum = 0;

        System.out.println("YES");
        System.out.println("NO");
    }
}
