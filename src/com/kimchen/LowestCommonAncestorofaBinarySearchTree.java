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
public class LowestCommonAncestorofaBinarySearchTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public LowestCommonAncestorofaBinarySearchTree(){
            TreeNode node0 = new TreeNode(0);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            TreeNode node4 = new TreeNode(4);
            TreeNode node5 = new TreeNode(5);
            TreeNode node6 = new TreeNode(6);
            TreeNode node7 = new TreeNode(7);
            TreeNode node8 = new TreeNode(8);
            TreeNode node9 = new TreeNode(9);
            
            node6.left = node2;
            node6.right = node8;
            node2.left = node0;
            node2.right = node4;
            node4.left = node3;
            node4.right = node5;
            node8.left = node7;
            node8.right = node9;
            
            System.out.println(lowestCommonAncestor(node6,node2,node4).val);
        }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == p || root == q)
                return root;
            if((root.left == p && root.right == q) || (root.right == p && root.left == q))
                return root;
            TreeNode leftTopNode = null;
            TreeNode rightTopNode = null;
            if(root.left != null){
                leftTopNode = lowestCommonAncestor(root.left,p,q);
            }
            if(root.right != null){
                rightTopNode = lowestCommonAncestor(root.right,p,q);
            }
            if(leftTopNode != null && rightTopNode != null)
                return root;
            else if(rightTopNode != null)
                return rightTopNode;
            else if(leftTopNode != null)
                return leftTopNode;
            else 
                return null;
        }
}
