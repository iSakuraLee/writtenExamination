package com.weipinhui.exam;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();

        help(line);
    }


    public static void help(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            temp = temp < j - i ? temp + 1: j - i;
            result = Math.max(result, temp);
        }

        System.out.println(result);
    }
}
