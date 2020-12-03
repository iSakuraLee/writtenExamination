package com.huwei;

import java.util.Scanner;

/*
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

输入: I am a boy
输出: boy a am I
 */
public class NO_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] splits = s.split(" ");

            StringBuilder sb = new StringBuilder();
            for (int i = splits.length - 1; i > 0 ; i--) {
                sb.append(splits[i]).append(" ");
            }
            sb.append(splits[0]);

            String res = sb.toString();
            System.out.println(res);
        }
    }
}
