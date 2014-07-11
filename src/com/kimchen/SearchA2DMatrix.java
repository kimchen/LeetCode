package com.kimchen;

public class SearchA2DMatrix {
	public SearchA2DMatrix(){
		int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(searchMatrix(a,3));
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		int index1 = -1;
        for(int i = 0;i<matrix.length;i++){
        	if(matrix[i][0] == target)
        		return true;
        	if(matrix[i][0] > target){
        		if(i == 0)
        			return false;
        		index1 = i-1;
        		break;
        	}
        }
        if(index1 < 0){
        	index1 = matrix.length -1;
        }
        for(int i = 0;i<matrix[index1].length;i++){
        	if(matrix[index1][i] == target)
        		return true;
        }
        return false;
        
    }
}
