package com.xiecheng.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().trim().split(" ");
        help(s);
    }

    public static void help(String[] s) {
        int n = s.length;
        double sum = 0;
        for (String value : s) {
            sum = sum + Integer.parseInt(value);
        }

        double sd = sum / 5.0;
        double l = 0;

        for (String str : s) {
            l = l + getNum(sd, Integer.parseInt(str));
        }

        if (l <= 11) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }


    private static double getNum(double d1, double d2) {
        return Math.pow(Math.abs(d1 - d2), 2) / d1;
    }
}
