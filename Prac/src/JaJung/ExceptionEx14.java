package JaJung;

public class ExceptionEx14 {

	public static void main(String[] args) {
		try{
			method1();
		}catch (Exception e){
			System.out.println("mainmethod���� ����ó�� �Ϸ�.");
			e.printStackTrace();
		}

	}
	static void method1() throws Exception{
		throw new Exception();
	}

}
