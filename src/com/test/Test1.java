package com.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
//        String s = "abcadbea";
//        int i = lengthOfLongestSubstring(s);
//        System.out.println(i);

//        int[] arr1 = {3};
//        int[] arr2 = {-2, -1};
//        System.out.println(new Test1().findMedianSortedArrays(arr1, arr2));

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(new Test1().reverse(-2147));

//        System.out.println(new Test1().myAtoi("    +11191657170"));

        String s = "HK";
        if (s.charAt(1) == 'K') {
            s = s.charAt(0) + "13";
        }
        System.out.println(s);

        String ss = s.substring(0,1);
        System.out.println(ss);
        int i = Integer.parseInt(s.substring(1, s.length()));
        System.out.println(i);
    }



    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, temp = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = map.getOrDefault(s.charAt(i), -1);  // 获取索引
            map.put(s.charAt(i), i);
            temp = temp < i - index? temp + 1: i - index;
            res = Math.max(res, temp);
        }

        return res;
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }

        if (i == nums1.length) {  // nums1遍历完,剩下的是nums2部分,直接加入list
            for (int k = j; k < nums2.length; k++) {
                list.add(nums2[k]);
            }
        }

        if (j == nums2.length) {  // nums2遍历玩,剩下的是nums1部分,直接加入list
            for (int k = i; k < nums1.length; k++) {
                list.add(nums1[k]);
            }
        }

        if (list.size() % 2 == 1) {
            return list.get(list.size() / 2);
        } else {
            return (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0;
        }
    }


    public int reverse(int x) {  // 由于数据reverse后大小可能有一些不必要的麻烦，以字符串形式处理
        String s = String.valueOf(x);
        boolean flag = true;

        if(s.charAt(0) == '-') {
            flag = false;
            s = s.substring(1, s.length());
        }

        String s1 = new StringBuilder(s).reverse().toString();  // 反转之后的字符串
        if (s1.length() > 10) {  // 2^31 = 2,147,483,648
            return 0;
        }
        long c = Long.parseLong(s1);

        if (flag) {
            if (c > Integer.MAX_VALUE) {
                return 0;
            } else {
                return (int)c;
            }
        } else {
            if (-c < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int)-c;
            }
        }
    }


    public int myAtoi(String str) {
        String s = str.trim();  // 去除空格
        if (s.length() < 1) {
            return 0;
        }

        int flag = 0;
        if (s.charAt(0) == '-') {
            flag = -1;
            if (s.length() < 2) {
                return 0;
            }
        } else if (s.charAt(0) == '+'){
            flag = 1;
        }else if (((int)s.charAt(0)) <= 48 && ((int)s.charAt(0)) >= 57){  // 不是以数字开头
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        if (flag == 0) {  //没有符号
            for (char aChar : chars) {
                int m = (int) aChar;
                if (m >= 48 && m <= 57) {  // 判断是否为数字
                    sb.append(aChar);
                } else {
                    break;
                }
            }
        } else {  // 有符号
            for (int i = 1; i < chars.length; i++) {
                int m = (int) chars[i];
                if (m >= 48 && m <= 57) {  // 判断是否为数字
                    sb.append(chars[i]);
                } else {
                    break;
                }
            }
        }

        String s1 = sb.toString();

        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0') {
                j++;
                if (j == s1.length()) {
                    return 0;
                }
            } else {
                s1 = s1.substring(i, s1.length());
                break;
            }
        }

        if (s1.length() == 0) {
            return 0;
        }

        if (s1.length() > 10) {  // 2^31 = 2,147,483,648
            if (flag == 0 || flag == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        long c = Long.parseLong(s1);

        if (flag == 0 || flag == 1) {
            if (c > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int)c;
            }
        } else {
            if (-c < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int)-c;
            }
        }
    }


    public String intToIp(long ip){
        StringBuilder sb=new StringBuilder();
        sb.append(ip>>>24);
        sb.append(".");
        sb.append(String.valueOf((ip&0x00FFFFFF)>>>16));
        sb.append(".");
        sb.append(String.valueOf((ip&0x0000FFFF)>>>8));
        sb.append(".");
        sb.append(String.valueOf(ip&0x000000FF));
        return sb.toString();
    }
}
