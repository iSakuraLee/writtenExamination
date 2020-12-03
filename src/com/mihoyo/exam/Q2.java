package com.mihoyo.exam;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String str = postfix(line);
        compute(str);
    }


    public static void compute(String str) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isNum(chars[i])) {
                sb.append(chars[i]);
                if (i + 1 == chars.length) {
                    stack.push(Integer.parseInt(sb.toString()));
                    continue;
                }
                if (chars[i + 1] == ' ') {
                    stack.push(Integer.parseInt(sb.toString()));
                    sb.delete(0, sb.length());
                    continue;
                }
                continue;
            }
            if (chars[i] == '+') {
                stack.push(stack.pop() + stack.pop());
            }
            if (chars[i] == '-') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 - n1);
            }
            if (chars[i] == '*') {
                stack.push(stack.pop() * stack.pop());
            }
            if (chars[i] == '/') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 / n1);
            }

            System.out.println(stack.pop());
        }
    }


    private static String postfix(String line) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isNum(chars[i])) {
                sb.append(chars[i]);
                int m = i;
                if ((i < chars.length - 1 && !isNum(chars[m + 1])) || i == chars.length - 1)
                    sb.append(" ");
                continue;

            }
            if (chars[i] == '(' || chars[i] == '*' || chars[i] == '/'){
                stack.push(chars[i]);
                continue;
            }
            if (chars[i] == ')') {
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        continue;
                    }
                    sb.append(stack.pop());
                }
                continue;
            }
            if (chars[i] == '+' || chars[i] == '-') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.push(chars[i]);
                continue;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }


    private static boolean isNum(char c) {
        return c >= 48 && c <= 57;
    }
}
