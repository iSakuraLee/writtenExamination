package com.weipinhui.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' || str.charAt(i) == '+') {
                sb1.append(str.charAt(i));
            } else {
                sb2.append(str.charAt(i));
            }
        }

        String s = sb1.append(sb2.reverse().toString()).toString();
        System.out.println(s);
    }
}
