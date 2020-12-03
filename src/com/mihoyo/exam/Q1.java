package com.mihoyo.exam;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int w1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        String[] weekDays = {"7","6","5","4","3","2","1"};
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(y2, m2, d2);
        calendar.setTime(date);
        int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0) {
            w = 0;
        }
        System.out.println(weekDays[w]);
    }
}
