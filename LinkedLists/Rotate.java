//Problem: right shift the linked nodes till k
//link: https://leetcode.com/problems/rotate-list/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(61)
//Topics: Linked List
//Diff: Med - done

import java.util.List;

public class Rotate {
    public static ListNode rotateRight(ListNode head, int k) {
        //Time: best
        //Space: Best
        ListNode last= head;int len = 1;
        while (last.next != null) {
            len++;
            last = last.next;
        }
        System.out.println("len:"+len);
        last.next = head;
        len = len*(k/len + 1);
        System.out.println("lenafter:"+len);
        for (int i = 0; i < len-k; i++) {
            head = head.next;
            last = last.next;
        }
        last.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode res = rotateRight(head,3);
        System.out.println(res.val);
    }
}

