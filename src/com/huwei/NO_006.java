package com.huwei;

import java.util.Scanner;

/*
功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）最后一个数后面也要有空格

输入描述:
    输入一个long型整数
输出描述:
    按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。

输入：180
输出：2 2 3 3 5
 */
public class NO_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            StringBuilder sb = new StringBuilder();
            long num = scanner.nextLong();
            fun(num, sb);
        }
    }

    private static void fun(long num, StringBuilder sb) {
        for (int i = 2; i < Math.sqrt(num); i++) {  // 采用Math.sqrt()优化了计算次数
            if (num % i == 0) {
                sb.append(i).append(" ");
                num = num / i;
                i--;
            }
        }
        sb.append(num).append(" ");

        System.out.println(sb.toString());
    }
}
