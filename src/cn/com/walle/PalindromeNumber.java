package cn.com.walle;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(46456));
	}
	
	public static boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		int x2 = x;
		int sum = 0;
		while(x/10!=0) {
    		sum = sum*10+x%10;
    		x = x/10;
    	}
		sum = sum*10+x;
		System.out.println(sum);
		return (x2==sum);
    }
}
