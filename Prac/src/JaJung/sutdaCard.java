package JaJung;

public class sutdaCard {
	public static void main(String args[]){
		sutda card1 = new sutda(3,false);
		sutda card2 = new sutda();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class sutda{
	int num;
	boolean isKwang;
	
	sutda(int a, boolean b){
		num = a;
		isKwang = b;
	}
	sutda(){
		this(1,true);
	}
	
	String info(){
		if(isKwang==true)
			return(num+"K");
		else
			return(num+"");
	}
}
