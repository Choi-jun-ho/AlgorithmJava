package level01_10.lv01_input_output_arithmetic.q10_remainder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*(A+B)%C�� ((A%C) + (B%C))%C �� ������?
		  (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
		  �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println( (a+b) % c);
		System.out.println( ((a%c) + (b%c)) % c);
		System.out.println( (a*b) % c);
		System.out.println( ((a%c) * (b%c)) % c);
	}
}
