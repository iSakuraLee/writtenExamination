package com.huaweiexam.bishi;

import java.util.ArrayList;
import java.util.Scanner;

/*
输入描述：
    参数1：卡车空间k (1 < k < 1000)
    参数2：箱子个数N (1 < N < 1000)
    参数3：每个箱子尺寸w (1 < w < 1000)  数组
    参数4：每个箱子价值v (1 < v < 1000)  数组
输出描述：
    在满足卡车的空间占用最大的前提下，使卡车运输的箱子总价值最大，输出卡车运输箱子最大的价值。
 */
public class NO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[] w = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

        int[][] v = new int[n + 1][m + 1];
        int[][] path = new int[n + 1][m + 1];

        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0;
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0;
        }


        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                if (w[i - 1] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
                    if (v[i - 1][j] < val[i - 1] + v[i - 1][j - w[i - 1]]) {
                        v[i][j] = val[i - 1] + v[i - 1][j - w[i - 1]];
                        path[i][j] = 1;
                    } else {
                        v[i][j] = v[i - 1][j];
                    }

                }
            }
        }

        System.out.println(v[n][m]);
    }
}
