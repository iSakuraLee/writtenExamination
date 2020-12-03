package com.huaweiexam.bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        int a = Integer.parseInt(list.get(list.size() - 2));
        String currentVal = list.get(list.size() - 1);
        ArrayList<String> res = new ArrayList<>();


        for (String s : list) {
            boolean flag = false;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                String c = s.charAt(j) + "";
                if (Integer.parseInt(c) < a) {
                    sb.append(c);
                    flag = true;
                }
            }
            if (!flag) {
                sb.append("-1");
            }
            res.add(sb.toString());
        }

        String n = res.get(res.size() - 1);
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i).contains(n)) {
                System.out.println(list.get(i));
            }
        }
    }
}
