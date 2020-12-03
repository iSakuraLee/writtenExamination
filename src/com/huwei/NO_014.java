package com.huwei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
输入描述:
    输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述:
    数据输出n行，输出结果为按照字典序排列的字符串。

输入:
    9
    cap
    to
    cat
    card
    two
    too
    up
    boat
    boot
输出:
    boat
    boot
    cap
    card
    cat
    to
    too
    two
    up
 */
public class NO_014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int c = Integer.parseInt(scanner.nextLine());
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < c; i++) {
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
