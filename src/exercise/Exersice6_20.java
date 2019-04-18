package exercise;

public class Exersice6_20 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}
	
	static int[] shuffle(int[] arr) {
		
		
		for(int i = 0; i < arr.length; i++) {
			int ranIndex = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[ranIndex];
			arr[ranIndex] = temp;
		}
		
		return arr;
	}
}
