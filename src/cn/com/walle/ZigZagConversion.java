package cn.com.walle;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String convert = s.convert("LEETCODEISHIRING", 3);
		System.out.println(convert);
	}

}

class Solution2 {
    public String convert(String s, int numRows) {
    	if(numRows==1) {
    		return s;
    	}
    	StringBuilder[] stra = new StringBuilder[numRows];
    	for(int i = 0 ; i<numRows ; i++) {
    		stra[i] = new StringBuilder();
    	}
    	stra[0].append(s.charAt(0));
    	int count = 0;
    	boolean flag = true;
    	for(int i = 1 ; i<s.length() ; i++) {
    		if(count==numRows-1) {
    			flag = false;
    		}
    		if(count==0) {
    			flag = true;
    		}
    		if(flag) {
    			stra[++count].append(s.charAt(i) );
    		}else {
    			stra[--count].append(s.charAt(i) ) ;
    		}
    	}
    	for(int i = 1 ; i<numRows ; i++) {
    		stra[0].append(stra[i]);
    	}
    	return stra[0].toString();
    }
}