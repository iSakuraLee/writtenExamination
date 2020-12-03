package com.sougou.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能交换奖品的最大数量
     *
     * @param a int整型
     * @param b int整型
     * @param c int整型
     * @return int整型
     */
    public int numberofprize(int a, int b, int c) {
        // write code here
//        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        Collections.sort(list);
//
//        res = list.get(0);
//        a = a - list.get(0);
//        b = b - list.get(0);
//
//        if (a == 0 || b == 0){
//            res = res + Math.abs(a - b) / 5;
//        } else {  // 均不为零的情况
//            if (Math.abs(a - b) / 5 > 0) {
//                res = res + Math.abs(a - b) / 5;
//            }
//
//        }


        int[] nums = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        Arrays.sort(nums);
        res = nums[0];

        nums[1] = b - nums[0];
        nums[2] = c - nums[0];

        if (nums[1] == 0 && nums[2] == 0) {
            return res;
        } else if (nums[2] != 0 && nums[1] == 0){
            return res + nums[2] / 5;
        } else {  // 均不为0的情况

        }

        return res;
    }
}
