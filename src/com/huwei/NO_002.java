package com.huwei;

import java.util.HashMap;
import java.util.Scanner;

/*
写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */

public class NO_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = scanner.next();

        System.out.println(Count(s, target));
    }

    public static int Count(String s, String target) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] splits = s.split("");
        for(String string: splits) {
            if(map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }

        if (map.containsKey(target)) {
            return map.get(target);
        }

        return 0;
    }
}
