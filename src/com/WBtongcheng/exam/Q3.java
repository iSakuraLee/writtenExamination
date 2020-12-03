package com.WBtongcheng.exam;

import java.util.ArrayList;

public class Q3 {
    ArrayList<Integer> pre = new ArrayList<>();
    ArrayList<Integer> mid = new ArrayList<>();
    ArrayList<Integer> post = new ArrayList<>();

    public static void main(String[] args) {

    }


    public ArrayList<ArrayList<Integer>> binaryTreeScan(int[] input) {
        // write code here
        if (input == null || input.length == 0) {
            return new ArrayList<ArrayList<Integer>>();
        }

        ArrayList<Integer> prelist = preOrder(0, input);
        ArrayList<Integer> midlist = midOrder(0, input);
        ArrayList<Integer> postlist = postOrder(0, input);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(prelist);
        res.add(midlist);
        res.add(postlist);

        return res;

    }


    private ArrayList<Integer> preOrder(int index, int[] input) {
        if (input[index] != -1) {
            pre.add(input[index]);
            if ((index * 2 + 1) < input.length) {
                preOrder(2 * index + 1, input);
            }
            if ((index * 2 + 2) < input.length) {
                preOrder(2 * index + 2, input);
            }
        }

        return pre;
    }

    private ArrayList<Integer> midOrder(int index, int[] input) {
        if (input[index] != -1) {

            if ((index * 2 + 1) < input.length) {
                midOrder(2 * index + 1, input);
            }

            mid.add(input[index]);

            if ((index * 2 + 2) < input.length) {
                midOrder(2 * index + 2, input);
            }
        }

        return mid;
    }

    private ArrayList<Integer> postOrder(int index, int[] input) {
        if (input[index] != -1) {

            if ((index * 2 + 1) < input.length) {
                postOrder(2 * index + 1, input);
            }

            if ((index * 2 + 2) < input.length) {
                postOrder(2 * index + 2, input);
            }

            post.add(input[index]);
        }

        return post;
    }
}
