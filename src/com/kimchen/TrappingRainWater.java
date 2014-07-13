package kimchen.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {
	public TrappingRainWater(){
		int a[] = {4,2,3};
		System.out.println(trap(a));
	}
	public int trap(int[] A) {
		int res = 0;
		int max = 0;
		for(int a : A){
			if(a > max)
				max = a;
		}
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> numList = new ArrayList<List<Integer>>();
		list.add(0);
		for(int i = 0;i<A.length;i++){
			if(A[i]==max)
				list.add(i);
		}
		list.add(A.length-1);
		for(int i = 0;i<list.size() - 1 ;i++){
			if(list.get(i)==list.get(i+1)){
				numList.add(new ArrayList<Integer>());
				continue;
			}
			List<Integer> temp = new ArrayList<Integer>();
			for(int j = list.get(i) ; j <=list.get(i+1) ; j++){
				temp.add(j);
			}
			numList.add(temp);
		}
		for(int i = 0 ; i < numList.size() ; i++){
			List<Integer> temp = numList.get(i);
			if(i == 0){
				int tempMax = 0;
				for(int j = 0;j<temp.size();j++){
					int index = temp.get(j);
					if(A[index]>tempMax){
						tempMax = A[index];
					}else{
						res += tempMax - A[index];
					}
				}
			}else if(i ==  numList.size()-1){
				int tempMax = 0;
				for(int j = temp.size()-1;j>=0;j--){
					int index = temp.get(j);
					if(A[index]>tempMax){
						tempMax = A[index];
					}else{
						res += tempMax - A[index];
					}
				}
			}else{
				for(int a : temp){
					res += max - A[a];
				}
			}
		}	
		return res;
    }
}
