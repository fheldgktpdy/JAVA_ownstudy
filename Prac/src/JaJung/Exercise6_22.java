package JaJung;

public class Exercise6_22 {
	
	static boolean isNumber(String str){
		if(str==null || str=="")
			return false;
		for(int i=0; i<str.length(); i++){
			char k = str.charAt(i);
			if(k<'0'||k>'9')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" �� �����Դϱ�? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+" �� �����Դϱ�? "+isNumber(str)); 

	}

}
