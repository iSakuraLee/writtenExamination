package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PukePai {
    public static void main(String[] args) {
        String[] s = {"s1","s3","s9","s4","h1","p3","p2","q5","q4","q9","k2","k1"};

        System.out.println(Arrays.toString(new PukePai().pukeSort(s)));
    }

    public String[] pukeSort(String[] num) {
        ArrayList<String> k_list = new ArrayList<>();
        ArrayList<String> s_list = new ArrayList<>();
        ArrayList<String> h_list = new ArrayList<>();
        ArrayList<String> p_list = new ArrayList<>();
        ArrayList<String> q_list = new ArrayList<>();
        for (String s : num) {
            if (s.charAt(0) == 'k') {
                k_list.add(s);
            } else if (s.charAt(0) == 's') {
                s_list.add(s);
            } else if (s.charAt(0) == 'h') {
                h_list.add(s);
            } else if (s.charAt(0) == 'p') {
                p_list.add(s);
            } else if (s.charAt(0) == 'q') {
                q_list.add(s);
            }
        }

        Collections.sort(k_list);
        Collections.sort(s_list);
        Collections.sort(h_list);
        Collections.sort(p_list);
        Collections.sort(q_list);

        String[] result = new String[num.length];

        ArrayList<String> finalList = new ArrayList<>();
        finalList.addAll(k_list);
        finalList.addAll(s_list);
        finalList.addAll(h_list);
        finalList.addAll(p_list);
        finalList.addAll(q_list);

        for (int i = 0; i < result.length; i++) {
            result[i] = finalList.get(i);
        }

        return result;
    }
}
