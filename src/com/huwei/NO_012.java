package com.huwei;

import java.util.Scanner;

/*
写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）

输入描述:
    输入N个字符
输出描述:
    输出该字符串反转后的字符串

输入: abcd
输出: dcba
 */
public class NO_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();

            String res = new StringBuilder(s).reverse().toString();
            System.out.println(res);
        }
    }
}
