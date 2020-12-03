package com.bilibili.exam;

import java.util.ArrayList;

/*
题目描述：
    给出4个1-10的数字，通过加减乘除，得到数字为24就算胜利
 */
public class Q01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3};
        System.out.println(new Q01().Game24Points(arr));
    }


    public boolean Game24Points(int[] arr) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return fun(list);
    }

    private boolean fun(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            list.remove(i);
            if (fun2(list, temp)) {
                return true;
            }
            list.add(i, temp);  // 不能实现，将remove的数据还原，进行下一次操作（回溯）
        }
        return false;
    }

    private boolean fun2(ArrayList<Integer> list, int temp) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int n = list.get(i);
                list.remove(i);
                if (fun2(list, temp * n)
                        || fun2(list, temp + n)
                        || fun2(list, temp / n)
                        || fun2(list, temp - n)) {  // 这里的递归结束条件为list.size()==0时，temp是否等于24
                    return true;
                } else if (temp % n == 0) {  // 此时的temp为前三个数的计算结果，n为第四个数   这一手操作什么意思？？？？？？
                    if (fun2(list, temp / n)) {
                        return true;
                    }
                }
                list.add(i, n);
            }
            return false;
        } else {
            return temp == 24;
        }
    }
}
