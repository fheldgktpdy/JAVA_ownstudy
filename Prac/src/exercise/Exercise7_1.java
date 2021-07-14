package exercise;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {//1부터 10까지 2장씩, 1,3,8 한장씩은 K붙이기.
		for(int i=1; i<=CARD_NUM; i++){
			if(i<=10){
				if(i==1 || i==3 || i==8)
					cards[i-1] = new SutdaCard(i,true);
				else
					cards[i-1] = new SutdaCard(i,false);
			}
			else
				cards[i-1] = new SutdaCard(i-10,false);
		}
	}
	void shuffle(){
		for(int i=0; i<cards.length; i++){
			int j = (int)(Math.random()*CARD_NUM);
			SutdaCard tmp = cards[j];
			cards[j] = cards[i];
			cards[i] = tmp;
		}
	}
	SutdaCard pick(int index){
		return cards[index];
	}
	SutdaCard pick(){
		int j = (int)(Math.random()*CARD_NUM);
		return cards[j];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
	this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
	}

	public String toString() {
	return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();

		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
