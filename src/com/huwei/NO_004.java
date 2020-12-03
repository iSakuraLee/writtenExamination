package com.huwei;

import java.util.Scanner;

/*
•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

例如：
    输入：
        abc
        123456789
    输出：
        abc00000
        12345678
        90000000
 */
public class NO_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            char[] chars = s.trim().toCharArray();
            StringBuilder sb = new StringBuilder();

            if (chars.length < 8) {  // 输入的字符串长度小于8
                for (int i = 0; i < 8; i++) {
                    if (i < chars.length) {
                        sb.append(chars[i]);
                    } else {
                        sb.append("0");
                    }
                }
                System.out.println(sb.toString());
            } else if (chars.length == 8) {   // 输入的字符串长度等于8
                System.out.println(s);
            } else {  // 输入的字符串长度大于8
                int c = chars.length / 8;
                for (int i = 0; i < c; i++) {
                    for (int j = 0; j < 8; j++) {
                        sb.append(chars[i * 8 + j]);
                    }
                    System.out.println(sb.toString());
                    sb.delete(0, sb.length());
                }
//                System.out.println(sb.toString());
                if (chars.length % 8 != 0) {
                    for (int i = 0; i < 8; i++) {
                        if (8 * c + i < chars.length) {
                            sb.append(chars[8 * c + i]);
                        } else {
                            sb.append("0");
                        }
                    }
                    System.out.println(sb.toString());
                }
            }
        }
    }
}
