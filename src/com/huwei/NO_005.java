package com.huwei;

import java.util.HashMap;
import java.util.Scanner;

/*
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入）

输入描述:
    输入一个十六进制的数值字符串。
输出描述:
    输出该数值的十进制字符串。

示例：
    输入：0xA
    输出：10
 */
public class NO_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 11);
        map.put("c", 12);
        map.put("d", 13);
        map.put("e", 14);
        map.put("f", 15);

        while (scanner.hasNext()) {
            int result = 0;
            String s = scanner.nextLine();
            String s1 = s.toLowerCase().split("x")[1];  // 去除大小写的影响，获取x后面的部分，前面的都是0

            String[] strings = s1.split("");

            for (int i = 0; i < strings.length; i++) {
                if (map.containsKey(strings[i])) {
                    result = (int) (result + map.get(strings[i]) * Math.pow(16, strings.length - i - 1));
                } else {
                    result = (int) (result + Integer.parseInt(strings[i]) * Math.pow(16, strings.length - i - 1));
                }
            }

            System.out.println(result);
        }
    }
}
