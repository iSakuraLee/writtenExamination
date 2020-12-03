package com.wangyihuyu.exam;

import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.next());
        if (nums == 0) {
            System.out.println(0);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String[] ids = new String[nums];
        String[] names = new String[nums];

        int res = 0;
        for (int i = 0; i < nums; i++) {
            String id = scanner.next();
            String name = scanner.next();
            if (!hashMap.containsKey(id)) {
                if (hashMap.containsValue(name)) {
                    res++;
                } else {
                    hashMap.put(id, name);
                }
            }
        }

        System.out.println(res);
    }
}
