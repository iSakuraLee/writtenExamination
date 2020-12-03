package com.meituan.exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<String> list = new ArrayList<String>();
//        System.out.println(count);
        for (int i = 0; i < count; i++) {
            list.add(scanner.next());
        }

        String pattern1 = "^[a-zA-Z]";
        String pattern2 = "(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+$";
        for(String s: list){
//            System.out.println(s);
            if (Pattern.matches(pattern1, s) && Pattern.matches(pattern2, s)) {
                System.out.println("Accept");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
