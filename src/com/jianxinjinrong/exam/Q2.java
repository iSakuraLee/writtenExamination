package com.jianxinjinrong.exam;

public class Q2 {
    int[][] matrix;

    public static void main(String[] args) {

    }

    public int findFriendNum(int[][] M) {
        // write code here
        int count = 0;
        matrix = M;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    block(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void block(int i, int j) {
        matrix[i][j] = -1;
        if (i < matrix.length - 1 && matrix[i + 1][j] == 1) {
            block(i + 1, j);
        }
        if (i > 0 && matrix[i - 1][j] == 1) {
            block(i - 1, j);
        }
        if (j < matrix[i].length - 1 && matrix[i][j + 1] == 1) {
            block(i, j + 1);
        }
        if (j > 0 && matrix[i][j - 1] == 1) {
            block(i, j - 1);
        }
    }
}
