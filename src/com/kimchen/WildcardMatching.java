package com.kimchen;

public class WildcardMatching {
	public WildcardMatching(){
		System.out.println(isMatch("aabaaaaaaaa","*a*b*b"));
	}
	public boolean isMatch(String s, String p) {
		boolean res = true;
        if(s.contains("*")){
        	String[] ss = s.split("*");
        	for(String sss : ss){
        		res &= isMatch(sss,p);
        	}
        }
		
		
		if(s.equals("*") || p.equals("*"))
			return true;
		else if(s.equals("") && p.equals(""))
			return true;
		else if(s.equals("") || p.equals(""))
			return false;
		else if(s.length() == 1 && p.length() ==1){
			if(s.equals(p) || s.equals("?") || p.equals("?"))
				return true;
			return false;
		} 
		for(int i = 0;i<s.length();i++){
			char sc = s.charAt(i);
			for(int j=0;j<p.length();j++){
				char pc = p.charAt(j);
				if(sc == pc){
					res |= (isMatch(s.substring(0, i),p.substring(0, j)) & isMatch(s.substring(i+1, s.length()),p.substring(j+1, p.length())));
				}
			}
		}
		
		return res;
    }
}
