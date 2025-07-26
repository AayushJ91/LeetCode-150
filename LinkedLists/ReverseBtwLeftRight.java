//Problem: Reverse the linked list between the position left and right;
//link: https://leetcode.com/problems/reverse-linked-list-ii/
//Source: LeetCode (92)
//Topics: Linked List
//Diff: Med

import java.util.ArrayList;
import java.util.List;

public class ReverseBtwLeftRight {
    //0ms, 100;
    //41.13 MB, 83.12;
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        List<Integer> st = new ArrayList<>();
        ListNode iter = head;
        ListNode LeftNode = head;
        int pos = 1;
        while (iter != null) {
            if (pos == left) {
                LeftNode = iter;
                break;
            }
            pos++;
            iter = iter.next;
        }
        while (iter != null) {
            if (pos == right) {
                st.add(iter.val);
                break;
            }
            pos++;
            st.add(iter.val);
            iter = iter.next;
        }
        iter = LeftNode;
        while (!st.isEmpty()) {
            iter.val = st.removeLast();
            iter = iter.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        System.out.println(reverseBetween(head, 1, 1).val);
    }
}
