package exercise;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public int getChannel(){
		return channel;
	}
	public int getVolume(){
		return volume;

	}
	public void setChannel(int a){
		prevchannel = channel;
		if(MIN_CHANNEL <= a && MAX_CHANNEL>=a)
			channel = a;
	}
	public void setVolume(int a){
		if(MIN_VOLUME <= a && MAX_VOLUME>=a)
			volume = a;
		
	}
	public void gotoPrevChannel(){
		int temp = channel;
		channel =  prevchannel; // 현재 채널에 이전채널값 대입.
		prevchannel = temp;
		
	}
}

public class Excercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());


	}

}
