package JaJung;

import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("두자리 정수를 입력해주세요");
		
		String input = a.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : "+input);
		System.out.printf("num = %d%n", num);
	}

}
