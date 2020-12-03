package com.huwei;

import java.util.HashSet;
import java.util.Scanner;

/*
编写一个函数，计算字符串中含有的不同字符的个数。
字符在ASCII码范围内(0~127)，换行表示结束符，不算在字符里。
不在范围内的不作统计。多个相同的字符只计算一次

输入描述:
    输入N个字符，字符在ASCII码范围内。
输出描述:
    输出范围在(0~127)字符的个数。

输入：abc
输出：3
 */
public class NO_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();

            HashSet<Character> characters = new HashSet<>();
            for (Character ch : chars) {
                characters.add(ch);
            }

            int result = characters.size();
            System.out.println(result);
        }
    }
}
