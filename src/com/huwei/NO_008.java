package com.huwei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

输入描述:
    先输入键值对的个数
    然后输入成对的index和value值，以空格隔开
输出描述:
    输出合并后的键值对（多行）

输入：
    4
    0 1
    0 2
    1 2
    3 4
输出：
    0 3
    1 2
    3 4
 */
public class NO_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            ArrayList<String> list = new ArrayList<>();
            String c = scanner.nextLine().trim();

            for (int i = 0; i < Integer.parseInt(c); i++) {
                String couple = scanner.nextLine().trim();  // 以字符串形式获取键值对
                list.add(couple);
//                System.out.println(list);
            }

            handle(list);
        }
    }

    private static void handle(ArrayList<String> list) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (String s: list) {
            int key = Integer.parseInt(s.split(" ")[0]);
            int val = Integer.parseInt(s.split(" ")[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + val);
            } else {
                map.put(key, val);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
