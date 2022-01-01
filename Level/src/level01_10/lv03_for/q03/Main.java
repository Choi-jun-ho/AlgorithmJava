package level01_10.lv03_for.q03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 1~ 10 = 11*10/2
		int result = (n+1)*n/2;
		System.out.println(result);
	}

}
