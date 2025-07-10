//Problem: add the 2 numbers given in the linked lists
//link: https://leetcode.com/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(2)
//Topics: HashMap
//Diff: Easy

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int l1Size = 0, l2size = 0;
//        ListNode temp1 = l1, temp2 = l2;
//        while (temp1 != null) {
//            l1Size++;
//            temp1 = temp1.next;
//        }while (temp2 != null) {
//            l2size++;
//            temp2 = temp2.next;
//        }
//        ArrayList<Integer> sums = new ArrayList<>();
//        for (int i = 0; i < Math.min(l1Size, l2size); i++) {
//            if (l1 == null && l2 == null) {
//                break;
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        ListNode trial = new ListNode(5);
//        ListNode tr = trial;
//        trial = trial.next;
//        trial = new ListNode(4);
//        System.out.println(trial.val);
//    }
//}
//
//
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
