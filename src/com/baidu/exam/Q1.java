package com.baidu.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.next());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            int[] values = new int[n];
            int[] role = new int[m];
            for (int j = 0; j < n; j++) {
                values[j] = Integer.parseInt(scanner.next());
            }
            for (int j = 0; j < m; j++) {
                role[j] = Integer.parseInt(scanner.next());
            }

            Arrays.sort(role);

            help(values, role);
        }
    }


    public static void help(int[] values, int[] role){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int c = 0;
            for (int j = 0; j < role.length; j++) {
                if (role[j] >= values[i]) {
                    c = role.length - j;
                    break;
                }
            }
            sb.append(c).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
