package level11_20.lv12_Sort.q1_n2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

// 버블 정렬 ver3
public class ShakerSort {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Random random = new Random();
	
	public static int[] numbers;
	
	public static int N = 100000; // 배열의 수
	
	public static int T = 1; // 평균을 구하기 위한 반복 횟수 
	
	public static long compareN = 0; // 비교 횟수
	public static long exchangeN = 0; // 교환 횟수
	
	public static long beforeTime = 0;
	public static long afterTime = 0;
	public static double time = 0;
	
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		for (int t = 1; t <= T; t++) {
			random.setSeed(N);
			
			for (int i = 0; i < N; i++) {
				//numbers[i] = Integer.parseInt(br.readLine());
				numbers[i] = random.nextInt(N+1);
			}
			
			beforeTime = System.currentTimeMillis();
			sort();
			afterTime = System.currentTimeMillis();
			time += afterTime - beforeTime;
		}

		check();
		info();
		bw.close();
		
	}
	
	public static void sort() {
		
		int left = 0;
		int right = N -1;
		int last = right;
		
		while (left < right) {
			for (int j = right; j > left ;j--) {
				compareN++;
				if (numbers[j - 1] > numbers[j]) {
					swapNumbers(j, j-1);
					last = j;
				}
			}
			
			left = last;
			
			for (int j = left; j < right ;j++) {
				compareN++;
				if ( numbers[j] > numbers[j + 1]) {
					swapNumbers(j, j+1);
					last = j;
				}
			}
			
			right = last;
			
		}
		
	}
	 
	public static void swapNumbers(int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
		exchangeN++;
	}
	
	public static void info() throws IOException {
		
		bw.write("배열의 수 : " + N + "\n");
		
		if (T > 1) 
			bw.write("반복 횟수 : " + T + "\n");
		
		bw.write("걸린 시간 : " + time/T/1000.0 + "s\n");
		bw.write("비교 횟수 : " + compareN/T + "\n");
		bw.write("교환 횟수 : " + exchangeN/T + "\n");
		
		bw.flush();
	}
	
	public static void printNumbers() throws IOException {
				
		for (int i = 0; i < N; i++) { 
			bw.write(String.valueOf(numbers[i]) + " "); 
			if (i % 1000 == 0) { 
				bw.write("\n"); 
			} 
		}
		bw.write("\n");
		
		bw.flush();
	}
	
	public static void check() throws IOException {
		
		boolean checks = true;
		
		for (int i = 0; i < N-1; i++) {
			if (numbers[i] > numbers[i+1]) {
				checks = false;
			}
			if (!checks) {
				break;
			}
		}
		
		if (checks) {
			bw.write("성공!\n");
		} else {
			bw.write("실패...\n");
		}
		
		bw.flush();
		
		
	}

}
