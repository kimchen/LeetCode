package com.kimchen;

public class LongestPalindromicSubstring {
	public LongestPalindromicSubstring(){
		System.out.println(longestPalindrome("hgjfjiowerinvwewewropeporewldjpopjdh"));
	}
	public String oriString = "";
	public String longestPalindrome(String s) {
		oriString = s;
		String resString = "";
		String tempString = "";
		if(s.length() == 1 )
			resString = s;
		for(int i = 0;i<s.length();i++){
			if(i + 1 < s.length()){
				if(s.charAt(i) == s.charAt(i+1)){
					tempString = checkSubString(i,i+1);
					if(tempString.length() > resString.length()){
						resString = tempString;
					}
				}
				if(i - 1 >= 0){
					if(s.charAt(i-1) == s.charAt(i+1)){
						tempString = checkSubString(i-1,i+1);
						if(tempString.length() > resString.length()){
							resString = tempString;
						}
					}
				}
			}
		}
		return resString;
    }
	
	private String checkSubString(int start,int end){
		if(start - 1 >= 0 && end + 1 < oriString.length()){
			if(oriString.charAt(start - 1) == oriString.charAt(end + 1)){
				return checkSubString(start - 1,end + 1);
			}
		}
		return oriString.substring(start, end+1);
	}
}
