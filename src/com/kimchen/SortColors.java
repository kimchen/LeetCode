package com.kimchen;

public class SortColors {
	public SortColors(){
		int[] A = {0,2,1,2,0,2,2,1,1,1,1,0,0,2};
		sortColors(A);
		System.out.println(A);
	}
	public void sortColors(int[] A) {
        int index0 = 0,index1 = 0,index2 = 0;
        for(int i =0;i<A.length;i++){
        	if(A[i] == 0){
        		A[index2]=2;
        		index2++;
        		A[index1]=1;
        		index1++;
        		A[index0]=0;
        		index0++;
        	}else if(A[i] == 1){
        		A[index2]=2;
        		index2++;
        		A[index1]=1;
        		index1++;
        	}else if(A[i] == 2){
        		A[index2]=2;
        		index2++;
        	}
        }
    }
}
