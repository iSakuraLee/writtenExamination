package com.sougou.exam;

public class Q3 {
    public static void main(String[] args) {

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
    public long getPasswordCount (String password) {
        // write code here
        for (int i = 0; i < 9; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            for (int j = 1; j < password.length(); j++) {
                String num = password.charAt(j) + "";
                int l = Integer.parseInt(num);
                if ((l + i) % 2 == 0) {
                    sb.append((l + i) % 2);
                }
            }
        }

        return -1;
    }


    private int help(String password){

        return -1;
    }
}
