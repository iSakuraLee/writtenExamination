package com.meituan.exam;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();  // 订单数量
        int acceptCunt = scanner.nextInt();  // 能接收的订单数量

        // key:orderPrice,value:weight
        ArrayList<Integer> price = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        for (int i = 0; i < orderCount; i++) {
            price.add(scanner.nextInt());
            weight.add(scanner.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < weight.size(); i++) {
            list.add(price.get(i) + weight.get(i) * 2);
        }
        System.out.println(list);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < acceptCunt; i++) {
            if (map.containsKey(list.get(orderCount - i - 1))) {
                list1.add(map.get(list.get(orderCount - i - 1)));
            }
        }

        for (Integer i : list1) {
            System.out.print(i + " ");
        }
    }
}
