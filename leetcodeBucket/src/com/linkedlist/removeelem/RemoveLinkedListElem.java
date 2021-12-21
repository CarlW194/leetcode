package com.linkedlist.removeelem;
import com.linkedlist.ListNode;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 104].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 *
 */
public class RemoveLinkedListElem {
    public ListNode removeElements(ListNode head, int val) {
        if(head != null){
            if(head.val == val){
                head = removeElements(head.next, val);
            }else{
                head.next = removeElements(head.next, val);
            }
        }
        return head;
    }
}