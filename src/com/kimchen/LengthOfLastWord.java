package kimchen.leetcode;

public class LengthOfLastWord {
	public LengthOfLastWord(){
		
	}
	
	public int lengthOfLastWord(String s) {
		String[] ss = s.split(" ");
		if(ss.length == 0)
			return 0;
		return ss[ss.length-1].length();
    }
}
