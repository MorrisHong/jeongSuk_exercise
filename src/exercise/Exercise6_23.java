package exercise;

import java.util.Arrays;

public class Exercise6_23 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,611,7,8,10,321};	//611�� ���� ū ��.
		int[] arr2 = {23,1,345,888, 9990, 1000}; //9990�� ���� ū ��.
		
		int result = max(arr);
		System.out.println(Arrays.toString(arr)+"�� ���� ū ���� "+result+" �Դϴ�.");
		
		result = max(arr2);
		System.out.println(Arrays.toString(arr2)+"�� ���� ū ���� "+result+" �Դϴ�.");
		
		
		System.out.println("null�� ��� �ִ밪 : "+max(null));
		System.out.println("���̰� 0�� ��� �ִ밪 : "+max(new int[] {}));
		
		
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
