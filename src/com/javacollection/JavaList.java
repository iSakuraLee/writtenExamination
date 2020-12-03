package com.javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

//        int[] arr = {3, 7, 2, 1, 5, 4, 9, 8, 3, 2, 5, 6, 6};
//        Arrays.sort(arr, 0, 5);
//        int[] ints = Arrays.copyOf(arr, 5);
//        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.toString(arr));
    }
}
