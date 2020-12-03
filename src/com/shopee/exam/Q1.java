package com.shopee.exam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        line = line.trim();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int index = 0;
        while (index < line.length()) {
            if (line.charAt(index) >= 'A' && line.charAt(index) <= 'Z') {
                line = String.valueOf(line.charAt(index)).toLowerCase() + line.substring(index + 1);
                break;
            }
            index++;
        }

        for (int i = 0; i < line.length(); i++) {  // 注意，这里是从0开始，不是index，因为在前面已经将line的前面的非字符数字已去除
            if ((line.charAt(i)>='A' && line.charAt(i) <='Z')
                    || (line.charAt(i)>='0' && line.charAt(i) <='9')
            || (line.charAt(i)>='a' && line.charAt(i) <='z')){
                if (flag) {
                    sb.append(String.valueOf(line.charAt(i)).toUpperCase());
                    flag = false;
                } else {
                    sb.append(String.valueOf(line.charAt(i)).toLowerCase());
                }

            } else {
                flag = true;
                continue;
            }

        }

        System.out.println(sb.toString());
    }
}
