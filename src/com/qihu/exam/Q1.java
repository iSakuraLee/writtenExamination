package com.qihu.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();
            int v = scanner.nextInt();

            help(a, b, k, v);
        }
    }


    /**
     *
     * @param a 物体个数
     * @param b 隔板个数
     * @param k 独立隔间个数
     * @param v 隔间最大容量
     */
    public static void help(int a, int b, int k, int v) {
        if ( a <= 2 * b * v) {
            int res = 0;
            if (a % (2 * v) == 0) {
                res = a / (2 * v);
            } else {
                res = a / (2 * v) + 1;
            }
            System.out.println(res);
        } else {
            int res = 0;
            a = a - 2 * b * v;
            res = b;
            if (a % v != 0) {
                res = res + a / v + 1;
            } else {
                res = res + a / v;
            }
            System.out.println(res);
        }
    }
}
