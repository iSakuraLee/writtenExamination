package com.xiecheng.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.next());
        int p = Integer.parseInt(scanner.next());
        int t = Integer.parseInt(scanner.next());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            sb.append("hotel");
        }
        for (int i = 0; i < p; i++) {
            sb.append("poi");
        }
        for (int i = 0; i < t; i++) {
            sb.append("tnt");
        }

        help(sb.toString());
    }

    public static void help(String str) {
        

        System.out.println(2);
    }
}
