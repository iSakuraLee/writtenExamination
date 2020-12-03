package com.tiger.exam;

public class Q1 {
    int len = 0;

    public static void main(String[] args) {
        String[][] map = {
                {"S", "."},
                {"#","T"}};

        int rs = new Q1().maze(map);
        System.out.println(rs);

    }

    public int maze (String[][] maps) {
        // write code here
        int x = 0;
        int y = 0;
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }

        boolean[][] flag = new boolean[maps.length][maps[0].length];

        if (help(maps.length, maps[0].length, x, y, maps, flag)) {
            return len;
        }
        return -1;
    }


    public boolean help(int n, int m, int i, int j, String[][] matrix, boolean[][] flag) {
        len = 0;
        if (i < 0 || i >= n || j < 0 || j >= m || matrix[i][j].equals("#") || flag[i][j]) {
            return false;
        }

        if (matrix[i][j].equals("T")) {
            return true;
        }
        len++;

        flag[i][j] = true;

        if(help(n, m, i - 1, j, matrix, flag)
                || help(n, m, i + 1, j, matrix, flag)
                || help(n, m, i, j - 1, matrix, flag)
                || help(n, m, i, j + 1, matrix, flag)) {
            len++;
            return true;
        }

        flag[i][j] = false;
        len--;
        return false;
    }
}
