package practice;

public class Lion extends Predator implements Barkable{
	public String getFood(){
		return "gogi";
	}
	public void bark(){
		System.out.println("으으으으ㅡ르르ㅡ");
	}
}
