package exercise;

public class Excercise7_19 {

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

	void buy(Product p){
		if(p.price > money)
			return;
		money -= p.price;
		add(p);
			
	}
	void add(Product p){
		if(i>=cart.length){
			Product[]rcart = new Product[6];
			for(int i=0; i<cart.length; i++){
				rcart[i] = cart[i];
			}
			cart = rcart;
		}
		cart[i] = p;
		i++;
	}
	
	void summary(){
		int sum = 0;
		for(int i=0; i<cart.length; i++){
			System.out.println(cart[i]);
			  sum+=cart[i].price;
		}
		System.out.println(sum);
		System.out.println(money);
	}
}

class Product {
	int price; // 제품의 가격
	Product(int price) {
	this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
