package com.sougou.exam;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     *
     * @param t  int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public int getHouses(int t, int[] xa) {
        // write code here
        if (xa == null || xa.length == 0) {
            return 0;
        }

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> width = new ArrayList<>();

        for (int i = 0; i < xa.length; i++) {
            if (i % 2 != 0) {
                width.add(xa[i]);
            } else {
                pos.add(xa[i]);
            }
        }

        int result = 0;
        for (int i = 0; i < pos.size() - 1; i++) {
            int l = pos.get(i) - width.get(i) / 2;
            int r = pos.get(i) + width.get(i) / 2;
            int l2 = pos.get(i + 1) - width.get(i + 1) / 2;
            int r2 = pos.get(i + 1) + width.get(i + 1) / 2;
            int d = l2 - r;
            if (d > t) {
                result = result + 2;
            }
        }

        return result;
    }
}
