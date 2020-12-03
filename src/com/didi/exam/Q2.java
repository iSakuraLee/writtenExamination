package com.didi.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(scanner.next()) - 1;
            int v = Integer.parseInt(scanner.next()) - 1;
            int time = Integer.parseInt(scanner.next());
            matrix[u][v] = matrix[v][u] = time;
        }

        int s = Integer.parseInt(scanner.next());
        int e = Integer.parseInt(scanner.next());
//        String start = scanner.next();

        int[] res = help(matrix, 0);
        System.out.println(Arrays.toString(res));

    }


    public static int[] help(int[][] matrix, int s) {
        int n = matrix.length;
        int[] minPath = new int[n];
        String[] path = new String[n];
        for (int i = 0; i < n; i++) {
            path[i] = new String(s + "--->" + i);
        }
        int[] visited = new int[n];

        minPath[s] = 0;
        visited[s] = 1;

        for (int i = 0; i < n; i++) {
            int k = -1;
            int d = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (visited[j] == 0 && matrix[s][j] < d){
                    d = matrix[s][j];
                    k = j;
                }
            }

            minPath[k] = d;
            visited[k] = 1;

            for (int j = 0; j < n; j++) {
                if (visited[j] == 0 && matrix[s][k] + matrix[k][j] < matrix[s][j]) {
                    matrix[s][j] = matrix[s][k] + matrix[k][j];
                    path[j] = path[k] + "--->" + j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("从" + s + "出发到" + i + "最短路径为：" + path[i]);
        }
        System.out.println("-----------------");

        return minPath;
    }
}
