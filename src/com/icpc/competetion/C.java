package com.icpc.competetion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        help(line);
    }

    public static void help(String str) {
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {
                sb.append(str.charAt(i));
            } else {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
            if (i == str.length() - 1) {
                list.add(sb.toString());
            }
        }

        for (String s : list) {
            int c = getCount(s);
            count = count + c;
        }

        System.out.println(count);
    }

    private static int getCount(String s) {
        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'w') {
                sb.append("\\").append("/").append("\\").append("/");
            }
        }
        String line = sb.toString();
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '/' && line.charAt(i + 1) == '\\') {
                res++;
            }
        }

        return res;
    }
}
