package cn.com.walle;

public class IntegerToRoman {
	
	public static void main(String[] args) {
		System.out.println(intToRoman(3109));
	}
	
	
	//"MCMXCIV"1994
	//MCMXCIV
	
	//	I	1
	//	IV  4
	//	V	5
	//  IX  9
	//	X	10
	//	XL  40
	//	L	50
	//  XC  90
	//	C	100
	//  CD  400
	//	D	500
	//	CM  900
	//	M	1000
//	I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//	X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//	C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
	 public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int times = 0;
		if(num>=1000) {
			times = num/1000;
			for(int i = 0 ; i<times ; i++) {
				sb.append('M');
			}
			num = num%1000;
		}
		if(num>=900) {
			times = num/900;
			for(int i = 0 ; i<times ; i++) {
				sb.append("CM");
			}
			num = num%900;
		}
		if(num>=500) {
			times = num/500;
			for(int i = 0 ; i<times ; i++) {
				sb.append('D');
			}
			num = num%500;
		}
		if(num>=400) {
			times = num/400;
			for(int i = 0 ; i<times ; i++) {
				sb.append("CD");
			}
			num = num%400;
		}
		if(num>=100) {
			times = num/100;
			for(int i = 0 ; i<times ; i++) {
				sb.append('C');
			}
			num = num%100;
		}
		if(num>=90) {
			times = num/90;
			for(int i = 0 ; i<times ; i++) {
				sb.append("XC");
			}
			num = num%90;
		}
		if(num>=50) {
			times = num/50;
			for(int i = 0 ; i<times ; i++) {
				sb.append('L');
			}
			num = num%50;
		}
		if(num>=40) {
			times = num/40;
			for(int i = 0 ; i<times ; i++) {
				sb.append("XL");
			}
			num = num%40;
		}
		if(num>=10) {
			times = num/10;
			for(int i = 0 ; i<times ; i++) {
				sb.append("X");
			}
			num = num%10;
		}

		if(num>=9) {
			times = num/9;
			for(int i = 0 ; i<times ; i++) {
				sb.append("IX");
			}
			num = num%9;
		}

		if(num>=5) {
			times = num/5;
			for(int i = 0 ; i<times ; i++) {
				sb.append("V");
			}
			num = num%5;
		}

		if(num>=4) {
			times = num/4;
			for(int i = 0 ; i<times ; i++) {
				sb.append("IV");
			}
			num = num%4;
		}

		if(num>=1) {
			times = num/1;
			for(int i = 0 ; i<times ; i++) {
				sb.append("I");
			}
		}

		
		 
		 
		 return sb.toString();
	 }

}
