package com.meituan.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teamA = scanner.nextInt();
        int teamB = scanner.nextInt();

        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < teamA; i++) {
            listA.add(scanner.nextInt());
        }
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < teamB; i++) {
            listB.add(scanner.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(listA);
        list.addAll(listB);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.put(list.get(i), i);
        }

        Collections.sort(list);
        int[] result = new int[list.size()];
        StringBuilder sb = new StringBuilder();
        if (teamA > teamB) {
            for (int i = 0; i < teamA; i++) {

            }
        }

        System.out.println(sb.toString());
    }
}
