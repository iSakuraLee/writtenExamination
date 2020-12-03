package com.tiger.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        help(N);
    }

    public static void help(int n) {
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if (isSu(i) && isHui(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean isSu(int m) {
        if (m < 2) {
            return false;
        }

        int z = (int)Math.sqrt(m);
        for (int i = 2; i <= z; i++) {
            if (m % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isHui(int m) {
        String s = m + "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        String s1 = sb.reverse().toString();

        return s.equals(s1);
    }
}
