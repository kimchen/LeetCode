package kimchen.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
	public ValidParentheses(){
		String s = "{}{}{{{}}}(())(({{}()}))";
		System.out.println(isValid(s));
	}
	public boolean isValid(String s) {
		List<Character> list = new ArrayList<Character>();
		char[] chars = s.toCharArray();
		for(char c : chars){
			if(c == '{' || c == '[' || c == '('){
				list.add(c);
			}else if(c == '}'){
				if(list.size()==0)
					return false;
				if(list.get(list.size() - 1) != '{')
					return false;
				list.remove(list.size() - 1);
			}else if(c == ']'){
				if(list.size()==0)
					return false;
				if(list.get(list.size() - 1) != '[')
					return false;
				list.remove(list.size() - 1);
			}else if(c == ')'){
				if(list.size()==0)
					return false;
				if(list.get(list.size() - 1) != '(')
					return false;
				list.remove(list.size() - 1);
			}
		}
		if(list.size()>0)
			return false;
		return true;
    }
}
