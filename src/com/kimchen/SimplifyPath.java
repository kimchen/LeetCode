package com.kimchen;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
	public SimplifyPath(){
		System.out.println(simplifyPath("/../.././"));
	}
	
	public String simplifyPath(String path) {
		List<String> list = new ArrayList<String>();
        String[] paths = path.split("/");
        for(int i = 0;i<paths.length;i++){
        	String temp = paths[i];
        	if(temp.equals("") || temp.equals("."))
        		continue;
        	else if(temp.equals("..")){
        		if(list.size() > 0){
        			list.remove(list.size() - 1);
        		}
        	}else{
        		list.add(temp);
        	}
        }
        
        String res = "";
        for(String str : list){
        	res += "/" + str;
        }
        if(res.equals(""))
        	res = "/";
        return res;
    }
}
