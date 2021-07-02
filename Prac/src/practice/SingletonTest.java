package practice;

class Singleton{
	private static Singleton one;
	private Singleton(){}
	
	public static Singleton getinstance(){
		if(one==null){
			one = new Singleton();
		}
		return one;
	}

}
public class SingletonTest {
	public static void main(String[] args) {
        Singleton singleton1 = Singleton.getinstance();
        Singleton singleton2 = Singleton.getinstance();
        System.out.println(singleton1 == singleton2);

	}

}
