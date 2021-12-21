package com.linkedlist.palindrome;
import com.linkedlist.ListNode;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 *
 */
public class Palindrome {
    private ListNode outside;

    public boolean isPalindrome(ListNode head) {
        outside = head;
        return reverse(head);
    }

    private boolean reverse(ListNode head){
        if(head != null){
            if(!reverse(head.next)){
                return false;
            }
            if(head.val != outside.val){
                return false;
            }
            outside = outside.next;
        }
        return true;
    }

}