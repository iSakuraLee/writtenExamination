package com.jinshanyun.exam;

import java.util.Scanner;

/*
Fibonacci三角形
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.next());
            help2(n);
        }
    }


    public static void help(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(fibo(j)).append(" ");
            }
            if (sb.length() == 2) {
                System.out.println(sb.toString().trim());
            } else {
                String s = sb.toString().trim();
                String[] splits = s.split(" ");
                StringBuilder sb2 = new StringBuilder();
                for (int j = splits.length - 2; j >= 0 ; j--) {
                    sb2.append(splits[j]).append(" ");
                }
                s = sb2.toString().trim();
                System.out.println(sb.append(s).toString().trim());
            }
        }
    }


    private static int fibo(int c) {
        if (c <= 1) {
            return 1;
        }
        return fibo(c - 1) + fibo(c - 2);
    }


    public static void help2(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 2 * i + 1;
        }
        for (int i = 1; i <= n; i++) {
            int temp = nums[i - 1] / 2;
            if (temp == 0) {
                System.out.println(1);
                continue;
            }
            int[] arr = new int[temp + 1];
            arr[0] = 1;
            arr[1] = 1;
            for (int j = 2; j <= temp; j++) {
                arr[j] = arr[j - 1] + arr[j -2];
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            for (int j = arr.length - 2; j >=0 ; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
