package com.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode listNode = removeNthFromEnd(node1, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        if (list.size() == 1 && n == 1) {
            return null;
        }

        list.remove(list.size() - n);

        if (list.size() == 1) {
            return new ListNode(list.get(0).val);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (i == list.size() - 2) {
                list.get(i).next = new ListNode(list.get(i + 1).val);
                continue;
            }
            list.get(i).next = list.get(i + 1);
        }

        return list.get(0);
    }
}


class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}