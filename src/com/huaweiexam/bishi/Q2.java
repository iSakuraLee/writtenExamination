package com.huaweiexam.bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            String target = split[0].trim().toLowerCase();
            String pattern = split[1].trim().toLowerCase();
            help(target, pattern);
        }

    }

    private static void help(String target, String pattern) {
        String[] splits = pattern.split(" ");
        String s = splits[splits.length - 1];
        int len = splits.length;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='.' || s.charAt(i) ==',' || s.charAt(i) =='!' || s.charAt(i) =='?') {
                len = len + 1;
            }
        }

        ArrayList<String> t = trans(target);
        ArrayList<String> p = trans(pattern);

         // 两个相同的情况
        if (t.size() == p.size()) {
            int l = 0;
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).equals(p.get(i))) {
                    l++;
                }
            }
            if (l == t.size()) {
                System.out.println("(" + 0 + "," + len +")");
            }
            if (l == t.size() - 1 && !t.get(t.size() - 1).equals(p.get(p.size() - 1))) {  // 最后符号不同的情况
                String tl = t.get(t.size() - 1);
                String pl = p.get(p.size() - 1);
                if ((tl.substring(-1).equals(".") ||tl.substring(-1).equals(",")||tl.substring(-1).equals("!")||tl.substring(-1).equals(".?"))
                        && (pl.substring(-1).equals(".") ||pl.substring(-1).equals(",")||pl.substring(-1).equals("!")||pl.substring(-1).equals(".?"))){
                    System.out.println("(" + 0 + "," + len +")");
                }
            }
        }

        if (t.size() != p.size()) {
            int c = 0;
            int t_index = 0;
            int p_index = 0;
            while (t.get(t_index).equals(p.get(p_index))){  // 找到两者不同时的索引下标
                t_index++;
                p_index++;
            }

        }

    }


    private static ArrayList<String> trans(String str) {
        String[] split = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < split.length - 1; i++) {
            if (!split[i].equals(" ")) {
                list.add(split[i]);
            }
        }
        return list;
    }
}
