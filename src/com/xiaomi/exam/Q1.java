package com.xiaomi.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            help(s);
        }
    }


    public static void help(String s) {
        int len = s.length();
        if (len < 8 || len > 120) {
            System.out.println(1);
            return;
        }

        boolean f1 = false,f2 = false,f3 = false,f4 = false;

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z') {
                f1 = true;
            } else if (aChar >= 'A' && aChar <= 'Z') {
                f2 = true;
            } else if (aChar >= '0' && aChar <= '9') {
                f3 = true;
            } else {
                f4 = true;
            }
        }

        if (f1 && f2 && f3 && f4) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }


    }
}
