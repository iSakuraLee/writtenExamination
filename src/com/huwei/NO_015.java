package com.huwei;

import java.util.Scanner;

/*
输入描述:
    输入一个整数（int类型）
输出描述:
    这个数转换成2进制后，输出1的个数

输入: 5
输出: 2
 */
public class NO_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String s = Integer.toBinaryString(num);
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
