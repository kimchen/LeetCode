package com.kimchen;

public class MinimumWindowSubstring {
	public MinimumWindowSubstring(){
		System.out.println(minWindow("ADOBECODEBANCAASBADohwuifiBSHBFHWUHUIABABUIWFUIWHFWUFHFUIBBC","AHFSU"));
	}
	private String oriString = "";
	private boolean needCheck = true;
	private int nextCheckIndex = 0;
	public String minWindow(String S, String T) {
		oriString = S;
		int resStart = 0;
		int resEnd = S.length();
		boolean hasRes = false;
		
        for(int i = 0;i<S.length();){
        	if(!needCheck)
        		continue;
        	if(i != nextCheckIndex)
        		continue;
        	nextCheckIndex = -1;
        	needCheck = false;
        	int tempStart = i;
        	int tempEnd = checkSubString(tempStart,S.length(),T);
        	if(tempEnd != -1 && tempEnd - tempStart < resEnd - resStart){
        		hasRes = true;
        		resStart = tempStart;
        		resEnd = tempEnd;
        	}
        	if(nextCheckIndex == -1)
        		break;
        	else{
        		i = nextCheckIndex;
        	}
        }
        if(hasRes){
        	return oriString.substring(resStart, resEnd);
        }else {
        	return "";
        }
    }
	
	public int checkSubString(int start,int end,String T){
		if(T.equals(""))
			return start + 1;
		for(int i = start;i<end;i++){
			char tempC = oriString.charAt(i);
			if(T.contains(tempC + "")){
				if(needCheck && nextCheckIndex == -1){
					nextCheckIndex = i;
				}
        		String tempT = T.replaceAll(tempC + "", "");
        		return checkSubString(i,end,tempT);
        	}else{
        		needCheck = true;
        	}
		}
		return -1;
	}
}
