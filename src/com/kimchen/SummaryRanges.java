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
public class SummaryRanges {
    public SummaryRanges(){
        int[] nums = {-2147483648,-2147483647,2147483647};
        System.out.println(summaryRanges(nums));
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> resList = new ArrayList<>();
        long start = 0;
        long end = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(i==0){
                start = temp;
                flag = true;
            }else if(temp-end>1){
                if(start == end)
                    resList.add(start+"");
                else
                    resList.add(start + "->" + end);
                start = temp;
            }
            end = temp;
        }
        if(flag){
            if(start == end)
                resList.add(start+"");
            else
                resList.add(start + "->" + end);
        }
        return resList;
    }
}
