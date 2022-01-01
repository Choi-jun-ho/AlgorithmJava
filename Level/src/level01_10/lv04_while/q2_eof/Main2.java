package level01_10.lv04_while.q2_eof;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		}
		
		scanner.close();
	}

}
