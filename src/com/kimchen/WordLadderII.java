package com.kimchen;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadderII {
	public WordLadderII(){
		Set<String> s = new HashSet<String>();
		s.add("hot");
		s.add("dot");
		s.add("mog");
		s.add("lot");
		s.add("log");
		findLadders("hit","cog",s);
	}
	private int strLen = 0;
	List<String> almostList = new ArrayList<String>();
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
		strLen = start.length();
		List<List<String>> nowLists = new ArrayList<List<String>>();
		List<String> subList = new ArrayList<String>();
		subList.add(start);
		nowLists.add(subList);
		for(String s : dict){
			if(checkValid(end,s)){
				almostList.add(s);
			}
		}
		for(String s : almostList){
			dict.remove(s);
		}
		List<List<String>> ansLists = find(end,dict,nowLists);
		return ansLists; 
    }
	private List<List<String>> find(String end, Set<String> dict, List<List<String>> nowLists){
		List<List<String>> ansLists = new ArrayList<List<String>>();
		for(List<String> subList : nowLists){
			String nowStr = subList.get(subList.size()-1);
			if(checkValid(nowStr,end)){
				List<String> temp = new ArrayList<String>(subList);
				temp.add(end);
				ansLists.add(temp);
			}
		}
		if(ansLists.size() > 0)
			return ansLists;
		
		for(List<String> subList : nowLists){
			String nowStr = subList.get(subList.size()-1);
			for(String s : almostList){
				if(checkValid(nowStr,s)){
					List<String> temp = new ArrayList<String>(subList);
					temp.add(s);
					ansLists.add(temp);
				}
			}
		}
		if(ansLists.size() > 0)
			return find(end,dict,ansLists);
		
		List<String> removeList = new ArrayList<String>();
		for(List<String> subList : nowLists){
			String nowStr = subList.get(subList.size()-1);
			for(String s : dict){
				if(checkValid(nowStr,s)){
					List<String> temp = new ArrayList<String>(subList);
					temp.add(s);
					removeList.add(s);
					ansLists.add(temp);
				}
			}	
		}
		for(String s : removeList){
			dict.remove(s);
		}
		if(ansLists.size() == 0)
			return ansLists;
		return find(end,dict,ansLists);
	}
	private boolean checkValid(String ori,String target){
		int count = 0;
		for(int i = 0;i < strLen;i++){		
			if(ori.charAt(i) != target.charAt(i))
				count++;
			if(count > 1)
				return false;
		}
		if(count==1)
			return true;
		return false;
	}
}
