package com.linkedlist.mergetwosortedlists;
import com.linkedlist.ListNode;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 *
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return merged(l1, l2);
    }

    private ListNode merged(ListNode l1, ListNode l2){
        ListNode mergedList = null;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            mergedList = l1;
            mergedList.next = merged(l1.next, l2);
        }else{
            mergedList = l2;
            mergedList.next = merged(l1, l2.next);
        }
        return mergedList;
    }
}