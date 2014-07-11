package com.kimchen;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public PascalsTriangleII(){
		System.out.println(getRow(8));
	}
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
        	temp = new ArrayList<Integer>(result);
        	result.clear();
        	for(int j=0;j<=i;j++){
        		if(j == 0 || j == i)
        			result.add(1);
        		else{
        			result.add(temp.get(j-1) + temp.get(j));
        		}
        	}
        }
		return result;
    }
}
