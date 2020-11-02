package cn.com.walle;

public class RomanToInteger {
	
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	
	public static int romanToInt(String s) {
		int sum = 0;
		for(int i = s.length()-1 ; i>=0 ; ) {
			if(i>0) {
				if("CM".equals(s.substring(i-1, i+1))) {
					sum += 900;
					i = i-2;
					continue;
				}
				if("CD".equals(s.substring(i-1,i+1))) {
					sum += 400;
					i = i-2;
					continue;
				}
				if("XC".equals(s.substring(i-1,i+1))) {
					sum += 90;
					i = i-2;
					continue;
				}
				if("XL".equals(s.substring(i-1,i+1))) {
					sum += 40;
					i = i-2;
					continue;
				}
				if("IX".equals(s.substring(i-1,i+1))) {
					sum += 9;
					i = i-2;
					continue;
				}
				if("IV".equals(s.substring(i-1,i+1))) {
					sum += 4;
					i = i-2;
					continue;
				}
			}
			
			if('I'==s.charAt(i)) {
				sum += 1;
				i--;
				continue;
			}
			if('V'==s.charAt(i)) {
				sum += 5;
				i--;
				continue;
			}
			if('X'==s.charAt(i)) {
				sum += 10;
				i--;
				continue;
			}
			if('L'==s.charAt(i)) {
				sum += 50;
				i--;
				continue;
			}
			if('C'==s.charAt(i)) {
				sum += 100;
				i--;
				continue;
			}
			if('D'==s.charAt(i)) {
				sum += 500;
				i--;
				continue;
			}
			if('M'==s.charAt(i)) {
				sum += 1000;
				i--;
				continue;
			}
			
			
		}
		
		return sum;

    }

}
