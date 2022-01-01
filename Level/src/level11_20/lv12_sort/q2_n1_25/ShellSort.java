package level11_20.lv12_Sort.q2_n1_25;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

// 버블 정렬 ver3
public class ShellSort {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Random random = new Random();
	
	public static int[] numbers;
	
	public static int N = 1000000000; // 배열의 수
	
	public static long beforeTime = 0;
	public static long afterTime = 0;
	public static double time = 0;
	
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		random.setSeed(N);
		
		for (int i = 0; i < N; i++) {
			//numbers[i] = Integer.parseInt(br.readLine());
			numbers[i] = random.nextInt(N+1);
		}
		
		beforeTime = System.currentTimeMillis();
		sort();
		afterTime = System.currentTimeMillis();
		time += afterTime - beforeTime;

		check();
		info();
		
		//printNumbers();
		bw.close();
		
	}
	
	public static void sort() throws IOException {
		
		int h = 1;
		while (h < N/9) {
			h = h * 3 + 1;
		}
		
		while (h >0) {
			for (int i = h; i < N; i++) {
				int j = i - h;
				int tmp = numbers[i];
				while (j >= 0 && numbers[j] > tmp) {
					numbers[j+h] = numbers[j];
					j -= h;
				}
				numbers[j+h] = tmp;
			}
			h /= 3;
		}
		
	}
	
	public static void printNumbers() throws IOException {
		
		for (int i = 0; i < N; i++) { 
			bw.write(String.valueOf(numbers[i]) + "\n"); 
		}
		
		bw.flush();
	}
	 	
	public static void info() throws IOException {
		
		bw.write("배열의 수 : " + N + "\n");
				
		bw.write("걸린 시간 : " + time/1000.0 + "s\n");
		
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
