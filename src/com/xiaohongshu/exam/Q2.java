package com.xiaohongshu.exam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Q2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int maxBoxes(int[][] boxes) {
        if (boxes.length == 0) {
            return 0;
        }
        int dp[] = new int[boxes.length];
        int res = 0;
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (boxes[i][0] > boxes[j][0] && boxes[i][1]> boxes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                } else {
                    dp[i] = Math.max(dp[i], 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _boxes_rows = 0;
        int _boxes_cols = 0;
        _boxes_rows = Integer.parseInt(in.nextLine().trim());
        _boxes_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _boxes = new int[_boxes_rows][_boxes_cols];
        for (int _boxes_i = 0; _boxes_i < _boxes_rows; _boxes_i++) {
            for (int _boxes_j = 0; _boxes_j < _boxes_cols; _boxes_j++) {
                _boxes[_boxes_i][_boxes_j] = in.nextInt();

            }
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }

        res = maxBoxes(_boxes);
        System.out.println(String.valueOf(res));

    }
}
