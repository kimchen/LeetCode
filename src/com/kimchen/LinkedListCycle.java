package com.kimchen;

public class LinkedListCycle {
	
	class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) {
	    	val = x;
	        next = null;
	    }
	}
	
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	    	if(head == null || head.next == null)
	    		return false;
	    	if(head == head.next)
	    		return true;
	    	return checkCycle(head.next,head.next.next);
	    }
	    private boolean checkCycle(ListNode a,ListNode b){
	    	if(a == null || b == null || b.next == null)
	    		return false;
	    	if(a == b || a == b.next)
	    		return true;
	    	return checkCycle(a.next,b.next.next);
	    }
	}
}
