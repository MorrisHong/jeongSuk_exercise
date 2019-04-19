package exercise;

import java.util.Arrays;

public class Exercise6_23 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,611,7,8,10,321};	//611이 가장 큰 값.
		int[] arr2 = {23,1,345,888, 9990, 1000}; //9990이 가장 큰 값.
		
		int result = max(arr);
		System.out.println(Arrays.toString(arr)+"의 가장 큰 값은 "+result+" 입니다.");
		
		result = max(arr2);
		System.out.println(Arrays.toString(arr2)+"의 가장 큰 값은 "+result+" 입니다.");
		
		
		System.out.println("null일 경우 최대값 : "+max(null));
		System.out.println("길이가 0일 경우 최대값 : "+max(new int[] {}));
		
		
	}
	static int max(int[] arr) {
		if(arr == null || arr.length == 0 ) {
			return -9999999;
		}
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
