package com.kimchen;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	public SingleNumber(){
		int[] a = new int[]{2,2,1,1,0,3,3,4,4};
		singleNumber(a);
	}
	private List<Integer> list = new ArrayList<Integer>();
	public int singleNumber(int[] A) {
        for(int i=0;i<A.length;i++){
        	boolean result = true;
        	if(list.contains(i))
        		continue;
        	for(int j=i+1;j<A.length;j++){
        		if(A[i] == A[j]){
        			result = false;
        			list.add(j);
        			break;
        		}
        	}
        	if(result){
        		return A[i];
        	}
        }
        return 0;
    }
}
