package exercise;

import java.util.Scanner;

public class Exercise5_13 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j = 0; j < 5; j++) {
				int ranIndex = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[ranIndex];
				question[ranIndex] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하시오. ",i+1, new String(question));
			
			String answer = scan.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
