package com.shunfeng.exam;
/*
现有一序列，长度为n，所有元素均为整数元素。序列中一些元素是确定值，另一些元素是不确定的。
你的任务是将所有不确定值的元素赋予一个正整数值，使得将整个序列分割成最少的段，每一个段都是一个等差数列。
特别的，长度为1和2的段都是等差数列
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int c = Integer.parseInt(scanner.nextLine());

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < c; i++) {
                list.add(scanner.nextInt());
            }

            // 全为-1的情况
            int m = 0;
            for (Integer integer : list) {
                if (integer == -1) {
                    m++;
                }
            }
            if (m >= list.size() - 1) {
                System.out.println("1");
            }

        }
    }
}
