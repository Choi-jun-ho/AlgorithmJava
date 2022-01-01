// 알람
package level01_10.lv02_if.q05_alarm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int minute = h*60+m; // 총 분을 저장하는 변수
		int value; // 결과를 계산하는 변수
		
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
