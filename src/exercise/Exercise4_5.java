package exercise;

public class Exercise4_5 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		while(i <= 10) {
			while(j <= i) {
				j++;
				System.out.print("*");
			}
			i++;
			j=0;
			System.out.println();
		}
	}
}
