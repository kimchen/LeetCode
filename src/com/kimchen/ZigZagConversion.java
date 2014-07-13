package kimchen.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	public ZigZagConversion(){
		System.out.println(convert("PAYPALISHIRING",3));
	}
	public String convert(String s, int nRows) {
		String res = "";
		char[] chars = s.toCharArray();
		int count = nRows-2;
		if(count<0)
			count = 0;
		int index = 0;
		List<Character[]> lists = new ArrayList<Character[]>();
		for(int i=0;i<chars.length;i++){
			Character[] cs = new Character[nRows];
			int temp = index%count;
			if(temp == 0){
				for(int j=0;j<nRows;j++){
					if(i+j < chars.length)
						cs[j] = chars[i+j];
				}
				i+=nRows-1;
			}else{
				cs[nRows-1-temp] = chars[i];
			}
			lists.add(cs);
			index++;
		}
		for(int i=0;i<nRows;i++){
			for(Character[] cs : lists){
				if(cs[i] != null && cs[i] != ' '){
					res += cs[i];
				}
			}
		}
		return res;
    }
}
