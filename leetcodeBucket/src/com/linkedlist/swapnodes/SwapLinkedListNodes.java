package com.linkedlist.swapnodes;
import com.linkedlist.ListNode;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * Example 2:
 *
 * Input: head = []
 * Output: []
 * Example 3:
 *
 * Input: head = [1]
 * Output: [1]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 *
 */
public class SwapLinkedListNodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode result = new ListNode(-1);
        result.next = head; // reference original
        ListNode prev = result;

        while(head != null && head.next != null){
            ListNode one = head; // 1
            ListNode two = head.next; // 2 3 4

            prev.next = two;
            one.next = two.next;
            two.next = one;

            prev = one;
            head = one.next;
        }
        return result.next;
    }
}