package com.bilibili.exam;

/*
面值1元、4元、16元、64元共计4种硬币，以及面值1024的纸币。
现在小Y使用1024的纸币购买了一件价值为N(0<N<=1024)的商品，请问最少他会受到多少硬币。
 */
public class Q03 {

    public int GetCoinCount(int N) {
        // write code here
        int num1, num2, num3, num4;
        num1 = (1024 - N) / 64;
        num2 = ((1024 - N) % 64) / 16;
        num3 = (((1024 - N) % 64) % 16) / 4;
        num4 = (1024 - N) - (num1 * 64 + num2 * 16 + num3 * 4);
        return num1 + num2 + num3 + num4;
    }

}