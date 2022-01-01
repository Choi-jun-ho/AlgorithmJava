package level01_10.lv01_input_output_arithmetic.q11_multiplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = Integer.parseInt(scanner.nextLine());
		
		String b = scanner.nextLine();
		
		String[] array_word = b.split(""); 
				
		for (int i = array_word.length-1; i >= 0; i--) {
			System.out.println(a*Integer.parseInt(array_word[i]));
		}
		
		System.out.print(a*Integer.parseInt(b));
		
	}

}

