//Problem: return the linkedList having sum of other 2 linked list;
//link: https://leetcode.com/problems/add-two-numbers/
//Source: LeetCode(2)
//Topics: Linked List
//Diff: - Med - done by solution

public class TwoNumberSum {
    static ListNode naive(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        ListNode prev = temp;
        int carry = 0, sum = 0;
        while (l1 != null || l2 != null || carry!=0) {
            sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            temp.val = sum%10;
            temp.next = new ListNode();
            prev = temp;
            temp = temp.next;
            System.out.println();
        }
        prev.next = null;
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode h1 = l1;
        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(5);
        ListNode h2 = l2;
        ListNode res = naive(l1, l2);
        ListNode h3 = res;
        while (h1 != null) {
            System.out.print(h1.val+"->");
            h1 = h1.next;
        }
        System.out.println();
        while (h2 != null) {
            System.out.print(h2.val+"->");
            h2 = h2.next;
        }
        System.out.println();
        while (h3 != null) {
            System.out.print(h3.val+"->");
            h3 = h3.next;
        }
        System.out.println();
    }
}
