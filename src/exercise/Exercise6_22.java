package exercise;

public class Exercise6_22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		String str2 = "12o33";
		System.out.println(str2+"는 숫자입니까? "+isNumber(str2));
	}
	
	static boolean isNumber(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!(ch >= '1' && ch <='9')){
				return false;
			}
		}
		return true;
	}
}
