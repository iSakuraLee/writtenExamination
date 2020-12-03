package com.huwei;

import java.util.Scanner;

/*
计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class NO_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(getLength(s));
        }
    }

    public static int getLength(String s) {
        s = s.trim();
        String[] splits = s.split(" ");
        return splits[splits.length - 1].length();
    }
}
