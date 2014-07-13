package kimchen.leetcode;

public class ImplementstrStr {
	public String strStr(String haystack, String needle) {
        if(!haystack.contains(needle))
        	return null;
        return haystack.substring(haystack.indexOf(needle));
    }
}
