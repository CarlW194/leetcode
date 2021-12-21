package com.linkedlist.reverse;
import com.linkedlist.ListNode;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head != null){
            if(head.next == null){ // end of the line
                return head;
            }
            ListNode newNode = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newNode;
        }
        return head;
    }

}
