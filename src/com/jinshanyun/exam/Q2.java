package com.jinshanyun.exam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        help(arr, n1, n2);
    }


    public static void help(int[] arr, int n1, int n2) {

    }
}
