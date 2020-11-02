package cn.com.walle;

public class PalindromicString {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str = solution.longestPalindrome("aacabdkacaa");
		System.out.println(str);
	}
	
	
	

}

class Solution {
	//动态规划实现
    public String longestPalindrome(String s) {
    	int[][] arr= new int[s.length()][s.length()];
    	
    	int max = 1,start = 0,end = 0;
    	for(int i = 0 ; i<s.length()-1; i++) {
    		//初始化数组，
    		//单个字符（数组对角线）认为是回文字符串，长度为1
    		//相邻两个字符一定不是回文字符串
    		arr[i][i] = 1;
    		if(s.charAt(i+1)==s.charAt(i)) {
    			arr[i+1][i]=2;
    			if(max<=arr[i+1][i]) {
					max = arr[i+1][i];
					start = i;
					end = i+1;
				}
    			
    		}else
    			arr[i+1][i]=0;
    	}
    	for(int i = 0 ; i<s.length()-2 ; i++) {//控制层数
    		for(int j = 0 ; j+i<s.length()-2 ; j++) {
    			
    			if(s.charAt(j+i+2)==s.charAt(j)) {
    				arr[j+i+2][j] = arr[i+j+1][j+1]!=0?arr[i+j+1][j+1]+2:0;
    				if(max<=arr[j+i+2][j]) {
    					max = arr[j+i+2][j];
    					start = j;
    					end = j+i+2;
    				}
    			}else
    				arr[j+i+2][j] = 0;
    		}
    	}
    	
    	
    	
    	
    	
    	
    	for(int i = 0 ; i<s.length() ; i++) {
    		for(int j = 0 ; j<s.length() ; j++) {
    			System.out.print(arr[i][j]+"  ");
    		}
    		System.out.println();
    	}
    	
    	
    	System.out.println(max+"|"+start+"|"+end);
    	
    	
    	
    	return s.substring(start, end+1);
    }
}