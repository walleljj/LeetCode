package cn.com.walle;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));

	}

	public static int maxArea(int[] height) {
		int start = 0, end = height.length - 1, max = 0;
		while (start < end) {
			max = height[start] < height[end] ? Math.max(max, (end - start) * height[start++]) : Math.max(max, (end - start) * height[end--]);
		}
		return max;
	}

}
