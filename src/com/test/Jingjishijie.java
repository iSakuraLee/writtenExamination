package com.test;

import java.util.*;

public class Jingjishijie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        ArrayList<String> list = new ArrayList<>();

        if (line.length() == 2) {
            System.out.println(line);
            return;
        }

        for (int i = 0; i < line.length(); i+=2) {
            String s = line.substring(i, i + 2);
            list.add(s);
        }

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("S", 4);
//        map.put("H", 3);
//        map.put("C", 2);
//        map.put("D", 1);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(1) == '1') {
                    o1 = o1.charAt(0) + "14";
                } else if (o1.charAt(1) == '2') {
                    o1 = o1.charAt(0) + "15";
                } else if (o1.charAt(1) == 'T') {
                    o1 = o1.charAt(0) + "10";
                } else if (o1.charAt(1) == 'J') {
                    o1 = o1.charAt(0) + "11";
                } else if (o1.charAt(1) == 'Q') {
                    o1 = o1.charAt(0) + "12";
                } else if (o1.charAt(1) == 'K') {
                    o1 = o1.charAt(0) + "13";
                }

                if (o2.charAt(1) == '1') {
                    o2 = o2.charAt(0) + "14";
                } else if (o2.charAt(1) == '2') {
                    o2 = o2.charAt(0) + "15";
                } else if (o2.charAt(1) == 'T') {
                    o2 = o2.charAt(0) + "10";
                } else if (o2.charAt(1) == 'J') {
                    o2 = o2.charAt(0) + "11";
                } else if (o2.charAt(1) == 'Q') {
                    o2 = o2.charAt(0) + "12";
                } else if (o2.charAt(1) == 'K') {
                    o2 = o2.charAt(0) + "13";
                }

                String s1 = o1.substring(0, 1);
                int i1 = Integer.parseInt(o1.substring(1, o1.length()));
                String s2 = o2.substring(0, 1);
                int i2 = Integer.parseInt(o2.substring(1, o2.length()));

                int c1 = Integer.compare(i1, i2);
//                if (c1 == 0) {
//                    return -(Integer.compare(map.get(s1), map.get(s2)));
//                }

                return -c1;
            }
        });

        StringBuilder ss = new StringBuilder();
        for (String s : list) {
            ss.append(s);
        }

        System.out.println(ss.toString());

        sc.close();
    }
}
