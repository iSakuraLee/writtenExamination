package com.dianxinyun.exam;

import java.util.Scanner;

/*
题目描述：
    给定一个整数列表，在列表中挑选任意个数的值，使得挑选出值的和最大，要求挑选的值在原列表中不能相邻
输入描述：
    一个整数列表，以逗号分隔
输出描述;
    最大和的值
输入：
    1，2，3，4，5
输出：
    9

 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            int[] arr = new int[splits.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(splits[i]);
            }
            int result = help(arr);
            System.out.println(result);
        }
    }


    public static int help(int[] arr) {
        if (arr.length == 0){
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        return dp[arr.length - 1];
    }
}
