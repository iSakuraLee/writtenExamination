package com.baidu.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());  // 参赛人数
        int m = Integer.parseInt(scanner.next());  // 指令数

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String order = scanner.next();
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            if (order.equals("C")) {

            } else if (order.equals("Q")) {

            }
        }
    }
}
