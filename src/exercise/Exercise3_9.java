package exercise;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ? true : false;
	
		System.out.println(b);
	}
}
