package com.huwei;

import java.util.Scanner;

/*
写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

输入描述:
    输入一个正浮点数值
输出描述:
    输出该数值的近似整数值

输入：5.5
输出：6
 */
public class NO_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();

            String[] split = s.split("\\.");  // 注意：需要转义
            String integer = split[0];  // 整数部分
            String decimal = split[1];  // 小数部分
            String s2 = decimal.split("")[0];  // 取小数的第一个数字
            if (Integer.parseInt(s2) >= 5) {
                System.out.println(Integer.parseInt(integer) + 1);
            } else {
                System.out.println(Integer.parseInt(integer));
            }
        }
    }
}
