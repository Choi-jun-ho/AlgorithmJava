package level01_10.lv02_if.q02_test_score;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
