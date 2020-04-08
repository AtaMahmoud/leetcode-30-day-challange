package com.codewithata.weektwo;

public class MiddleOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode first=head;
        ListNode second=head;

        while (first.next!=null&&first.next.next!=null){
            first=first.next.next;
            second=second.next;
        }

        if(first.next==null)
            return second;
        else
            return second.next;
    }
}
