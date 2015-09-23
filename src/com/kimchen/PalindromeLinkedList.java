/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimchen;

/**
 *
 * @author chenk
 */
public class PalindromeLinkedList {
    public PalindromeLinkedList(){
        int[] list = new int[]{1,3,3,1,6,6,7,6,6,1,3,3,1};
        
        ListNode head = null;
        ListNode now = null;
        for (int m : list) {
            if(head == null){
                head = new ListNode(m);
                now = head;
            }
            else{
                now.next = new ListNode(m);
                now = now.next;
            }
                
        }
        
        System.out.println(isPalindrome(head));
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fNode = head;
        ListNode sNode = head;
        while(fNode != null && fNode.next != null){
            fNode = fNode.next.next;
            sNode = sNode.next;
        }
        if(fNode != null)
            sNode = sNode.next;
        
        ListNode preNode = null;
        ListNode nextNode = null;
        while(sNode!=null){
            nextNode = sNode.next;
            sNode.next = preNode;
            preNode = sNode;
            sNode = nextNode;
        }
        
        fNode = head;
        sNode = preNode;   
        while(sNode!=null){
            if(fNode.val != sNode.val)
                return false;
            fNode = fNode.next;
            sNode = sNode.next;
            
        }
        return true;
    }
}
