package exercise;

public class Exercise6_24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "�� ���밪 : "+abs(value));
		value = -10;
		System.out.println(value + "�� ���밪 : "+abs(value));
	}
	
	static int abs(int value) {
		return value < 0 ? value * -1 : value;
	}
}
