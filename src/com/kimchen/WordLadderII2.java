package com.kimchen;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class WordLadderII2 {
	public WordLadderII2(){
		Set<String> s = new HashSet<String>();
		s.add("hot");
		s.add("dot");
		s.add("mog");
		s.add("lot");
		s.add("log");
		findLadders("hit","cog",s);
	}
	
	private int strLen = 0;
	private String endStr = "";
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
		strLen = start.length();
		endStr = end;
		List<List<String>> frontLists = new ArrayList<List<String>>();
		List<String> subList = new ArrayList<String>();
		subList.add(start);
		frontLists.add(subList);
		List<List<String>> ansLists = find(dict,frontLists);
		return ansLists; 
    }
	private List<List<String>> find(Set<String> dict, List<List<String>> frontLists){
		List<List<String>> ansLists = new ArrayList<List<String>>();
		for(List<String> frontList : frontLists){
			String frontStr = frontList.get(frontList.size()-1);
			if(checkValid(frontStr, endStr)){
				List<String> tempList = new ArrayList<String>(frontList);
				tempList.add(endStr);
				ansLists.add(tempList);
			}
		}
		if(ansLists.size() > 0)
			return ansLists;
		
		List<String> removeList = new ArrayList<String>();
		for(List<String> subList : frontLists){
			String nowStr = subList.get(subList.size()-1);
			for(int i = 0;i<strLen;i++){
				char[] temp = nowStr.toCharArray();
				for(char c = 'a' ; c <= 'z' ; c++){
					temp[i] = c;
					String tempStr = new String(temp);
					if(dict.contains(tempStr)){
						List<String> tempList = new ArrayList<String>(subList);
						tempList.add(tempStr);
						ansLists.add(tempList);
						removeList.add(tempStr);
					}
				}
			}
		}
		for(String s : removeList){
			dict.remove(s);
		}
		if(ansLists.size() == 0)
			return ansLists;
		return find(dict,ansLists);
	}
	private boolean checkValid(String ori,String target){
		int count = 0;
		for(int i = 0;i < strLen;i++){		
			if(ori.charAt(i) != target.charAt(i))
				count++;
			if(count > 1){
				return false;
			}			
		}
		if(count==1)
			return true;
		return false;
	}
}
