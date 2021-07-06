package practice;

class TV{
	String color;
	boolean power;
	int channel;
	
	void power(){power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

public class TvTest {

	public static void main(String[] args) {
		TV t;
		t = new TV();
		t.channel = 7;
		t.channelDown();
		System.out.println("현 재 채널은"+t.channel+"입니다");

	}

}
