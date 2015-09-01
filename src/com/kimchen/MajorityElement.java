/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimchen;

import java.util.Hashtable;

/**
 *
 * @author chenk
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int x = 0;
        for (int num : nums) {
            if(count == 0){
                x = num;
                count ++;
            }else if(x == num){
                count ++;
            }else{
                count --;
                if(count == 0){
                    x = num;
                    count ++;
                }
            }
        }
        return x;
    }
}
