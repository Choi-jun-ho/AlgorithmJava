// �˶�
package level01_10.lv02_if.q05_alarm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int minute = h*60+m; // �� ���� �����ϴ� ����
		int value; // ����� ����ϴ� ����
		
		final int MAX_MINUTE = 24*60;
		
		if (minute >= 45) {
			value = minute - 45;
			
		} else {
			value = MAX_MINUTE + minute - 45;
		}
		
		alarm(value);
	}
	
	public static void alarm(int value) {
		int h = value / 60;
		int m = value - h*60;
		System.out.println(h + " " + m);
	}

}
