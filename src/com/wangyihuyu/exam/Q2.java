package com.wangyihuyu.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.next());
        for (int d = 0; d < T; d++) {
            int W = Integer.parseInt(scanner.next());
            int H = Integer.parseInt(scanner.next());
            String[][] background = new String[W][H];
            for (int e = 0; e < W; e++) {
                String s = scanner.next();
                help(background, e, s);
            }

            int P = Integer.parseInt(scanner.next());
            int Q = Integer.parseInt(scanner.next());
            String[][] role = new String[P][Q];
            for (int e = 0; e < P; e++) {
                String s = scanner.next();
                help(role, e, s);
            }

            int i = Integer.parseInt(scanner.next());
            int j = Integer.parseInt(scanner.next());
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());

            int sum = 0;
            while (true) {
                int core = core(background, role, i, j, a, b);
                if (core == 0) {
                    break;
                }
                sum = sum + core;
                i = i + a;
                j = j + b;
            }

            System.out.println(sum);
        }
    }


    private static void help(String[][] m, int i, String s) {
        for (int k = 0; k < s.length(); k++) {
            m[i][k] = s.charAt(k) + "";
        }
    }


    private static int core(String[][] background, String[][] role, int i, int j, int a, int b) {
        int W = background.length;
        int H = background[0].length;
        int P = role.length;
        int Q = role[0].length;

        int res = 0;
        for (int k = 0; k < Q; k++) {
            for (int l = 0; l < P; l++) {
                if (k + i >= 1 && k + i <= H && l + j >= 1 && l + j <= W) {
                    if (role[k][l] != background[k + i - 1][l + j - 1]) {
                        res++;
                        background[k + i - 1][l + j - 1] = role[k][l];
                    }
                }
            }
        }

        return res;
    }

}
