package com.kimchen;

public class ReverseInteger {
	public int reverse(int x) {
        boolean isNegative = false;
		if(x<0){
			isNegative = true;
			x = -x;
		}
		int res = 0;
		while(x > 0){
			int temp = x%10;
			res = res*10 + temp;
			x = x/10;
		}
		if(isNegative)
			res = -res;
		return res;
    }
}
