package com.jianxinjinrong.exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

    }


    public int carsTrans (int[] cars, int num) {
        // write code here
        Arrays.sort(cars);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cars) {
            list.add(i);
        }

        if (num % cars[cars.length - 1] == 0) {
            return num / cars[cars.length - 1];
        } else {
            list.remove(list.size() - 1);
            if (list.contains(num % cars[cars.length - 1])) {
                return num / cars[cars.length - 1] + 1;
            } else {
                return num / cars[cars.length - 1] + 2;
            }
        }
    }

}
