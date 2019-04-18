package exercise;

public class Exercise6_1 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard(3, false);
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(int num, boolean isKwang){
		if(num >=1 && num <= 10) {
			this.num = num;
			this.isKwang = isKwang;
		}else {
			return;
		}
	}
	SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	String info() {
		String info = num + (isKwang == true ? "K" : "");
		return info;
	}
}
