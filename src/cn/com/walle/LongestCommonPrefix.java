package cn.com.walle;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"adsf"}));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs==null||strs.length==0){
            return "";
        }
        int i ;
		A: for(i = 0 ; i<strs[0].length() ; i++) {
			char c = strs[0].charAt(i);
			for (String s : strs) {
				if(s==null||s.length()-1<i||c!=s.charAt(i))
					break A;
			}
		}
		return strs[0].substring(0,i);
    }

}
