package com.zhongxin.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }
        int[][] op = new int[m][2];
        for (int i = 0; i < m; i++) {
            op[i][0] = Integer.parseInt(scanner.next());
            op[i][1] = Integer.parseInt(scanner.next());
        }


    }


    public static void help(int[] arr, int[][] op) {
        for (int i = 0; i < op.length; i++) {
            int num = op[i][1];
            int c = (num - 1) / 2;  // 需要转换的根节点在数组中的索引
            if(num + 1 < arr.length) {
                int max = Math.max(arr[c], Math.max(arr[num - 1], arr[num]));
            }
        }
    }
}
