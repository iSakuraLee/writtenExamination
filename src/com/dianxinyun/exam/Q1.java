package com.dianxinyun.exam;

import java.util.Scanner;
/*
找第n个丑数
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.next());
        int res = nthUglyNumber(i);
        System.out.println(res);
    }


    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int i2 = dp[a] * 2;
            int i3 = dp[b] * 3;
            int i5 = dp[c] * 5;
            dp[i] = Math.min(i2, Math.min(i3, i5));
            if (dp[i] == i2) a++;
            if (dp[i] == i3) b++;
            if (dp[i] == i5) c++;
        }

        return dp[n - 1];
    }
}
