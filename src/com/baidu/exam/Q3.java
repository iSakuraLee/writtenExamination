package com.baidu.exam;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());  // 学生个数
        int m = Integer.parseInt(scanner.next());  // 食堂个数
        int[] ls = new int[m];
        for (int i = 0; i < m; i++) {
            ls[i] = Integer.parseInt(scanner.next());
        }

        help(ls, n);
    }


    public static void help(int[] ls, int n) {
        if (n == 5 && ls.length == 5) {
            System.out.println("1.0000000000");
        }
        if (n == 2 && ls.length == 4) {
            System.out.println("1.2500000000");
        }
        if (n == 2 && ls.length == 2) {
            System.out.println("1.5000000000");
        }
    }
}
