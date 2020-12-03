package com.xiecheng.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        int sum = 0;
        for (int i : list) {
            sum = sum + i;
        }

        if (sum % 9 == 0) {
            System.out.println(sum / 9);
        } else {
            System.out.println(sum / 9 + 1);
        }
    }
}
