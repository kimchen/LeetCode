package com.kimchen;

import java.util.HashSet;

public class FirstMissingPositive {
	public FirstMissingPositive(){
		int[] A = {1,1};
		System.out.println(firstMissingPositive(A));
	}
	HashSet<Integer> set = new HashSet<Integer>();
	public int firstMissingPositive(int[] A) {
		int maxNum = 0;
        for(int i=0;i<A.length;i++){
        	if(A[i] < 0)
        		continue;
        	if(!set.contains(A[i]))
        		set.add(A[i]);
        	if(A[i] > maxNum)
        		maxNum = A[i];
        }
        
        for(int i=1;i<=maxNum;i++){
        	if(!set.contains(i))
        		return i;
        }
        return maxNum + 1;
    }
}
