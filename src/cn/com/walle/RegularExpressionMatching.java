package cn.com.walle;


public class RegularExpressionMatching {
	
	public static void main(String[] args) {
		
		//System.out.println(isMatch("missippi", "mis*is*p*."));
		
	}
	
	
	
//	public static boolean isMatch(String s, String p) {
//		boolean many = false;
//		int pn = p.length()-1,sn = s.length()-1;
//		//char now = p.charAt(pn);
//		while(pn>=0) {
//			if(pn<0||sn<0) return false;
//			if(s.charAt(sn)==p.charAt(pn)||p.charAt(pn)=='.') {
//				sn--;
//				if(!many)
//					pn--;
//				continue;
//			}else if(many&&s.charAt(sn)==p.charAt(pn-1)) {
//				sn--;
//				pn--;
//				many=false;
//				pn--;
//				continue;
//			}else if(pn>0&&p.charAt(pn-1)=='*') {
//				pn=pn-2;
//				many = true;
//				continue;
//			}
//			if(pn>=0&&p.charAt(pn)=='*') {
//				many = true;
//				pn--;
//				continue;
//			}
//			break;
//		}
//		return (sn==0)?true:false;
//    }
	
	class Solution {
	    public boolean isMatch(String s, String p) {
	        int m = s.length();
	        int n = p.length();

	        boolean[][] f = new boolean[m + 1][n + 1];
	        f[0][0] = true;
	        for (int i = 0; i <= m; ++i) {
	            for (int j = 1; j <= n; ++j) {
	                if (p.charAt(j - 1) == '*') {
	                    f[i][j] = f[i][j - 2];
	                    if (matches(s, p, i, j - 1)) {
	                        f[i][j] = f[i][j] || f[i - 1][j];
	                    }
	                }
	                else {
	                    if (matches(s, p, i, j)) {
	                        f[i][j] = f[i - 1][j - 1];
	                    }
	                }
	            }
	        }
	        return f[m][n];
	    }

	    public boolean matches(String s, String p, int i, int j) {
	        if (i == 0) {
	            return false;
	        }
	        if (p.charAt(j - 1) == '.') {
	            return true;
	        }
	        return s.charAt(i - 1) == p.charAt(j - 1);
	    }
	}


}
