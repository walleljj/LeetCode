package cn.com.walle;

public class ReverseInteger {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.reverse(-153423));
		
	}
	

}

class Solution3 {
    public int reverse(int x) {
    	int sum = 0;
    	while(x/10!=0) {
    		sum = sum*10+x%10;
    		x = x/10;
    	}
    	if(sum*10L+x>Integer.MAX_VALUE||sum*10L+x<Integer.MIN_VALUE) {
    		return 0;
    	}
    	return sum*10+x;
    }
}