package com.WBtongcheng.exam;

public class Q1 {
    public static void main(String[] args) {

    }


    public int lineup (String peoples) {
        // write code here
        int lindex = 0;
        int rindex = peoples.length();

        while (lindex < rindex) {
            while (peoples.charAt(lindex) != 'G') {
                lindex++;
            }
        }

        return -1;
    }
}
