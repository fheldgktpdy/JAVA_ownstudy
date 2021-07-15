package JaJung;

class Gold{
	String kind;
	int number;
	
	Gold(){
		this("SPADE",1);
	}
	Gold(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public  String toString(){
		return "kind : " + kind + ", number : " + number;
	}
}



public class CardToString {

	public static void main(String[] args) {
		Gold c1 = new Gold();
		Gold c2 = new Gold("HEART",10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
