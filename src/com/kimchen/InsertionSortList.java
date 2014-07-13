package kimchen.leetcode;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		for(ListNode i = head;i!=null;i=i.next){
			for(ListNode j = i.next;j!=null;j=j.next){
				if(i.val > j.val){
					int temp = i.val;
					i.val = j.val;
					j.val = temp;
//					i.val^=j.val^=i.val^=j.val;
				}
			}
		}
		return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
