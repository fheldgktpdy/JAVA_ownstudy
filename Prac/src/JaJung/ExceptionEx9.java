package JaJung;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try{
			throw new Exception("���� �߻�!");
		}catch(Exception e){
			System.out.println("�����޼��� : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷���������!");

	}

}
