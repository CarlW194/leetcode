package com.builder;

import com.linkedlist.ListNode;

import java.util.*;

public class LinkedListBuilder {

    public ListNode[] buildArrayLinkedList(){
        ListNode[] arrayLinkedLists = new ListNode[3];
        ListNode ln1 = new ListNode(1);
        ln1.next = new ListNode(4);
        ln1.next.next = new ListNode(5);
        arrayLinkedLists[0] = ln1;
        ListNode ln2 = new ListNode(1);
        ln2.next = new ListNode(3);
        ln2.next.next = new ListNode(4);
        arrayLinkedLists[1] = ln2;
        ListNode ln3 = new ListNode(2);
        ln3.next = new ListNode(6);
        arrayLinkedLists[2] = ln3;
        return arrayLinkedLists;
    }

    public ArrayList<ListNode> buildTwoLinkedList(int[] arr1, int[] arr2){
        ListNode ln1 = new ListNode(arr1[0]);
        ln1.next = new ListNode(arr1[1]);
        ln1.next.next = new ListNode(arr1[2]);

        ListNode ln2 = new ListNode(arr2[0]);
        ln2.next = new ListNode(arr2[1]);
        ln2.next.next = new ListNode(arr2[2]);

        return new ArrayList<>(List.of(ln1, ln2));
    }

    public ListNode buildLinkedList(int[] arr1){
        ListNode ln1 = new ListNode(arr1[0]);
        ln1.next = new ListNode(arr1[1]);
        ln1.next.next = new ListNode(arr1[2]);
        ln1.next.next.next = new ListNode(arr1[3]);

        return ln1;
    }
}
