package com.bilibili.exam;

import java.util.*;

/*
给定一个只包含括号的字符串，判断字符串是否有效。其中，括号种类包括：
‘(’，‘)’，‘[’，‘]’，‘{’，‘}’。有效字符串需满足：
    1、左括号必须用相同类型的右括号闭合
    2、左括号必须以正确的顺序闭合。
注意：空字符串可被认为是有效字符串
 */
public class Q02 {
    public static void main(String[] args) {
        String s = "\"i like apple!\"";
        System.out.println(new Q02().IsValidExp(s));
    }
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean IsValidExp (String s) {
        // write code here
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '"') {
                stack.push('"');
            } else if (c == '['){
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {  // 在此处stack有pop操作，即使不进去if语句块中
                return false;
            }
        }

        return stack.isEmpty();
    }
}