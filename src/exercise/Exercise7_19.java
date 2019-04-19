package exercise;

import java.util.Arrays;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if (p.price > money) {
			System.out.println("�ܾ��� �����Ͽ� " + p.getClass().getSimpleName() + "��/�� �� �� �����ϴ�.");
			return;
		}
		System.out.println(p.getClass().getSimpleName() + "����");
		money -= p.price;
		add(p);

	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] tmp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}

		cart[i] = p;
		i++;
	}

	void summary() {
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			sum += cart[i].price;
		}
		System.out.println("��ٱ��� : " + Arrays.toString(cart));
		System.out.println("�� ���� : " + sum);
		System.out.println("�ܾ� : " + money);
	}
}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {

	Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Audio";
	}
}
