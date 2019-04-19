package test;

import java.util.Arrays;

public class Exercise6_23 {
	static int max(int[] numArr) {
	
		if(numArr == null || numArr.length == 0) {
			return -999999;
		}
		
		int max = numArr[0];
		
		
		
		for(int i = 0; i < numArr.length; i++) {
			
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] data = { 3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : "+max(data));
		System.out.println("최대값 : "+max(null));
		System.out.println("최대값 : "+max(new int[] {}));
	}
}
