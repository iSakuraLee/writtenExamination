package com.huwei;

import java.util.HashMap;
import java.util.Scanner;

/*
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。

输入:9876673
输出:37689
 */
public class NO_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            if (!map.containsKey(num.charAt(i))) {
                map.put(num.charAt(i), -1);
                sb.append(num.charAt(i));
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
