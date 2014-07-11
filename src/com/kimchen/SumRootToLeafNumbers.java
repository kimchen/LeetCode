package com.kimchen;

public class SumRootToLeafNumbers {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public class Solution {
		int ans = 0;
	    public int sumNumbers(TreeNode root) {
	    	recursive(root);
	    	return ans;
	    }
	    public int recursive(TreeNode node){
	    	int res = 0;
	    	if(node == null)
	    		return 0;
	    	if(node.left == null && node.right == null){
	    		ans += node.val;
	    		return 1;
	    	}
	    	if(node.left != null){
	    		res += recursive(node.left) * 10;
	    	}
	    	if(node.right != null){
	    		res += recursive(node.right) * 10;
	    	}
	    	ans += node.val * res;
	    	return res;
	    }
	}
}
