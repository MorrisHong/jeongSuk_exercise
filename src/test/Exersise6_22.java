package test;

public class Exersise6_22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println("str은 숫자입니까? "+isNumber(str));

		str = "123o";
		System.out.println("str은 숫자입니까? "+isNumber(null));
	}
	
	public static boolean isNumber(String str) {
		
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
