package com.huaweiexam.bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        help(line);
    }


    public static void help(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        int c = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > c) {
                c = entry.getValue();
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == c) {
                System.out.println(entry.getKey() + ":" + c);
            }
        }
    }
}
