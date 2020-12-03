package com.huwei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
对于其中重复的数字，只保留一个，把其余相同的数去掉，
不同的数对应着不同的学生的学号。
然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 */
public class NO_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int c = scanner.nextInt();  // 一组数的数量
            ArrayList<Integer> list = new ArrayList<>();  // 将一组生成的数保存在一个列表中
            for (int i = 0; i < c; i++) {
                list.add(scanner.nextInt());
            }

            HashSet<Integer> set = new HashSet<>(list);  // 将列表中的数据放入集合
            list.clear();
            list.addAll(set);
            Collections.sort(list);

            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}
