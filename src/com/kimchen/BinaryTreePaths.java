/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimchen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenk
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resList = new ArrayList<>();
        if(root == null)
            return resList;
        if(root.left != null){
            List<String> list = binaryTreePaths(root.left);
            for (String str : list) {
                resList.add(root.val + "->" + str);
            }
        }
        if(root.right != null){
            List<String> list = binaryTreePaths(root.right);
            for (String str : list) {
                resList.add(root.val + "->" + str);
            }
        }
        if(resList.isEmpty())
            resList.add(root.val + "");
        return resList;
    }
}

// * Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
