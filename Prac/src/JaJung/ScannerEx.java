package JaJung;

import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���ڸ� ������ �Է����ּ���");
		
		String input = a.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է³��� : "+input);
		System.out.printf("num = %d%n", num);
	}

}
