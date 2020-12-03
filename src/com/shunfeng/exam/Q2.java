package com.shunfeng.exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
港口新到了n个货物，工人们需要把它们通过货车运送到公司。获取会先后到达港口，第i个到达港口的货物是第i号，价值为 a[i]。
现有k辆货车，每辆货车可以将编号连续的货物一起运输，容量无限，运输费用为该车货物价值的和的平方，每辆车必须装载货物。
你是运输货车公司的老板，你想在赚大钱的同时降低每辆车装载货物数以控制成本。
请问：最大的运输费用是多少，以及在费用最大时装载货物最多的货车至少需要装载多少货物

输入描述：
    第一行两个数：n k
    接下来n个数a[]，第i个数为a[i]
输出描述：
    两个数。第一个数表示最大的运输费用，第二个数表示此时运输货物最多的货车最少需要装在的货物数量
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int goodsCount = scanner.nextInt();
            int carCount = scanner.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < goodsCount; i++) {
                list.add(scanner.nextInt());
            }

            for (int i = 0; i < goodsCount - carCount + 1; i++) {

            }
        }
    }

}
