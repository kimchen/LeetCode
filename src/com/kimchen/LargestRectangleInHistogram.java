package com.kimchen;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LargestRectangleInHistogram {
	public LargestRectangleInHistogram(){
		System.out.println(largestRectangleArea(new int[]{0,0,0,0,0,0,0,0,2147483647}));
	}
	public int largestRectangleArea(int[] height) {
		Hashtable<Integer, List<Integer>> table=  new Hashtable<Integer, List<Integer>>();
		int maxHight = -1;
		for(int i = 0;i<height.length;i++){
			int temp = height[i];
			if(temp > maxHight)
				maxHight = temp;
			if(table.containsKey(temp)){
				List<Integer> tempList = table.get(temp);
				tempList.add(i);
			}else{
				List<Integer> tempList = new ArrayList<Integer>();
				tempList.add(i);
				table.put(temp, tempList);
			}
		}
		
		int maxRes = 0;
		for(int i = maxHight ; i>=0 ; i--){
			List<Integer> tempList = table.get(i);
			int nowRes = 0;
			int lastIndex = -1;
			for(int j = 0 ; j<tempList.size() ; j++){
				int num = tempList.get(j);
				int lowRow = i-1;
				while(!table.containsKey(lowRow)){
					if(table.containsKey(lowRow)){
						List<Integer> tempList2 = table.get(lowRow);
						boolean tempB = false;
						for(int k=0;k<tempList2.size();k++){
							if(tempList2.get(k)>num){
								tempList2.add(k,num);
								tempB = true;
								break;
							}
						}
						if(!tempB)
							tempList2.add(num);
					}
				}
				if(lastIndex == -1 || num == lastIndex+1){
					nowRes += i;
				}else{
					nowRes = i;
				}
				if(nowRes > maxRes)
					maxRes = nowRes;
				lastIndex = num;
				
			}
		}
		return maxRes;
        
    }
}
