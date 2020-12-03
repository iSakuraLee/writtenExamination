package com.WBtongcheng.exam;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {

    }


    public int[] removeDuplicate (int[] array) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(list.size() - i - 1);
        }

        return res;
    }
}
