package JaJung;

public class ExceptionEx17 {

	public static void main(String[] args) {
		try{
			method1();
		}catch(Exception e){
			System.out.println("main method에서 예외를 처리햇어!");
		}
	}

	static void method1() throws Exception{
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println("method1method에서 예외를 처리했어!");
			throw e;
		}
	}
}
