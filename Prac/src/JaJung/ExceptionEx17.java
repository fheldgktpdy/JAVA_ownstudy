package JaJung;

public class ExceptionEx17 {

	public static void main(String[] args) {
		try{
			method1();
		}catch(Exception e){
			System.out.println("main method���� ���ܸ� ó���޾�!");
		}
	}

	static void method1() throws Exception{
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println("method1method���� ���ܸ� ó���߾�!");
			throw e;
		}
	}
}
