package JaJung;

public class BlockTest {
	static{
		System.out.println("static {}");
	}//class initialization
	
	{
		System.out.println("{}");
	}//instance initialization
	
	public BlockTest(){
		System.out.println("»ý¼ºÀÚ");
	}
	public static void main(String args[]){
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		
	}
	
}

