package com.dianxinyun.exam;

public class Q2 {
    public static void main(String[] args) {
        help();
    }


    public static void help() {
        for (int i = 0; i <= 9; i++) {
            int a = i;
            for (int j = 0; j <= 9; j++) {
                int b = j;
                for (int k = 0; k <= 9; k++) {
                    int c = k;
                    for (int l = 0; l <= 9; l++) {
                        int d = l;
                        StringBuilder sb1 = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        int num1 = Integer.parseInt((sb1.append(a).append(b).append(c).append(d)).toString());
                        int num2 = Integer.parseInt((sb2.append(b).append(c).append(d).append(a)).toString());
                        if (num1 + num2 == 8888) {
                            System.out.println(a +" "+ b +" "+ c +" "+ d);
                        }
                    }
                }
            }
        }
    }
}
